
package Views;

import Models.ConnectionModel;
import Views.classifications.Classifications;
import Views.classifications.justValuesClassification;
import Views.reports.allTransfers;
import Views.searches.SearchProduct;
import Views.searches.standarSearchProducts;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MainMenu extends javax.swing.JFrame {
    private static String Debugger="";
    private boolean btnPro=false;
    private boolean btnClass=false;
    private boolean btnAdv=false;
    private boolean btnRep=false;
    
    public static void MDebugger(String Debugger){
        MainMenu.Debugger=MainMenu.Debugger+Debugger+"\n";
        MainMenu.TDebugger.setText( MainMenu.Debugger);
    }
    public MainMenu(String Debugger) {
        initComponents();
        products.setBackground(WhiteExi);
        products.setForeground(Black);
        btnPro=true; 
        PProducts.setVisible(true);
        PClassification.setVisible(false);
        PReports.setVisible(false);
         Poptions.setVisible(false);
       // TDebugger.sets
        MDebugger(Debugger);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PProducts = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PClassification = new javax.swing.JPanel();
        PReports = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Poptions = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        classifications = new javax.swing.JLabel();
        advanced = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Reports = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDebugger = new javax.swing.JTextArea();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jPanel4.setLayout(new java.awt.CardLayout());

        PProducts.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Actualizar precios por producto (Solo con costo estandar)");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout PProductsLayout = new javax.swing.GroupLayout(PProducts);
        PProducts.setLayout(PProductsLayout);
        PProductsLayout.setHorizontalGroup(
            PProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProductsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        PProductsLayout.setVerticalGroup(
            PProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProductsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel8)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel4.add(PProducts, "card2");

        PClassification.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PClassificationLayout = new javax.swing.GroupLayout(PClassification);
        PClassification.setLayout(PClassificationLayout);
        PClassificationLayout.setHorizontalGroup(
            PClassificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        PClassificationLayout.setVerticalGroup(
            PClassificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        jPanel4.add(PClassification, "card3");

        PReports.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("- Traspasos");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout PReportsLayout = new javax.swing.GroupLayout(PReports);
        PReports.setLayout(PReportsLayout);
        PReportsLayout.setHorizontalGroup(
            PReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PReportsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(945, Short.MAX_VALUE))
        );
        PReportsLayout.setVerticalGroup(
            PReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PReportsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPanel4.add(PReports, "card5");

        Poptions.setBackground(new java.awt.Color(255, 255, 255));
        Poptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("- Restaurar formatos de conceptos");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        Poptions.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPanel4.add(Poptions, "card4");

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Papeleria Baja California Sur, La Paz.");

        classifications.setBackground(new java.awt.Color(102, 0, 102));
        classifications.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        classifications.setForeground(new java.awt.Color(255, 255, 255));
        classifications.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classifications.setText("Clasificaciones");
        classifications.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classifications.setOpaque(true);
        classifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classificationsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classificationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classificationsMouseExited(evt);
            }
        });

        advanced.setBackground(new java.awt.Color(102, 0, 102));
        advanced.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        advanced.setForeground(new java.awt.Color(255, 255, 255));
        advanced.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advanced.setText("Opciones avanzadas");
        advanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        advanced.setOpaque(true);
        advanced.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advancedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                advancedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                advancedMouseExited(evt);
            }
        });

        products.setBackground(new java.awt.Color(102, 0, 102));
        products.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        products.setForeground(new java.awt.Color(255, 255, 255));
        products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        products.setText("Productos");
        products.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        products.setOpaque(true);
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 0, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Bienvenido : Javier");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        Reports.setBackground(new java.awt.Color(102, 0, 102));
        Reports.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Reports.setForeground(new java.awt.Color(255, 255, 255));
        Reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reports.setText("Reportes");
        Reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reports.setOpaque(true);
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classifications, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advanced, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classifications, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(advanced, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TDebugger.setEditable(false);
        TDebugger.setColumns(20);
        TDebugger.setRows(5);
        TDebugger.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jScrollPane1.setViewportView(TDebugger);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void productsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseEntered
        
        if(btnPro){
            
        }else{
               products.setBackground(darkPurple);
        }
 
    }//GEN-LAST:event_productsMouseEntered

    private void productsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseExited
        if(btnPro){
            
        }else{
          products.setBackground(MorExi); 
        }

    }//GEN-LAST:event_productsMouseExited

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        
        advanced.setBackground(MorExi);
         advanced.setForeground(WhiteExi);
         classifications.setBackground(MorExi);
         classifications.setForeground(WhiteExi);
         Reports.setBackground(MorExi);
         Reports.setForeground(WhiteExi);
         
         
        
        products.setBackground(WhiteExi);
        products.setForeground(Black);
        btnPro=true;   
        btnClass=false;
        btnAdv=false;
        btnRep=false;
        PProducts.setVisible(true);
        PClassification.setVisible(false);
         Poptions.setVisible(false);
         PReports.setVisible(false);
    }//GEN-LAST:event_productsMouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         
