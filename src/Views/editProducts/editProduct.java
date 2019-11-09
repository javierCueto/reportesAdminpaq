package Views.editProducts;

import Class.numberConverter;
import Models.ConnectionModel;
import Views.MainMenu;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class editProduct extends javax.swing.JDialog {
    private boolean flag1=false;
    private int contResults=0;
    private int idProduct;
    private double valueOld1;
    private double valueOld2;
    private double valueOld3;
    private double valueOld4;
    private double valueOld5;
    private double standarOld;
    private double value1;
    private double value2;
    private double value3;
    private double value4;
    private double value5;
    private double value6;
    private double value7;
    private double value8;
    private double value9;
    private double value10;
    private numberConverter format=new numberConverter();

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue3() {
        return value3;
    }

    public double getValue4() {
        return value4;
    }

    public double getValue5() {
        return value5;
    }

    public double getStandar() {
        return standar;
    }
    private double standar;

    public boolean isFlag1() {
        return flag1;
    }
    public int getIdHistory(){
        try{
            String sql="SELECT MAX(idhistory)+1 FROM prhistory";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            if(rs.next()) {
                int idval=rs.getInt(1);
                MainMenu.MDebugger("Se obtuvo un id del historial");
                return idval;
            }else{
                MainMenu.MDebugger("Error grave al obtener valor de la tabla de historial");
                MainMenu.MDebugger("Error al obtener el id del historial");
                JOptionPane.showMessageDialog(null,"Error al seleccionar el id del historial");
            }
            
        c.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al obtener id historial\n"+e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
        return 0;
    }
    
    public editProduct(java.awt.Frame parent, boolean modal,int idProduct) {
        super(parent, modal);
        initComponents();
        jPanel2.setBackground(MainMenu.Background);
        this.idProduct=idProduct;
        querySearchProduct();
        
        
        
                
        
        addWindowListener(new java.awt.event.WindowAdapter(){

        @Override
        public void windowOpened(java.awt.event.WindowEvent evt){
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
   
    public editProduct() {
        initComponents();

    }
    public void methodCheck(){
         JOptionPane.showMessageDialog(rootPane,"Lo sentimos pero este producto no cuenta con factores válidos\n"
                 + "Este producto tiene enlazado una clasificación que no existe en la tabla de factores\n"
                 + "Agreguele un código con factores válidos");
            this.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        fieldcode = new javax.swing.JTextField();
        fieldname = new javax.swing.JTextField();
        fieldstandar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        subtitle = new javax.swing.JLabel();
        fieldp5 = new javax.swing.JTextField();
        fieldp1 = new javax.swing.JTextField();
        fieldp2 = new javax.swing.JTextField();
        fieldp3 = new javax.swing.JTextField();
        fieldp4 = new javax.swing.JTextField();
        fieldp6 = new javax.swing.JTextField();
        fieldp7 = new javax.swing.JTextField();
        fieldp8 = new javax.swing.JTextField();
        fieldp9 = new javax.swing.JTextField();
        fieldp10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        subtitle2 = new javax.swing.JLabel();
        fieldf1 = new javax.swing.JTextField();
        fieldf2 = new javax.swing.JTextField();
        fieldf3 = new javax.swing.JTextField();
        fieldf4 = new javax.swing.JTextField();
        fieldf5 = new javax.swing.JTextField();
        fieldfactor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldprovider = new javax.swing.JTextField();

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

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back1.setForeground(new java.awt.Color(51, 51, 51));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setText("Calcular precios en base a los factores");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.setOpaque(true);
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back1MouseExited(evt);
            }
        });
        jPanel2.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 250, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 780, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Proveedor o clasificación:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Nombre:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Código:");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 10, 410));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Edición producto");
        jPanel4.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        fieldcode.setEditable(false);
        fieldcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldcode.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jPanel1.add(fieldcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        fieldname.setEditable(false);
        fieldname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldname.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jPanel1.add(fieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 30));

        fieldstandar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldstandar.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldstandar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldstandarKeyTyped(evt);
            }
        });
        jPanel1.add(fieldstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 30));

        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("*Nota: Se recomienda poner los precios con dos decimales");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtitle.setText("Los Cabos");
        subtitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 90, 30));

        fieldp5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp5.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp5KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 30));

        fieldp1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp1.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp1KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, 30));

        fieldp2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp2.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp2KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, 30));

        fieldp3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp3.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp3KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, 30));

        fieldp4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp4.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp4KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 30));

        fieldp6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp6.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp6KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 90, 30));

        fieldp7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp7.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp7KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, 30));

        fieldp8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp8.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp8KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 90, 30));

        fieldp9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp9.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp9KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, 30));

        fieldp10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldp10.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldp10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldp10KeyTyped(evt);
            }
        });
        jPanel5.add(fieldp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Especial:");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Público:");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Precio 3:");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("Precio A:");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        subtitle1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtitle1.setText("Valores de los factores");
        subtitle1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(subtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 300, 30));

        subtitle2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtitle2.setText("La Paz");
        subtitle2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(subtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 70, 30));

        fieldf1.setEditable(false);
        fieldf1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldf1.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldf1KeyTyped(evt);
            }
        });
        jPanel5.add(fieldf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 30));

        fieldf2.setEditable(false);
        fieldf2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldf2.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldf2KeyTyped(evt);
            }
        });
        jPanel5.add(fieldf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 90, 30));

        fieldf3.setEditable(false);
        fieldf3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldf3.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldf3KeyTyped(evt);
            }
        });
        jPanel5.add(fieldf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 90, 30));

        fieldf4.setEditable(false);
        fieldf4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldf4.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldf4KeyTyped(evt);
            }
        });
        jPanel5.add(fieldf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 30));

        fieldf5.setEditable(false);
        fieldf5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldf5.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldf5KeyTyped(evt);
            }
        });
        jPanel5.add(fieldf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 90, 30));

        fieldfactor.setEditable(false);
        fieldfactor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldfactor.setMargin(new java.awt.Insets(2, 6, 2, 2));
        fieldfactor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldfactorKeyTyped(evt);
            }
        });
        jPanel5.add(fieldfactor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 90, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel19.setText("Mayoreo:");
        jLabel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel20.setText("Nombre:");
        jLabel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 6));
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 350, 430));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Costo estándar:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 6));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        fieldprovider.setEditable(false);
        fieldprovider.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fieldprovider.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jPanel1.add(fieldprovider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 30));

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
        back.setBackground(MainMenu.WhiteEnt);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(MainMenu.WhiteExi);
    }//GEN-LAST:event_backMouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        querySave();
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(MainMenu.WhiteEnt);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(MainMenu.WhiteExi);
    }//GEN-LAST:event_saveMouseExited

    private void fieldstandarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldstandarKeyTyped
        char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldstandar.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldstandarKeyTyped

    private void fieldp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp1KeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp1KeyTyped

    private void fieldp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp2KeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp2.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp2KeyTyped

    private void fieldp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp3KeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp3.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp3KeyTyped

    private void fieldp4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp4KeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp4.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp4KeyTyped

    private void fieldp5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp5KeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp5.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp5KeyTyped

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void fieldp6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp6KeyTyped
          char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp6.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp6KeyTyped

    private void fieldp7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp7KeyTyped
          char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp7.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp7KeyTyped

    private void fieldp8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp8KeyTyped
          char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp8.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp8KeyTyped

    private void fieldp9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp9KeyTyped
          char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp9.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp9KeyTyped

    private void fieldp10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldp10KeyTyped
          char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )   && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && fieldp10.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldp10KeyTyped

    private void fieldf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldf1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldf1KeyTyped

    private void fieldf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldf2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldf2KeyTyped

    private void fieldf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldf3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldf3KeyTyped

    private void fieldf4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldf4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldf4KeyTyped

    private void fieldf5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldf5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldf5KeyTyped

    private void fieldfactorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldfactorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldfactorKeyTyped

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        //calculo de los nuevos valores
        fieldp1.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf1.getText())/100)+1)));
        fieldp2.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf2.getText())/100)+1)));
        fieldp3.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf3.getText())/100)+1)));
        fieldp4.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf4.getText())/100)+1)));
        fieldp5.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf5.getText())/100)+1)));
        fieldp6.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf1.getText())/100)+1.05)));
        fieldp7.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf2.getText())/100)+1.05)));
        fieldp8.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf3.getText())/100)+1.05)));
        fieldp9.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf4.getText())/100)+1.05)));
        fieldp10.setText(""+format.methodConverter(Double.parseDouble(fieldstandar.getText())*((Double.parseDouble(fieldf5.getText())/100)+1.05)));
        
        
    }//GEN-LAST:event_back1MouseClicked

    private void back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_back1MouseEntered

    private void back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_back1MouseExited
    

    //methods to save the information on database
    public void querySave(){
        try{
            int idHistory=getIdHistory();
            System.out.println("el id de historial"+idHistory);
            String id= fieldcode.getText();
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
            if(fieldp6.getText().trim().isEmpty()){
                fieldp6.setText("0");
            }
            if(fieldp7.getText().trim().isEmpty()){
                fieldp7.setText("0");
            }
            if(fieldp8.getText().trim().isEmpty()){
                fieldp8.setText("0");
            }
            if(fieldp9.getText().trim().isEmpty()){
                fieldp9.setText("0");
            }
            if(fieldp10.getText().trim().isEmpty()){
                fieldp10.setText("0");
            }
            if(fieldstandar.getText().trim().isEmpty()){
                fieldstandar.setText("0");
            }
            value1=Double.parseDouble(fieldp1.getText());
            value2=Double.parseDouble(fieldp2.getText());
            value3=Double.parseDouble(fieldp3.getText());
            value4=Double.parseDouble(fieldp4.getText());
            value5=Double.parseDouble(fieldp5.getText());
            value6=Double.parseDouble(fieldp6.getText());
            value7=Double.parseDouble(fieldp7.getText());
            value8=Double.parseDouble(fieldp8.getText());
            value9=Double.parseDouble(fieldp9.getText());
            value10=Double.parseDouble(fieldp10.getText());
            
            
            
            standar=Double.parseDouble(fieldstandar.getText());

            //comprobacion si por lo menos un precio se modifico
            if(standar!=standarOld || value1!=valueOld1 || value2!=valueOld2 || value3!=valueOld3 || value4!=valueOld4 || value5!=valueOld5 ){
                String sql2="update MGW10005 set CPRECIO1="+value1+",CPRECIO2="+value2+","
                        + "CPRECIO3="+value3+",CPRECIO4="+value4+",CPRECIO5="+value5+","
                        + "CPRECIO6="+value6+",CPRECIO7="+value7+",CPRECIO8="+value8+","
                        + "CPRECIO9="+value9+",CPRECIO10="+value10+",CCOSTOES01="+standar+" where CCODIGOP01='"+id+"'";
                ConnectionModel c2=new ConnectionModel();
                c2.getCon();
                Statement stmt2 = c2.getCon().createStatement();
                int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    JOptionPane.showMessageDialog(null,"No se actualizo nada, consulta en 0");
                }else{
                    JOptionPane.showMessageDialog(null, "Datos guardados con Exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
                    MainMenu.MDebugger("Producto guardado con exito");
                    flag1=true;
                   // queryNewHistory(idHistory,value1,value2,value3,value4,value5,standar,valueOld1,valueOld2,valueOld3,valueOld4,valueOld5,standarOld);
                    this.dispose();

                }
                c2.closeCon();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se actualizo nada\nLo precios son iguales");
                this.dispose();
            }
        }catch(SQLException e){
            MainMenu.MDebugger(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null,"Error al guardar los datos de precios\nConsulte a carlitos"+e.getLocalizedMessage()+e.getMessage());
        }
    }
    
    
    
     public void queryNewHistory(int id,double v1,double v2,double v3,double v4,double v5
             ,double st,double vo1,double vo2,double vo3,double vo4,double vo5,double stO){
        try{
            Date ahora = new Date();
            String fecha;
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            fecha=formateador.format(ahora);
 
            String sql2="insert into prhistory values("+id+","+idProduct+","+v1+","+v2+","+v3+","+v4+","+v5+","+st+""
                        + ","+vo1+","+vo2+","+vo3+","+vo4+","+vo5+","+stO+",{^"+fecha+"},1)";
            ConnectionModel c2=new ConnectionModel();
            c2.getCon();
            Statement stmt2 = c2.getCon().createStatement();
            int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    System.out.println("no se hizo nada");
                    MainMenu.MDebugger("Error al crear valores del historial, valor 0");
                    JOptionPane.showMessageDialog(null,"Erro al crear el historial");
                }else{
                    MainMenu.MDebugger("Se creo un nuevo historial");
                }
                c2.closeCon();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al insertar el historial\n"+e.getMessage());
            System.out.println(e.getMessage());
            MainMenu.MDebugger(e.getMessage());
        }
    }
     
    public void querySearchProduct(){
        
        try{
        
            String sql;
            sql="select CCODIGOP01,CNOMBREP01,CPRECIO1,CPRECIO2,CPRECIO3,CPRECIO4,CPRECIO5,CPRECIO6,CPRECIO7,CPRECIO8,CPRECIO9,CPRECIO10,CCOSTOES01,cvalorcl01,codigo,factor1,factor2,factor3,factor4,factor5 from MGW10005 inner join mgw10020 on mgw10005.cidvalor01=mgw10020.cidvalor01 inner join clasificaciones on mgw10005.cidvalor02=clasificaciones.id where CIDPRODU01="+idProduct+"";
            ConnectionModel c=new ConnectionModel();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            while(rs.next()) {
                
                fieldp1.setText(""+format.methodConverter(rs.getDouble("CPRECIO1")));
                fieldp2.setText(""+format.methodConverter(rs.getDouble("CPRECIO2")));
                fieldp3.setText(""+format.methodConverter(rs.getDouble("CPRECIO3")));
                fieldp4.setText(""+format.methodConverter(rs.getDouble("CPRECIO4")));
                fieldp5.setText(""+format.methodConverter(rs.getDouble("CPRECIO5")));
                fieldp6.setText(""+format.methodConverter(rs.getDouble("CPRECIO6")));
                fieldp7.setText(""+format.methodConverter(rs.getDouble("CPRECIO7")));
                fieldp8.setText(""+format.methodConverter(rs.getDouble("CPRECIO8")));
                fieldp9.setText(""+format.methodConverter(rs.getDouble("CPRECIO9")));
                fieldp10.setText(""+format.methodConverter(rs.getDouble("CPRECIO10")));
                fieldcode.setText(""+rs.getObject("CCODIGOP01"));
                fieldname.setText(""+rs.getObject("CNOMBREP01"));
                fieldstandar.setText(""+format.methodConverter(rs.getDouble("CCOSTOES01")));
                fieldprovider.setText(""+rs.getObject("cvalorcl01"));
                fieldfactor.setText(""+rs.getObject("codigo"));
                fieldf1.setText(""+rs.getObject("factor1"));
                fieldf2.setText(""+rs.getObject("factor2"));
                fieldf3.setText(""+rs.getObject("factor3"));
                fieldf4.setText(""+rs.getObject("factor4"));
                fieldf5.setText(""+rs.getObject("factor5"));
                
                cont++;
            }
            contResults=cont;
            if(cont==0){
                MainMenu.MDebugger("Lo sentimos este producto no cuenta con factores validos");
            }else{
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JTextField fieldcode;
    private javax.swing.JTextField fieldf1;
    private javax.swing.JTextField fieldf2;
    private javax.swing.JTextField fieldf3;
    private javax.swing.JTextField fieldf4;
    private javax.swing.JTextField fieldf5;
    private javax.swing.JTextField fieldfactor;
    private javax.swing.JTextField fieldname;
    private javax.swing.JTextField fieldp1;
    private javax.swing.JTextField fieldp10;
    private javax.swing.JTextField fieldp2;
    private javax.swing.JTextField fieldp3;
    private javax.swing.JTextField fieldp4;
    private javax.swing.JTextField fieldp5;
    private javax.swing.JTextField fieldp6;
    private javax.swing.JTextField fieldp7;
    private javax.swing.JTextField fieldp8;
    private javax.swing.JTextField fieldp9;
    private javax.swing.JTextField fieldprovider;
    private javax.swing.JTextField fieldstandar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel save;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
