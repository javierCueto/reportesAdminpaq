/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.reports;

import Class.valuesTransfers;
import Models.ConnectionModel;
import Views.MainMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class printTransfers extends javax.swing.JDialog {
    private int id;
    private String serie;
    private String folio;
    private String dateT;
    private String reference;
    private double total,unidades;
     private final DefaultTableModel model;
    
    public printTransfers(java.awt.Frame parent, boolean modal, int id,String serie, 
            String folio, String dateT, String reference) {
        super(parent, modal);
        initComponents();
         this.model = (DefaultTableModel) TInfoTransfers.getModel();
     
        pTittle.setBackground(MainMenu.Background);
        this.id=id;
            queryTransferMovements();
        this.serie=serie;
        this.folio=folio;
        this.dateT=dateT;
        this.reference=reference;
        
        lSerie.setText("Serie: "+serie);
        lDate.setText("Fecha: "+dateT);
        lReference.setText("Referencias: "+reference);
        lFolio.setText("Folio: "+folio);
    }
    
    public void queryTransferMovements(){
        String sql,cants,prices;       
        double cant,price,sub;
        try{
            sql="SELECT ccodigop01,cnombrep01,cprecio2,mgw10010.cunidades,"
                        + "mgw10003.cnombrea01,almacen.cnombrea01 FROM "
                        + "(mgw10010 INNER JOIN mgw10005 on mgw10010.cidprodu01=mgw10005.cidprodu01 ) "
                        + "INNER JOIN mgw10003 ON mgw10003.cidalmacen=mgw10010.cidalmacen INNER JOIN mgw10010 as al ON "
                        + "mgw10010.cidmovim01=al.cidmovto01 INNER JOIN mgw10003 as almacen ON almacen.cidalmacen=al.cidalmacen  "
                        + "WHERE mgw10010.ciddocum01="+id+" ORDER BY ccodigop01 asc";

            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            DecimalFormat o=new DecimalFormat("#.##");
            while(rs.next()) {
                prices=String.valueOf(rs.getObject(3));
                cants=String.valueOf(rs.getObject(4));
                unidades=unidades+(Double.parseDouble(cants));
                price=Double.parseDouble(prices);
                cant=Double.parseDouble(cants);
                
                
                
                sub=price*cant;
                  prices=o.format(sub);
                sub=Double.parseDouble(prices);
                total=total+sub;
                
                Object dato[]={rs.getObject(1).toString().trim(),rs.getObject(2),rs.getObject(3)
                       ,rs.getObject(4),rs.getObject(5).toString().trim(),
                        rs.getObject(6).toString().trim(),sub};
               
                model.addRow(dato);
                cont++;
            }
            if(cont==0){
                System.out.println("no hay resultados");
            }
            else{
                 prices=o.format(total);
                sub=Double.parseDouble(prices);
                total=sub;
                
                
                lUnidades.setText("Unidades: "+unidades);
                lTotal.setText("Total: "+total);
            }
    
            
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error carlos\n"+e.getMessage()+"\n"+e.getSQLState());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pTittle = new javax.swing.JPanel();
        lSerie = new javax.swing.JLabel();
        lFolio = new javax.swing.JLabel();
        lReference = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TInfoTransfers = new javax.swing.JTable();
        lUnidades = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lSerie.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lSerie.setForeground(new java.awt.Color(255, 255, 255));
        lSerie.setText("Serie: ");

        lFolio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lFolio.setForeground(new java.awt.Color(255, 255, 255));
        lFolio.setText("Folio:");

        lReference.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lReference.setForeground(new java.awt.Color(255, 255, 255));
        lReference.setText("Referencia:");

        lDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lDate.setForeground(new java.awt.Color(255, 255, 255));
        lDate.setText("Fecha:");

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTittleLayout.createSequentialGroup()
                        .addComponent(lFolio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pTittleLayout.createSequentialGroup()
                        .addComponent(lReference)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pTittleLayout.createSequentialGroup()
                        .addComponent(lSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 663, Short.MAX_VALUE)
                        .addComponent(lDate)
                        .addGap(124, 124, 124))))
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGroup(pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTittleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTittleLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lFolio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lReference)
                .addGap(18, 18, 18))
        );

        TInfoTransfers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Unidades", "Almacén Salida", "Almacén Entrada", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TInfoTransfers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TInfoTransfersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TInfoTransfers);
        if (TInfoTransfers.getColumnModel().getColumnCount() > 0) {
            TInfoTransfers.getColumnModel().getColumn(0).setMinWidth(80);
            TInfoTransfers.getColumnModel().getColumn(0).setPreferredWidth(80);
            TInfoTransfers.getColumnModel().getColumn(0).setMaxWidth(80);
            TInfoTransfers.getColumnModel().getColumn(2).setMinWidth(70);
            TInfoTransfers.getColumnModel().getColumn(2).setPreferredWidth(70);
            TInfoTransfers.getColumnModel().getColumn(2).setMaxWidth(70);
            TInfoTransfers.getColumnModel().getColumn(3).setMinWidth(70);
            TInfoTransfers.getColumnModel().getColumn(3).setPreferredWidth(70);
            TInfoTransfers.getColumnModel().getColumn(3).setMaxWidth(70);
            TInfoTransfers.getColumnModel().getColumn(4).setMinWidth(120);
            TInfoTransfers.getColumnModel().getColumn(4).setPreferredWidth(120);
            TInfoTransfers.getColumnModel().getColumn(4).setMaxWidth(120);
            TInfoTransfers.getColumnModel().getColumn(5).setMinWidth(120);
            TInfoTransfers.getColumnModel().getColumn(5).setPreferredWidth(120);
            TInfoTransfers.getColumnModel().getColumn(5).setMaxWidth(120);
            TInfoTransfers.getColumnModel().getColumn(6).setMinWidth(90);
            TInfoTransfers.getColumnModel().getColumn(6).setPreferredWidth(90);
            TInfoTransfers.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        lUnidades.setBackground(new java.awt.Color(102, 0, 102));
        lUnidades.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lUnidades.setForeground(new java.awt.Color(153, 0, 153));
        lUnidades.setText("Unidades:");

        lTotal.setBackground(new java.awt.Color(102, 0, 102));
        lTotal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lTotal.setForeground(new java.awt.Color(153, 0, 153));
        lTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTotal.setText("Unidades:");

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Imprimir Reporte");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lUnidades)
                        .addGap(149, 149, 149)
                        .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUnidades)
                    .addComponent(lTotal))
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

    private void TInfoTransfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TInfoTransfersMouseClicked

    }//GEN-LAST:event_TInfoTransfersMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        List lista=new ArrayList();
        for (int i = 0; i <TInfoTransfers.getRowCount() ; i++) {
            valuesTransfers vT=new valuesTransfers (TInfoTransfers.getValueAt(i, 0).toString(),TInfoTransfers.getValueAt(i, 1).toString(),TInfoTransfers.getValueAt(i, 2).toString(),TInfoTransfers.getValueAt(i, 3).toString(),TInfoTransfers.getValueAt(i, 4).toString(),TInfoTransfers.getValueAt(i, 5).toString(),TInfoTransfers.getValueAt(i, 6).toString());
        lista.add(vT);
        }
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("tranfersReport.jasper");
            Map parametro= new HashMap();
            String to,uni;
            to=String.valueOf(total);
            uni=String.valueOf(unidades);
            parametro.put("total",to );
            parametro.put("totalUnits",uni);
           // JasperPrint jprint=JasperFillManager.fillReport(reporte, parametro);
            JasperPrint jprint=JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
          //  jprint.
            JasperViewer.viewReport(jprint, false);
           // JasperViewer.
        
          //  JasperViewer.viewReport(jprint);
            this.dispose();
        } catch (JRException ex) {
            Logger.getLogger(printTransfers.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TInfoTransfers;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lFolio;
    private javax.swing.JLabel lReference;
    private javax.swing.JLabel lSerie;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lUnidades;
    private javax.swing.JPanel pTittle;
    // End of variables declaration//GEN-END:variables
}
