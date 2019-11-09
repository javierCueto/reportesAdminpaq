
package Views;

import Models.ConnectionModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CatProducts extends javax.swing.JFrame {
    private final DefaultTableModel model;
    public CatProducts() {
     
     
        initComponents();
        this.model = (DefaultTableModel) TData.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio 1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TData.setGridColor(new java.awt.Color(255, 255, 255));
        TData.setSelectionBackground(new java.awt.Color(240, 240, 240));
        TData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TData);
        if (TData.getColumnModel().getColumnCount() > 0) {
            TData.getColumnModel().getColumn(0).setMinWidth(50);
            TData.getColumnModel().getColumn(0).setPreferredWidth(50);
            TData.getColumnModel().getColumn(0).setMaxWidth(50);
            TData.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 590, 260));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Leer datos");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           
       
        String sql="select CCODIGOP01,CNOMBREP01,CPRECIO1  from MGW10005 order by CCODIGOP01 asc";
        // String sql="select CCODIGOP01,CNOMBREP01,CPRECIO1  from MGW10005 where CNOMBREP01 like '%PAPEL%' order by CCODIGOP01 asc";
        ConnectionModel c=new ConnectionModel();
        c.getCon();
        Statement stmt = c.getCon().createStatement();
        ResultSet rs = (ResultSet) stmt.executeQuery(sql);
           int cont=0;
            while(rs.next()) {
                
               

                Object dato[]={rs.getObject("CCODIGOP01"),rs.getObject("CNOMBREP01"),rs.getObject("CPRECIO1")};
                model.addRow(dato);
               
                
                cont++;
                 System.out.println(cont);
               //if(cont==100){
                 //   break;
                //}
            }
            System.out.println("consulta con exito");
        c.closeCon();
       }catch(Exception e){
           System.out.println(e.getMessage());
           
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDataMouseClicked
         int i=TData.getSelectedRow();
        if(i==-1){
            System.out.println("elija una celda");
        }else{
            System.out.println("celda elejida");
            System.out.println(TData.getValueAt(i, 0));
        }
    }//GEN-LAST:event_TDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TData;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
