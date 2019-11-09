
package Views.classifications;
import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class editValClassification extends javax.swing.JDialog {
    private int id;
    
    public editValClassification(java.awt.Frame parent, boolean modal,String id,String name) {
        super(parent, modal);
        initComponents();
        fieldid.setText(id);
        this.id=Integer.parseInt(id);
        fieldname.setText(name);
        addWindowListener(new java.awt.event.WindowAdapter(){
        @Override
        public void windowOpened(java.awt.event.WindowEvent evt){
            System.out.println("abierto");
            queryValueCla();
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

    public void queryValueCla(){
          try{
            String sql="select * from clasificaciones where id="+id+"";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            System.out.println(rs.getRow());
            while(rs.next()) {
                cont++;
                System.out.println("contador");
            }
            if(cont==0){
                MainMenu.MDebugger("Esta clasificacion no tiene valores");
               newValCla();
            }else{
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
                querySelectClassification();
            }
            
        c.closeCon();
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
            JOptionPane.showMessageDialog(rootPane, e.getMessage()+"\nSe recomienda que cierre la tabla para que pueda"
                    + " actualizar los precios de manera normal");
            this.dispose();
        }
    
    }
    
    public void newValCla(){
        try{
//            String sql="SELECT MAX(id)+1 FROM clasificaciones";
//            ConnectionModel c=new ConnectionModel();
//            c.getCon();
//            Statement stmt = c.getCon().createStatement();
//            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
//            int cont=0;
//            if(rs.next()) {
               // int idval=rs.getInt(1);
                String sql2="insert into clasificaciones values("+id+",'"+fieldname.getText().trim()+"',0,0,0,0,0)";
                ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                Statement stmt2 = c2.getCon().createStatement();
               int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    System.out.println("no se hizo nada");
                    MainMenu.MDebugger("Error al crear valores de la clasificacion");
                    JOptionPane.showMessageDialog(null,"Erro al crear nuevos valores de la clasificacion");
                }else{
                    MainMenu.MDebugger("Se crearon nuevos valores en las clasificaciones");
                    JOptionPane.showMessageDialog(null,"Asigne nuevos valores a esta clasificacion");
                    fieldp1.setText("0");
                    fieldp2.setText("0");
                    fieldp3.setText("0");
                    fieldp4.setText("0");
                    fieldp5.setText("0");
                }
                c2.closeCon();
//            }else{
//                MainMenu.MDebugger("Error grave");
//                JOptionPane.showMessageDialog(null,"Error al seleccionar el id de los valores de las clasificaciones");
//            }
//            
//        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al insertar valores de las clasificaCiones\n"+e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
    
    public void querySelectClassification(){
        try{
            String sql="select * from clasificaciones where id="+id+"";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            System.out.println(rs.getRow());
            while(rs.next()) {
                fieldp1.setText(rs.getString("factor1"));
                fieldp2.setText(rs.getString("factor2"));
                fieldp3.setText(rs.getString("factor3"));
                fieldp4.setText(rs.getString("factor4"));
                fieldp5.setText(rs.getString("factor5"));
                cont++;
            }
            if(cont==0){
                MainMenu.MDebugger("Esta clasificacion no tiene valores y si tiene id");
                JOptionPane.showMessageDialog(null,"Esta clasificacion no tiene valores y si tiene id");
            }else{
                MainMenu.MDebugger("Se encontraron "+cont+" resultado(s)");
            }
            
        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error\n"+e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
    
    public void queryUpdateClassification(){


        
        try{
            
            
            if(fieldp1.getText().trim().isEmpty()){
                fieldp1.setText("0");
            }
            if(fieldp2.getText().trim().isEmpty()){
                fieldp2.setText("0");
            }
            if(fieldp3.getText().trim().isEmpty()){
                fieldp3.setText("0");
            }
            if(fieldp4.getText().trim().isEmpty()){
                fieldp4.setText("0");
            }
            if(fieldp5.getText().trim().isEmpty()){
                fieldp5.setText("0");
            }

            
        double v1=Double.parseDouble(fieldp1.getText());
        double v2=Double.parseDouble(fieldp2.getText());
        double v3=Double.parseDouble(fieldp3.getText());
        double v4=Double.parseDouble(fieldp4.getText());
        double v5=Double.parseDouble(fieldp5.getText());
            String sql2="update clasificaciones set factor1="+v1+",factor2="+v2+",factor3="+v3+",factor4="+v4+",factor5="+v5+" where id="+id+"";
            ConnectionModel c2=new ConnectionModel();
            c2.getCon();
            Statement stmt2 = c2.getCon().createStatement();
            int rs2 = stmt2.executeUpdate(sql2);
            if(rs2==0) {
                JOptionPane.showMessageDialog(null,"No se actualizo nada");
            }else{
                JOptionPane.showMessageDialog(null, "Datos guardados con Exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
            c2.closeCon();

        }catch(SQLException e){
            MainMenu.MDebugger(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,"error fatal"+e.getSQLState()+e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        fieldid = new javax.swing.JTextField();
        fieldname = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldp5 = new javax.swing.JTextField();
        fieldp1 = new javax.swing.JTextField();
        fieldp2 = new javax.swing.JTextField();
        fieldp3 = new javax.swing.JTextField();
        fieldp4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 51));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Cancelar");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 30));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(51, 51, 51));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Guardar");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setOpaque(true);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 780, 50));

        subtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtitle.setText("Porcentajes de clasificación");
        subtitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel1.add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 220, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Nombre:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("ID");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 10, 270));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Valores de procentajes");
        jPanel4.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        fieldid.setEditable(false);
        fieldid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldid.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jPanel1.add(fieldid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        fieldname.setEditable(false);
        fieldname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldname.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jPanel1.add(fieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("% Valor 5");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("% Valor 1");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("% Valor 2");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("% Valor 3");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("% Valor 4");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));

        fieldp5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp5.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp5KeyTyped(evt);
            }
        });

        fieldp1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp1.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp1KeyTyped(evt);
            }
        });

        fieldp2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp2.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp2KeyTyped(evt);
            }
        });

        fieldp3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp3.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp3KeyTyped(evt);
            }
        });

        fieldp4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp4.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldp1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldp2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldp3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldp4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldp5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldp3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldp4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldp5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 80, 180, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(WhiteEnt);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(WhiteExi);
    }//GEN-LAST:event_backMouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        queryUpdateClassification();
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(WhiteEnt);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(WhiteExi);
    }//GEN-LAST:event_saveMouseExited

    private void fieldp5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp5KeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){
            evt.consume();
        }
        if (car == '.' && fieldp5.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp5KeyTyped

    private void fieldp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp1KeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9')  && (car != '.')){
            evt.consume();
        }
      
         if (car == '.' && fieldp1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp1KeyTyped

    private void fieldp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp2KeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9')  && (car != '.')){
            evt.consume();
        }
        
         if (car == '.' && fieldp2.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp2KeyTyped

    private void fieldp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp3KeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9')  && (car != '.')){
            evt.consume();
        }
         if (car == '.' && fieldp3.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp3KeyTyped

    private void fieldp4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp4KeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9')  && (car != '.')){
            evt.consume();
        }
        
         if (car == '.' && fieldp4.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp4KeyTyped
  private Color WhiteEnt=new Color(220,220,220);
    private Color WhiteExi=new Color(254,254,254);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField fieldid;
    private javax.swing.JTextField fieldname;
    private javax.swing.JTextField fieldp1;
    private javax.swing.JTextField fieldp2;
    private javax.swing.JTextField fieldp3;
    private javax.swing.JTextField fieldp4;
    private javax.swing.JTextField fieldp5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel save;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
