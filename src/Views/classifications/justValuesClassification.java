
package Views.classifications;

import Models.ConnectionModel;
import Views.MainMenu;
import Views.editProducts.justClassificationProducts;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class justValuesClassification extends javax.swing.JFrame {
     private final DefaultTableModel model;
    public justValuesClassification() {
        initComponents();
        this.model = (DefaultTableModel) TClassVal.getModel();
        queryClassVal();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TClassVal = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Clasificaciones solo con porcentajes.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 480, 40));

        TClassVal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TClassVal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre Clasificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TClassVal.setGridColor(new java.awt.Color(255, 255, 255));
        TClassVal.setRowHeight(25);
        TClassVal.setSelectionBackground(new java.awt.Color(51, 0, 102));
        TClassVal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TClassValMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TClassVal);
        if (TClassVal.getColumnModel().getColumnCount() > 0) {
            TClassVal.getColumnModel().getColumn(0).setMinWidth(0);
            TClassVal.getColumnModel().getColumn(0).setPreferredWidth(0);
            TClassVal.getColumnModel().getColumn(0).setMaxWidth(0);
            TClassVal.getColumnModel().getColumn(1).setMinWidth(70);
            TClassVal.getColumnModel().getColumn(1).setMaxWidth(70);
        }

        tagResults.setBackground(new java.awt.Color(153, 153, 153));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N

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

        search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagResults, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tagResults, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TClassValMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TClassValMouseClicked
        boolean flag1=true;
        double percentage=0;
        
        
        while(flag1){
            try{
                String perVal = JOptionPane.showInputDialog(null,"Ingrese el porcentaje que desea aumentar");
                if(perVal==null){
                    flag1=false;
                }else{                
                percentage=Double.parseDouble(perVal);
                percentage=(percentage/100)+1;
                flag1=false;
                updateValues(percentage);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,"Ingrese un valor valido\n"+e.getMessage());
            }
            
        }
   
    }//GEN-LAST:event_TClassValMouseClicked

    public void updateValues(double percentage){
        
        
        
        int i=TClassVal.getSelectedRow();
        int idclass=0;  
        String code,name,p1,p2,p3,p4,p5,standar;
        p1=String.valueOf(TClassVal.getValueAt(i, 0));
        p1=p1.trim();
        idclass=Integer.parseInt(p1);
        justClassificationProducts vClass = new justClassificationProducts(new javax.swing.JFrame(), true,idclass, percentage);
        vClass.setTitle("Produtos de "+TClassVal.getValueAt(i, 1));
        vClass.setLocationRelativeTo(null);
        vClass.setResizable(false);
        vClass.setVisible(true);
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearmodel();
        queryClassVal();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(MorEnt);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(MorExi);
    }//GEN-LAST:event_jLabel3MouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        clearmodel();
        queryClassVal();
    }//GEN-LAST:event_searchActionPerformed
    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }
    
    
    public void queryClassVal(){
        String fieldsearch=search.getText();
         try{
             
            String sql="SELECT cidvalor01,ccodigov01,cvalorcl01 FROM mgw10020 where UPPER(cvalorcl01) like UPPER('%"+fieldsearch+"%') and (cidclasi01=25 or cidclasi01=26)" ;
          
          //  String sql="SELECT mgw10020.cidvalor01,mgw10020.ccodigov01,mgw10020.cvalorcl01,cval1,"
            //        + "cval2,cval3,cval4,cval5 FROM mgw10020 INNER JOIN valclasi ON mgw10020.cidvalor01=valclasi.cidvalor01 where mgw10020.cvalorcl01 like '%"+fieldsearch+"%'";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            while(rs.next()) {
                Object dato[]={rs.getObject("cidvalor01"),rs.getObject("ccodigov01")
                        ,rs.getObject("cvalorcl01")};

                model.addRow(dato);
                //System.out.println(rs.getObject("cidvalor01")+" "+rs.getObject("cvalorcl01")+" "+rs.getObject("cval1"));
                cont++;
            }
            
            
            if(cont==0){
                tagResults.setText("Lo sentimos, escriba bien");
                MainMenu.MDebugger("Lo sentimos, escriba bien");
                System.out.println("Lo sentimos, escriba bien");
            }else{
                tagResults.setText("Se encontraron "+cont+" resultado(s)");
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
                System.out.println("Se encontraron "+cont+" resultado(s)");
            }
  
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+"error e");
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
    private javax.swing.JTable TClassVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    // End of variables declaration//GEN-END:variables
}