//        standarSearchProducts    vSSP = new standarSearchProducts   (new javax.swing.JFrame(), true);     
//        vSSP.setLocationRelativeTo(null);
//        vSSP.setTitle("Valores de clasificaciones");
//        vSSP.setResizable(false);
//        vSSP.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void classificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificationsMouseClicked
       products.setBackground(MorExi); 
        products.setForeground(WhiteExi);
       advanced.setBackground(MorExi); 
       advanced.setForeground(WhiteExi); 
          Reports.setBackground(MorExi);
         Reports.setForeground(WhiteExi);
        

       classifications.setBackground(WhiteExi); 
       classifications.setForeground(Black); 
        
        btnClass=true;
        btnPro=false;
        btnAdv=false;
        btnRep=false;
        PProducts.setVisible(false);
        PClassification.setVisible(true);
        Poptions.setVisible(false);
        PReports.setVisible(false);
    }//GEN-LAST:event_classificationsMouseClicked

    private void classificationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificationsMouseEntered
         
         
          if(btnClass){
            
        }else{
             classifications.setBackground(darkPurple);
        }
    }//GEN-LAST:event_classificationsMouseEntered

    private void classificationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classificationsMouseExited
       
        
        
          if(btnClass){
            
        }else{
              classifications.setBackground(MorExi);
        }
    }//GEN-LAST:event_classificationsMouseExited

    private void advancedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedMouseClicked
       products.setBackground(MorExi); 
        products.setForeground(WhiteExi);
       classifications.setBackground(MorExi); 
       classifications.setForeground(WhiteExi); 
           Reports.setBackground(MorExi);
         Reports.setForeground(WhiteExi);
        
        
        
        advanced.setBackground(WhiteExi);
         advanced.setForeground(Black);
        PProducts.setVisible(false);
        PClassification.setVisible(false);
        btnAdv=true;
        btnPro=false;
        btnClass=false;
        btnRep=false;
         Poptions.setVisible(true);
         PReports.setVisible(false);
    }//GEN-LAST:event_advancedMouseClicked

    private void advancedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedMouseEntered
       
        
        
         if(btnAdv){
            
        }else{
               advanced.setBackground(darkPurple);
        }
    }//GEN-LAST:event_advancedMouseEntered

    private void advancedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedMouseExited
      
        
        
         if(btnAdv){
            
        }else{
                 advanced.setBackground(MorExi);
        }
    }//GEN-LAST:event_advancedMouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       String [] queries={"update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\Compacw\\Empresas\\Reportes\\AdminPAQ\\Formato_Factura_33_a.htm' where cidconce01=3042",
       "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\COMPACW\\EMPRESAS\\Reportes\\PuntoDeVenta\\Formato_Factura_33_aCOL.htm' where cidconce01=3046",
        "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\COMPACW\\EMPRESAS\\Reportes\\PuntoDeVenta\\Formato_Factura_33_aCOL.htm' where cidconce01=3047",
        "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\compacw\\EMPRESAS\\Reportes\\PuntoDeVenta\\Formato_Factura_33_a.htm' where cidconce01=3045",
       "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\Compacw\\Empresas\\Reportes\\AdminPAQ\\Formato_Factura_33_a.htm' where cidconce01=3043",
       "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\Compacw\\Empresas\\Reportes\\AdminPAQ\\Formato_Factura_33_a.htm' where cidconce01=3044",
       "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\COMPACW\\EMPRESAS\\Reportes\\AdminPAQ\\Formato_Factura_33_a.htm' where cidconce01=3086",
       "update mgw10006 set cplamigcfd='\\\\Papeleriasrv\\COMPACW\\EMPRESAS\\Reportes\\AdminPAQ\\Formato_Factura_33_a.htm' where cidconce01=3088"};
       
      
        try{
             int cont=0;
               ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                JOptionPane.showMessageDialog(null, "Los formatos se van a restaurar");
                while(queries.length>cont){
                  
                 
                    Statement stmt2 = c2.getCon().createStatement();
                    int rs2 = stmt2.executeUpdate(queries[cont]);
                    System.out.println(cont);
                    cont++;
                }
                c2.closeCon();
                JOptionPane.showMessageDialog(null, "Formatos restaurados con éxito\nVuelva pronto");
        }catch(SQLException e){
            MainMenu.MDebugger(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,"Error al guardar los datos de precios\nConsulte a carlitos"+e.getLocalizedMessage()+e.getMessage());
        }  
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseClicked
              products.setBackground(MorExi); 
        products.setForeground(WhiteExi);
       classifications.setBackground(MorExi); 
       classifications.setForeground(WhiteExi); 
           advanced.setBackground(MorExi);
         advanced.setForeground(WhiteExi);
        
        
        
        Reports.setBackground(WhiteExi);
        Reports.setForeground(Black);
        PProducts.setVisible(false);
        PClassification.setVisible(false);
        btnAdv=false;
        btnPro=false;
        btnClass=false;
        btnRep=true;
         Poptions.setVisible(false);
         PReports.setVisible(true);
    }//GEN-LAST:event_ReportsMouseClicked

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
         if(btnRep){
            
        }else{
                 Reports.setBackground(darkPurple);
        }
    }//GEN-LAST:event_ReportsMouseEntered

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
           if(btnRep){
            
        }else{
                 Reports.setBackground(MorExi);
        }
    }//GEN-LAST:event_ReportsMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        allTransfers vAT=new allTransfers();
        vAT.setTitle("Traspasos entre sucursales");
        vAT.setLocationRelativeTo(null);
        vAT.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited
    public static Color MorPre=new Color(254,254,254);
    public static Color MorExi=new Color(102,0,102);
    public static Color MorTexExi=new Color(102,0,102);
    public static Color Background=new Color(102,0,102);
    public static Color darkPurple=new Color(51,0,51);
    public static Color Black=new Color(0,0,0);    
    public static Color WhiteEnt=new Color(220,220,220);
    public static Color WhiteExi=new Color(254,254,254);
    
    int xx;
    int xy;
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PClassification;
    private javax.swing.JPanel PProducts;
    private javax.swing.JPanel PReports;
    private javax.swing.JPanel Poptions;
    private javax.swing.JLabel Reports;
    private static javax.swing.JTextArea TDebugger;
    private javax.swing.JLabel advanced;
    private javax.swing.JLabel classifications;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel products;
    // End of variables declaration//GEN-END:variables
}
