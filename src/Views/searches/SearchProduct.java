
package Views.searches;

import Models.ConnectionModel;
import Views.MainMenu;
import Views.editProducts.editProduct;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SearchProduct extends javax.swing.JFrame {

    private final DefaultTableModel model;
    public SearchProduct() {
        initComponents();
        jPanel2.setBackground(MainMenu.Background);
        jLabel3.setBackground(MainMenu.MorExi);
        this.model = (DefaultTableModel) TSearchPro.getModel();
      
    }
    

    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
            
        }
    }
    
    public void methodTypeSearch(){
        
    }
    public void methodsearch(){
        String fieldsearch=search.getText();
        if(fieldsearch.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"El campo de búsqueda esta vacío");
        }else{

            String sql;       
            try{

                if(rCode.isSelected()){
                    sql="select CIDPRODU01,CCODIGOP01,CNOMBREP01 from MGW10005 where UPPER(CCODIGOP01) like UPPER('%"+fieldsearch+"%') order by CCODIGOP01 asc";
                }else{
                    sql="select CIDPRODU01,CCODIGOP01,CNOMBREP01 from MGW10005 where UPPER(CNOMBREP01) like UPPER('%"+fieldsearch+"%') order by CCODIGOP01 asc";
                }
                ConnectionModel c=new ConnectionModel();
                c.getCon();
                Statement stmt = c.getCon().createStatement();
                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                int cont=0;
                while(rs.next()) {
                    Object dato[]={rs.getObject("CIDPRODU01"),rs.getObject("CCODIGOP01"),rs.getObject("CNOMBREP01")};
                    model.addRow(dato);
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
                JOptionPane.showMessageDialog(null,"Error carlos\n"+e.getMessage()+"\n"+e.getSQLState());
                System.out.println(e.getMessage());
                MainMenu.MDebugger(e.getMessage());
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeSearh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSearchPro = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        rCode = new javax.swing.JRadioButton();
        rName = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Búsquedas de productos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        TSearchPro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TSearchPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TSearchPro.setGridColor(new java.awt.Color(255, 255, 255));
        TSearchPro.setRowHeight(25);
        TSearchPro.setSelectionBackground(new java.awt.Color(51, 0, 51));
        TSearchPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSearchProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TSearchPro);
        if (TSearchPro.getColumnModel().getColumnCount() > 0) {
            TSearchPro.getColumnModel().getColumn(0).setMinWidth(0);
            TSearchPro.getColumnModel().getColumn(0).setPreferredWidth(0);
            TSearchPro.getColumnModel().getColumn(0).setMaxWidth(0);
            TSearchPro.getColumnModel().getColumn(1).setMinWidth(120);
            TSearchPro.getColumnModel().getColumn(1).setMaxWidth(120);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, 550, 290));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 100, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 290, 30));

        typeSearh.add(rCode);
        rCode.setSelected(true);
        rCode.setText("Código");
        rCode.setFocusable(false);
        jPanel1.add(rCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        typeSearh.add(rName);
        rName.setText("Nombre");
        rName.setFocusable(false);
        jPanel1.add(rName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TSearchProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSearchProMouseClicked
        int i=TSearchPro.getSelectedRow();
        int id;
        String ids,code,name,p1,p2,p3,p4,p5,standar;
        ids=String.valueOf(TSearchPro.getValueAt(i, 0));
        id=Integer.parseInt(ids);
        code=(String) TSearchPro.getValueAt(i, 1);

        name=(String) TSearchPro.getValueAt(i, 2);
        name=name.trim();
        editProduct vEP=new editProduct(new javax.swing.JFrame(), true,id);
        vEP.setTitle("Productos");
        vEP.setBounds(WIDTH, WIDTH, 770,549);
        vEP.setLocationRelativeTo(vEP);
        vEP.setResizable(false);
        vEP.setVisible(rootPaneCheckingEnabled);

        
    }//GEN-LAST:event_TSearchProMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         clearmodel();
        methodsearch();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(MainMenu.darkPurple);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(MainMenu.MorExi);
    }//GEN-LAST:event_jLabel3MouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        clearmodel();
        methodsearch();
    }//GEN-LAST:event_searchActionPerformed

private Color MorPre=new Color(254,254,254);
    private Color MorEnt=new Color(91,0,160);
    private Color MorExi=new Color(51,0,102);
    private Color MorTexExi=new Color(102,0,102);
    private Color Black=new Color(0,0,0);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSearchPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rCode;
    private javax.swing.JRadioButton rName;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    private javax.swing.ButtonGroup typeSearh;
    // End of variables declaration//GEN-END:variables
}
