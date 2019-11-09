
package Views.searches;

import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class standarSearchProducts extends javax.swing.JDialog {
    double cVal1;
    double cVal2;
    double cVal3;
    double cVal4;
    double cVal5;
 private final DefaultTableModel model;
    public standarSearchProducts(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.model = (DefaultTableModel) TSearchProSt.getModel();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSearchProSt = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Búsquedas de productos solo con costo estándar y clasificación");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1030, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        TSearchProSt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TSearchProSt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio 1", "Precio 2", "Precio 3", "Precio 4", "Precio 5", "Costo estándar", "Clasificación", "IDCla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TSearchProSt.setGridColor(new java.awt.Color(255, 255, 255));
        TSearchProSt.setRowHeight(25);
        TSearchProSt.setSelectionBackground(new java.awt.Color(51, 0, 102));
        TSearchProSt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSearchProStMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TSearchProSt);
        if (TSearchProSt.getColumnModel().getColumnCount() > 0) {
            TSearchProSt.getColumnModel().getColumn(0).setMinWidth(100);
            TSearchProSt.getColumnModel().getColumn(0).setMaxWidth(100);
            TSearchProSt.getColumnModel().getColumn(2).setMinWidth(70);
            TSearchProSt.getColumnModel().getColumn(2).setMaxWidth(70);
            TSearchProSt.getColumnModel().getColumn(3).setMinWidth(70);
            TSearchProSt.getColumnModel().getColumn(3).setMaxWidth(70);
            TSearchProSt.getColumnModel().getColumn(4).setMinWidth(70);
            TSearchProSt.getColumnModel().getColumn(4).setMaxWidth(70);
            TSearchProSt.getColumnModel().getColumn(5).setMinWidth(70);
            TSearchProSt.getColumnModel().getColumn(5).setMaxWidth(70);
            TSearchProSt.getColumnModel().getColumn(6).setMinWidth(70);
            TSearchProSt.getColumnModel().getColumn(6).setMaxWidth(70);
            TSearchProSt.getColumnModel().getColumn(7).setMinWidth(100);
            TSearchProSt.getColumnModel().getColumn(7).setMaxWidth(100);
            TSearchProSt.getColumnModel().getColumn(8).setMinWidth(100);
            TSearchProSt.getColumnModel().getColumn(8).setMaxWidth(100);
            TSearchProSt.getColumnModel().getColumn(9).setMinWidth(50);
            TSearchProSt.getColumnModel().getColumn(9).setMaxWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, 990, 290));

        tagResults.setBackground(new java.awt.Color(153, 153, 153));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jPanel1.add(tagResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 450, 20));

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 100, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TSearchProStMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSearchProStMouseClicked
        int i=TSearchProSt.getSelectedRow();
        String idProduct,idClassification,name,p1,p2,p3,p4,p5,standar;
       
        standar=String.valueOf(TSearchProSt.getValueAt(i, 7));
        idProduct=String.valueOf(TSearchProSt.getValueAt(i, 0));
        idClassification=String.valueOf(TSearchProSt.getValueAt(i, 9));
        idProduct=idProduct.trim();
        idClassification=idClassification.trim();
        double pre1;
        double pre2;
        double pre3;
        double pre4;
        double pre5;
        double costandar=Double.parseDouble(standar);
        if(queryValuesClassification(idClassification)){
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea actualizar este precio"
                + "?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if(resp==0){
                //little operation with values from classification wiht the cost
                  DecimalFormat o=new DecimalFormat("#.##");                
                        pre1=costandar*((cVal1+100)/100);
                        pre2=costandar*((cVal2+100)/100);
                        pre3=costandar*((cVal3+100)/100);
                        pre4=costandar*((cVal4+100)/100);
                        pre5=costandar*((cVal5+100)/100);
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
                //
                    try{
                  String sql2="update MGW10005 set CPRECIO1="+pre1+",CPRECIO2="+pre2+",CPRECIO3="+pre3+",CPRECIO4="+pre4+",CPRECIO5="+pre5+" where CCODIGOP01='"+idProduct+"'";
                  ConnectionModel c2=new ConnectionModel();
                  c2.getCon();
                  Statement stmt2 = c2.getCon().createStatement();
                  int rs2 = stmt2.executeUpdate(sql2);
                  if(rs2==0) {
                      JOptionPane.showMessageDialog(null,"No se actualizo nada");
                  }else{
                      JOptionPane.showMessageDialog(null, "Precios Actualizados con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
              
                  }
                  c2.closeCon();

              }catch(SQLException e){
                  MainMenu.MDebugger(e.getLocalizedMessage());
                  JOptionPane.showMessageDialog(null,"error fatal");
              }
            
            }
            if(resp==1){
                System.out.println("no confirmo");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Lo sentimos pero no se actualizo nada");
        }
        
    }//GEN-LAST:event_TSearchProStMouseClicked
    
    public boolean queryValuesClassification(String id){
        System.out.println("el id de las clasificasiones son "+id); 
        try{
            //String sql="SELECT mgw10020.cidvalor01,mgw10020.cvalorcl01,cval1,cval2,cval3,cval4,cval5 FROM mgw10020 INNER JOIN valclasi ON mgw10020.cidvalor01=valclasi.cidvalor01";
            String sql="select * from clasificaciones where id="+id+"";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()) {
          
                cVal1=Double.parseDouble(rs.getString("factor1"));
                cVal2=Double.parseDouble(rs.getString("factor2"));
                cVal3=Double.parseDouble(rs.getString("factor3"));
                cVal4=Double.parseDouble(rs.getString("factor4"));
                cVal5=Double.parseDouble(rs.getString("factor5"));
                return true;
                //System.out.println(rs.getObject("cidvalor01")+" "+rs.getObject("cvalorcl01")+" "+rs.getObject("cval1"));
            }
            
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+"error al consultar los valores de las clasificaciones");
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
        return false;
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearmodel();
        methodsearch();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(MorEnt);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(MorExi);
    }//GEN-LAST:event_jLabel3MouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        clearmodel();
        methodsearch();
    }//GEN-LAST:event_searchActionPerformed

    
    
        public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }
    
    public void methodsearch(){
                String fieldsearch=search.getText();
               
        try{
            //String sql="select CCODIGOP01,CNOMBREP01,CPRECIO1,CPRECIO2,CPRECIO3,CPRECIO4,CPRECIO5,CCOSTOES01 from MGW10005 where CNOMBREP01 like '%"+fieldsearch+"%' order by CCODIGOP01 asc";
            String sql="SELECT ccodigop01,cnombrep01,cprecio1,cprecio2,cprecio3,cprecio4,cprecio5,CCOSTOES01,CVALORCL01,mgw10005.CIDVALOR02 FROM MGW10005 INNER JOIN mgw10020 ON mgw10005.cidvalor02=mgw10020.cidvalor01 WHERE CNOMBREP01 like '%"+fieldsearch+"%' and CCOSTOES01<>0 AND mgw10005.CIDVALOR01<>0";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            System.out.println(rs.getRow());
            while(rs.next()) {
                Object dato[]={rs.getObject("CCODIGOP01"),rs.getObject("CNOMBREP01")
                        ,rs.getObject("CPRECIO1"),rs.getObject("CPRECIO2"),
                        rs.getObject("CPRECIO3"),rs.getObject("CPRECIO4"),
                        rs.getObject("CPRECIO5"),rs.getObject("CCOSTOES01"),rs.getObject("CVALORCL01"),rs.getObject("CIDVALOR02")};
                model.addRow(dato);
                cont++;
            }
            if(cont==0){
                tagResults.setText("Lo sentimos, escriba bien");
                MainMenu.MDebugger("Lo sentimos, escriba bien");
                JOptionPane.showMessageDialog(null,"NO existe ningun produto");
            }else{
                tagResults.setText("Se encontraron "+cont+" resultado(s)");
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
            }
            
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }


private Color MorPre=new Color(254,254,254);
    private Color MorEnt=new Color(91,0,160);
    private Color MorExi=new Color(51,0,102);
    private Color MorTexExi=new Color(102,0,102);
    private Color Black=new Color(0,0,0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSearchProSt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    // End of variables declaration//GEN-END:variables
}
