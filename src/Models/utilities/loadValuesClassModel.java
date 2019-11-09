
package Models.utilities;

import Class.valuesClassifications;
import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class loadValuesClassModel {
   public static  ArrayList <valuesClassifications> valuesClass=new ArrayList ();

        //public static void main (String[] args) {
          //  loadValues();
        //}
    
    public static void loadValues(){
       
        String sql;
        try{

            sql="select * from clasificaciones";
            
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            int id;
            while(rs.next()) {
               
                 id=Integer.parseInt(rs.getString("id"));
     
             
                 if(id!=0){
                       valuesClassifications obj1=new valuesClassifications();
                     obj1.setId(id);
                 obj1.setVa1(Double.parseDouble(rs.getString("factor1")));
                 obj1.setVa2(Double.parseDouble(rs.getString("factor2")));
                 obj1.setVa3(Double.parseDouble(rs.getString("factor3")));
                 obj1.setVa4(Double.parseDouble(rs.getString("factor4")));
                 obj1.setVa5( Double.parseDouble(rs.getString("factor5")));
                 valuesClass.add(obj1);
                 cont++;
 
                 }
                             }
            
            System.out.println("contador"+cont);
            for (valuesClassifications temp: valuesClass) { //Uso de for extendido
             System.out.println( "   "+temp.getId());
           //newValCla(temp.getId());
           queryUpdateClassification(temp.getId(), temp.getVa1(), temp.getVa2(),temp.getVa3(),temp.getVa4(),temp.getVa5());
        

        }
            
        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error fatal en la busqueda descriptiva de las clasificaciones\n"+e.getMessage());
            System.out.println(e.getMessage());
        }
    
    }
    
     public static void newValCla(int id){
        try{
            String sql="SELECT MAX(idvaclasi)+1 FROM VALCLASI";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            if(rs.next()) {
                int idval=rs.getInt(1);
               String sql2="insert into VALCLASI (idvaclasi,cval1,cval2,cval3,cval4,cval5,CIDVALOR01) values("+idval+",0,0,0,0,0,"+id+")";
                ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                Statement stmt2 = c2.getCon().createStatement();
               int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    System.out.println("no se hizo nada");
                }else{
                    System.out.println("exito");
                               }
                c2.closeCon();
            }else{
                MainMenu.MDebugger("Error grave");
                JOptionPane.showMessageDialog(null,"Error al seleccionar el id de los valores de las clasificaciones");
            }
            
        c.closeCon();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
     
     
     public static void queryUpdateClassification(int id, double v1, double v2,double v3,double v4,double v5){


        
        try{
            
            String sql2="update VALCLASI set cval1="+v1+",cval2="+v2+",cval3="+v3+",cval4="+v4+",cval5="+v5+" where cidvalor01="+id+"";
            ConnectionModel c2=new ConnectionModel();
            c2.getCon();
            Statement stmt2 = c2.getCon().createStatement();
            int rs2 = stmt2.executeUpdate(sql2);
            if(rs2==0) {
                System.out.println("no exito");
            }else{
                System.out.println("exito");
            }
            c2.closeCon();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   
    
}
