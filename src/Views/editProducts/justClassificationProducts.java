
package Views.editProducts;

import Class.charger;
import Class.valuesClassificationsProducts;
import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xavier
 */
public class justClassificationProducts extends javax.swing.JDialog {
    private final DefaultTableModel model;
    private double percentage;
    int idclass=0;
    int contResults=0;
    List lista=new ArrayList();
    public justClassificationProducts(java.awt.Frame parent, boolean modal,int idclass,double percentage) {
        super(parent, modal);
        initComponents();
        this.idclass=idclass;
        this.percentage=percentage;
        this.model = (DefaultTableModel) TClassPro.getModel();
        methodsearch();
        
        
        addWindowListener(new java.awt.event.WindowAdapter(){

        @Override
        public void windowOpened(java.awt.event.WindowEvent evt){
            System.out.println("abierto");
            if(contResults==0){
               methodCheck();
            }
        }

        @Override
        public void windowClosing(java.awt.event.WindowEvent evt){
            System.out.println("cerrado");
        }

        @Override
        public void windowActivated(java.awt.event.WindowEvent evt){
            System.out.println("activado");
        }
  
        });
    }
    
    public void methodCheck(){
         JOptionPane.showMessageDialog(rootPane,"Lo sentimos pero esta clasificacion no tiene productos enlazados");
            this.dispose();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogBar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        barProduct = new javax.swing.JProgressBar();
        tagNo = new javax.swing.JLabel();
        closev = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TClassPro = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();

        dialogBar.setBackground(new java.awt.Color(102, 255, 102));
        dialogBar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tagNo.setText("Actualizando producto 1 de ?");

        closev.setBackground(new java.awt.Color(51, 0, 102));
        closev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closev.setForeground(new java.awt.Color(255, 255, 255));
        closev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closev.setText("Aceptar");
        closev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closev.setOpaque(true);
        closev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closevMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tagNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closev, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(barProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagNo)
                    .addComponent(closev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        dialogBar.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 440, 180));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TClassPro.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        TClassPro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TClassPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nombre", "P. Nuevo 1", "P. Nuevo 2", "P. Nuevo 3", "P. Nuevo 4", "P. Nuevo 5", "Precio 1 ", "Precio 2", "Precio 3", "Precio 4", "Precio 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TClassPro.setGridColor(new java.awt.Color(255, 255, 255));
        TClassPro.setIntercellSpacing(new java.awt.Dimension(10, 1));
        TClassPro.setRowHeight(25);
        TClassPro.setSelectionBackground(new java.awt.Color(51, 0, 102));
        TClassPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TClassProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TClassPro);
        if (TClassPro.getColumnModel().getColumnCount() > 0) {
            TClassPro.getColumnModel().getColumn(0).setMinWidth(0);
            TClassPro.getColumnModel().getColumn(0).setPreferredWidth(0);
            TClassPro.getColumnModel().getColumn(0).setMaxWidth(0);
            TClassPro.getColumnModel().getColumn(1).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(1).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(1).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(3).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(3).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(3).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(4).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(4).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(4).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(5).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(5).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(5).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(6).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(6).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(6).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(7).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(7).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(7).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(8).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(8).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(8).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(9).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(9).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(9).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(10).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(10).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(10).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(11).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(11).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(11).setMaxWidth(70);
            TClassPro.getColumnModel().getColumn(12).setMinWidth(70);
            TClassPro.getColumnModel().getColumn(12).setPreferredWidth(70);
            TClassPro.getColumnModel().getColumn(12).setMaxWidth(70);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, 1200, 380));

        tagResults.setBackground(new java.awt.Color(153, 153, 153));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jPanel1.add(tagResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 450, 20));

        jLabel4.setBackground(new java.awt.Color(51, 0, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Imprimir tabla");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 200, 30));

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar todos los precios");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 30));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1190, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 60));

        cc.setText("vacio");
        jPanel1.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TClassProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TClassProMouseClicked
        //int i=TClassPro.getSelectedRow();
        //String code,name,p1,p2,p3,p4,p5,standar;
        //code=(String) TClassPro.getValueAt(i, 0);
        //code=code.trim();
        //name=(String) TClassPro.getValueAt(i, 1);
        //name=name.trim();
        //p1=String.valueOf(TClassPro.getValueAt(i, 2));
        //p2=String.valueOf(TClassPro.getValueAt(i, 3));
        //p3=String.valueOf(TClassPro.getValueAt(i, 4));
        //p4=String.valueOf(TClassPro.getValueAt(i, 5));
        //p5=String.valueOf(TClassPro.getValueAt(i, 6));
        //standar=String.valueOf(TClassPro.getValueAt(i, 7));
        //editProduct vEP=new editProduct(code,name,p1,p2,p3,p4,p5,standar);
        //vEP.setTitle("Productos");
        //vEP.setBounds(WIDTH, WIDTH, 770,409);
        //vEP.setLocationRelativeTo(vEP);
        //vEP.setResizable(false);
        //vEP.setVisible(true);

    }//GEN-LAST:event_TClassProMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try{
            MessageFormat header=new MessageFormat(" Reporte de nuevos precios");
            MessageFormat footer=new MessageFormat("Pagina {0,number,integer}");
            TClassPro.print(JTable.PrintMode.FIT_WIDTH, header, footer);
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       
        int resp = JOptionPane.showConfirmDialog(null, "Se actualizaran los precios, ¡Está seguro?"
                + "?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if(resp==0){
            
            charger up=new charger(barProduct,tagNo,closev,contResults);
            up.read(lista);
            up.execute();
            dialogBar.setLocationRelativeTo(null);
            dialogBar.setBounds(0, 0, 450, 200);
            dialogBar.setLocationRelativeTo(null);
            dialogBar.setModal(true);
            closev.setVisible(false);
            dialogBar.setVisible(true);
            this.dispose();

        }
        if(resp==1){
            System.out.println("no confirmo");
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    
    
    public void queryUpdateProducts(int id, String vs1,String  vs2,String vs3,String vs4,String vs5,String name){
        double value1,value2,value3,value4,value5;
        
        value1=Double.parseDouble(vs1);
                        value2=Double.parseDouble(vs2);
                        value3=Double.parseDouble(vs3);
                        value4=Double.parseDouble(vs4);
                        value5=Double.parseDouble(vs5);
                        System.out.println(vs1);
                        System.out.println(vs2);
                        System.out.println(vs3);
                        System.out.println(vs4);
                        System.out.println(vs5);
        
        
        try{
   
                 String sql2="update MGW10005 set CPRECIO1="+value1+",CPRECIO2="+value2+",CPRECIO3="+value3+",CPRECIO4="+value4+",CPRECIO5="+value5+" where cidprodu01="+id+"";
                ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                Statement stmt2 = c2.getCon().createStatement();
                int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    MainMenu.MDebugger("Error al guardar el producto");
                }else{
                  

                }
                c2.closeCon();
                                   
 
        }catch(SQLException e){
            MainMenu.MDebugger(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,"Error al guardar los datos de precios\nConsulte a carlitos"+e.getLocalizedMessage()+e.getMessage());
        }
    }
    

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void closevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closevMouseClicked
        dialogBar.dispose();
        this.dispose();
    }//GEN-LAST:event_closevMouseClicked

    private void closevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closevMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_closevMouseEntered

    private void closevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closevMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_closevMouseExited
    
      public void methodsearch(){

              String p1,p2,p3,p4,p5; 
              double pre1,pre2,pre3,pre4,pre5,pp;
        try{
            // String sql="select CCODIGOP01,CNOMBREP01,CPRECIO1,CPRECIO2,CPRECIO3,CPRECIO4,CPRECIO5,CCOSTOES01,CIDVALOR01 from MGW10005 order by CCODIGOP01 asc where CIDVALOR01="+idclass+"";
            String sql="select CIDPRODU01,CCODIGOP01,CNOMBREP01,CPRECIO1,CPRECIO2,CPRECIO3,CPRECIO4,CPRECIO5,CCOSTOES01,CIDVALOR01 from MGW10005 order by CCODIGOP01 asc where (CIDVALOR02="+idclass+" or CIDVALOR01="+idclass+" )";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            DecimalFormat o=new DecimalFormat("#.##");
            while(rs.next()) {    
                Object dato2[]={rs.getObject("CPRECIO1"),rs.getObject("CPRECIO2")
                          ,rs.getObject("CPRECIO3"),rs.getObject("CPRECIO4")
                        ,rs.getObject("CPRECIO5"),rs.getString("CIDPRODU01")
                        ,rs.getString("CCODIGOP01").trim(),rs.getObject("CNOMBREP01")};
  
                pre1=Double.parseDouble(String.valueOf(dato2[0]));
                pre2=Double.parseDouble(String.valueOf(dato2[1]));
                pre3=Double.parseDouble(String.valueOf(dato2[2]));
                pre4=Double.parseDouble(String.valueOf(dato2[3]));
                pre5=Double.parseDouble(String.valueOf(dato2[4]));
                pre1=pre1*percentage;
                pre2=pre2*percentage;
                pre3=pre3*percentage;
                pre4=pre4*percentage;
                pre5=pre5*percentage;                  
                p1=o.format(pre1);
                p2=o.format(pre2);
                p3=o.format(pre3);
                p4=o.format(pre4);
                p5=o.format(pre5);
                  
                pre1=Double.parseDouble(p1);
                pre2=Double.parseDouble(p2);
                pre3=Double.parseDouble(p3);
                pre4=Double.parseDouble(p4);
                pre5=Double.parseDouble(p5);
                
                valuesClassificationsProducts vT=new valuesClassificationsProducts
                    (Integer.parseInt(String.valueOf(dato2[5])),pre1,pre2,pre3,pre4,pre5);
                 lista.add(vT);
                
                Object dato[]={dato2[5],dato2[6],dato2[7],pre1,pre2,pre3,pre4,pre5,dato2[0],dato2[1],dato2[2],dato2[3],dato2[4]};
                model.addRow(dato);
                
                cont++;
            }
            contResults=cont;
            if(cont==0){
                tagResults.setText("Lo sentimos, escriba bien");
                MainMenu.MDebugger("Lo sentimos, escriba bien");
            }else{
                tagResults.setText("Se encontraron "+cont+" resultado(s)");
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
            }
            
        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error fatal en la busqueda\n"+e.getMessage());
            
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }

    
    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }
   private Color MorPre=new Color(254,254,254);
    private Color MorEnt=new Color(91,0,160);
    private Color MorExi=new Color(51,0,102);
    private Color MorTexExi=new Color(102,0,102);
    private Color Black=new Color(0,0,0);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TClassPro;
    private javax.swing.JProgressBar barProduct;
    public static javax.swing.JLabel cc;
    private javax.swing.JLabel closev;
    private javax.swing.JDialog dialogBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tagNo;
    private javax.swing.JLabel tagResults;
    // End of variables declaration//GEN-END:variables
}
