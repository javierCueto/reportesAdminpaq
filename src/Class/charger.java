
package Class;

import Models.ConnectionModel;
import Views.MainMenu;
import Views.editProducts.justClassificationProducts;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import static javax.management.Query.value;
import static javax.management.Query.value;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class charger extends SwingWorker<Integer, String>{
   
    private JProgressBar bar;
    private JLabel tag;
    private JLabel closebtn;

    public charger(JProgressBar bar, JLabel tag, JLabel closebtn, int totalUpdates) {
        this.bar = bar;
        this.tag = tag;
        this.closebtn = closebtn;
        this.totalUpdates = totalUpdates;
    }

    public JLabel getClosebtn() {
        return closebtn;
    }

    public void setClosebtn(JLabel closebtn) {
        this.closebtn = closebtn;
    }
    
    private List lista;
    private int totalUpdates;

    public charger(JProgressBar bar, JLabel tag, int totalUpdates) {
        this.bar = bar;
        this.tag = tag;
        this.totalUpdates = totalUpdates;
    }
    

    public charger(JProgressBar bar, JLabel tag) {
        this.bar = bar;
        this.tag = tag;
    }

    public JLabel getTag() {
        return tag;
    }

    public void setTag(JLabel tag) {
        this.tag = tag;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
     public void queryUpdateProducts(int id, double value1,double  value2,double value3,double value4,double value5){        
        try{
   
                 String sql2="update MGW10005 set CPRECIO1="+value1+",CPRECIO2="+value2+",CPRECIO3="+value3+",CPRECIO4="+value4+",CPRECIO5="+value5+" where cidprodu01="+id+"";
                ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                Statement stmt2 = c2.getCon().createStatement();
                int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    MainMenu.MDebugger("Error al guardar el producto");
                }else{
                  
                    cont++;

                    System.out.println("contador de update"+cont);
                }
                c2.closeCon();
                                   
 
        }catch(SQLException e){
            MainMenu.MDebugger(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,"Error al guardar los datos de precios\nConsulte a carlitos"+e.getLocalizedMessage()+e.getMessage());
        }
    }
   
    
    
    private int cont=0;

    public charger(JProgressBar bar) {
        this.bar = bar;
    }
    
    
    
    
    public void read(List lista){
        this.lista=lista;
    }
    
    @Override
    protected Integer doInBackground(){
        try {
             Iterator<valuesClassificationsProducts> Iterator = lista.iterator();
       int valuebar=0;
            System.out.println("total updates "+totalUpdates);
       double valuebar2=100/(Double.parseDouble(String.valueOf(totalUpdates)));
       double valuebar3;
        while(Iterator.hasNext()){
            
            // a cada iteracion se le asigna un conceptsvalues(xml leido)
            valuesClassificationsProducts v= Iterator.next();
            System.out.println("id del producto"+v.getId());
            
            queryUpdateProducts(v.getId(),v.getP1(),v.getP2(),v.getP3(),v.getP4(),v.getP5());
            valuebar3=valuebar2*cont;
            valuebar=(int) valuebar3;
            System.out.println("3-"+valuebar);
            getBar().setValue(valuebar);
            getTag().setText("Actualizacion "+cont+" de "+totalUpdates);
        }
        getTag().setText("Productos actualizados con exito");
        getClosebtn().setVisible(true);


            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        return 0;
    }

    
    
}
