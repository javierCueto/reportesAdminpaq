
package Views.reports;

import Models.ConnectionModel;
import Views.MainMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class allTransfers extends javax.swing.JFrame {

    private final DefaultTableModel model;
    private boolean flagall=true;
    public allTransfers() {
        initComponents();
        pTittle.setBackground(MainMenu.Background);
        this.model = (DefaultTableModel) TTransfers.getModel();
        queryTransfers();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pTittle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTransfers = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Traspasos");

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        TTransfers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Serie", "Folio", "Fecha", "Referencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TTransfers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TTransfersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TTransfers);
        if (TTransfers.getColumnModel().getColumnCount() > 0) {
            TTransfers.getColumnModel().getColumn(0).setMinWidth(100);
            TTransfers.getColumnModel().getColumn(0).setPreferredWidth(100);
            TTransfers.getColumnModel().getColumn(0).setMaxWidth(100);
            TTransfers.getColumnModel().getColumn(2).setMinWidth(100);
            TTransfers.getColumnModel().getColumn(2).setPreferredWidth(100);
            TTransfers.getColumnModel().getColumn(2).setMaxWidth(100);
            TTransfers.getColumnModel().getColumn(3).setMinWidth(100);
            TTransfers.getColumnModel().getColumn(3).setPreferredWidth(100);
            TTransfers.getColumnModel().getColumn(3).setMaxWidth(100);
            TTransfers.getColumnModel().getColumn(4).setMinWidth(100);
            TTransfers.getColumnModel().getColumn(4).setPreferredWidth(100);
            TTransfers.getColumnModel().getColumn(4).setMaxWidth(100);
            TTransfers.getColumnModel().getColumn(5).setMinWidth(200);
            TTransfers.getColumnModel().getColumn(5).setPreferredWidth(200);
            TTransfers.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar por Folio");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TTransfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTransfersMouseClicked
       int i=TTransfers.getSelectedRow();
        int id;
        String ids,serie,folio,reference,dateT;
        ids=String.valueOf(TTransfers.getValueAt(i, 0));
        serie=String.valueOf(TTransfers.getValueAt(i, 2));
        folio=String.valueOf(TTransfers.getValueAt(i, 3));
        dateT=String.valueOf(TTransfers.getValueAt(i, 4));
        reference=String.valueOf(TTransfers.getValueAt(i, 5));
        id=Integer.parseInt(ids);
        
        printTransfers vEP=new printTransfers(new javax.swing.JFrame(), true,id,serie,folio,dateT,reference);
        vEP.setTitle("Reporte de traspasos");
        vEP.setLocationRelativeTo(vEP);
        vEP.setResizable(false);
        vEP.setVisible(rootPaneCheckingEnabled);
        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_TTransfersMouseClicked
    
    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
            
        }
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        clearmodel();
        queryTransfers();
    }//GEN-LAST:event_searchActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearmodel();
        queryTransfers();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(MainMenu.darkPurple);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(MainMenu.MorExi);
    }//GEN-LAST:event_jLabel3MouseExited

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9' ) ){ 
            evt.consume();
        }
    }//GEN-LAST:event_searchKeyTyped

    
    public void queryTransfers(){
        int folio;
        if(search.getText().trim().isEmpty()){
            folio=0;
            flagall=true;
        }else{
            
            folio=Integer.parseInt(search.getText().trim());
            flagall=false;
        }
        
        String sql;       
        try{
            if(flagall){
                   sql="select CIDDOCUM01,CSERIEDO01,CFOLIO,CFECHA,CREFEREN01 from MGW10008 WHERE CIDDOCUM02=34 AND CIDCONCE01=36 order by CFOLIO desc";
     
            }else{
                   sql="select CIDDOCUM01,CSERIEDO01,CFOLIO,CFECHA,CREFEREN01 from MGW10008 WHERE CFOLIO="+folio+" and CIDDOCUM02=34 AND CIDCONCE01=36 order by CFOLIO desc";
     
            }

             
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            while(rs.next()) {
                Object dato[]={rs.getObject("CIDDOCUM01"),"Traspaso",rs.getObject("CSERIEDO01")
                        ,rs.getInt("CFOLIO"),rs.getObject("CFECHA"),
                        rs.getObject("CREFEREN01")};
                model.addRow(dato);
                cont++;
            }
          
            
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error carlos\n"+e.getMessage()+"\n"+e.getSQLState());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TTransfers;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pTittle;
    private javax.swing.JTextField search;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
