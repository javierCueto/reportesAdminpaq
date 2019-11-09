
package Views.classifications;

import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Classifications extends javax.swing.JDialog {
    private final DefaultTableModel model;
   
    public Classifications(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jPanel2.setBackground(MainMenu.Background);
        jLabel3.setBackground(MainMenu.MorExi);
        this.model = (DefaultTableModel) TViewClass.getModel();
        queryClassification();
       // methodsearch();
    }
    
    
    public void queryClassification(){
        String fieldsearch=search.getText();
        String sql;
        try{
            
            if(rCode.isSelected()){
               // sql="select CIDVALOR01,CVALORCL01,CCODIGOV01  from MGW10020 order by cidvalor01 asc where upper(CCODIGOV01) like upper('%"+fieldsearch+"%') and (cidclasi01=25 or cidclasi01=26) ";
                sql="select CIDVALOR01,CVALORCL01,CCODIGOV01  from MGW10020 order by cidvalor01 asc where upper(CCODIGOV01) like upper('%"+fieldsearch+"%') and (cidclasi01=26) ";
            
            }else{
               // sql="select CIDVALOR01,CVALORCL01,CCODIGOV01  from MGW10020 order by cidvalor01 asc where upper(CVALORCL01) like upper('%"+fieldsearch+"%') and (cidclasi01=25 or  cidclasi01=26) ";
                sql="select CIDVALOR01,CVALORCL01,CCODIGOV01  from MGW10020 order by cidvalor01 asc where upper(CVALORCL01) like upper('%"+fieldsearch+"%') and (cidclasi01=26) ";
            
            }
            
              ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            System.out.println(rs.getRow());
            while(rs.next()) {
                  Object dato[]={rs.getObject("CIDVALOR01"),rs.getObject("CVALORCL01"),rs.getObject("CCODIGOV01")};
                model.addRow(dato);
                cont++;
            }
            if(cont==0){
                tagResults.setText("Lo sentimos, escriba bien");
                MainMenu.MDebugger("Lo sentimos, escriba bien");
            }else{
                tagResults.setText("Se encontraron "+cont+" resultado(s)");
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
            }
            
        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error fatal en la busqueda descriptiva de las clasificaciones\n"+e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TViewClass = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tagResults1 = new javax.swing.JLabel();
        rName = new javax.swing.JRadioButton();
        rCode = new javax.swing.JRadioButton();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edición de porcentajes de las clasificaciones.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        TViewClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TViewClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de la clasificacíon", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TViewClass.setGridColor(new java.awt.Color(255, 255, 255));
        TViewClass.setSelectionBackground(new java.awt.Color(51, 0, 102));
        TViewClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TViewClassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TViewClass);
        if (TViewClass.getColumnModel().getColumnCount() > 0) {
            TViewClass.getColumnModel().getColumn(0).setMinWidth(0);
            TViewClass.getColumnModel().getColumn(0).setMaxWidth(0);
            TViewClass.getColumnModel().getColumn(2).setMinWidth(100);
            TViewClass.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, 570, 290));

        tagResults.setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 100, 30));

        tagResults1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(tagResults1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 450, 20));

        buttonGroup1.add(rName);
        rName.setText("Nombre");
        jPanel1.add(rName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        buttonGroup1.add(rCode);
        rCode.setSelected(true);
        rCode.setText("Código");
        jPanel1.add(rCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void methodsearch(){
        
    }

    
    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }
    private void TViewClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TViewClassMouseClicked
        int i=TViewClass.getSelectedRow();
        String id,name,code;
        id=String.valueOf(TViewClass.getValueAt(i, 0));
        id=id.trim();
        name=String.valueOf(TViewClass.getValueAt(i, 1));
        name=name.trim();
        editValClassification vEVC=new editValClassification(new javax.swing.JFrame(), true,id,name);
        vEVC.setTitle("Valores de las clasificaciones");
        vEVC.setBounds(WIDTH, WIDTH, 770,409);
        vEVC.setLocationRelativeTo(null);
        vEVC.setResizable(false);
        vEVC.setVisible(true);
       // vEVC.queryValueCla();
        
       

    }//GEN-LAST:event_TViewClassMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearmodel();
        queryClassification();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(MorEnt);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(MorExi);
    }//GEN-LAST:event_jLabel3MouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        clearmodel();
        queryClassification();
    }//GEN-LAST:event_searchActionPerformed
  //Classifications dialog = new Classifications(new javax.swing.JFrame(), true);
       private Color MorPre=new Color(254,254,254);
    private Color MorEnt=new Color(91,0,160);
    private Color MorExi=new Color(51,0,102);
    private Color MorTexExi=new Color(102,0,102);
    private Color Black=new Color(0,0,0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TViewClass;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rCode;
    private javax.swing.JRadioButton rName;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    private javax.swing.JLabel tagResults1;
    // End of variables declaration//GEN-END:variables
}
