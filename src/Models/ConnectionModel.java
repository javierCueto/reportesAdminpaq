package Models;
import Views.MainMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionModel {

    public ConnectionModel() {
        boolean flag1=connectToAccess();
    }
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void closeCon() throws SQLException{
        this.con.close();
    }
    public boolean connectToAccess() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              // con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Visual FoxPro Driver};SourceType=DBF;DSN=dbf6;SourceDB=" + DB);
               con = DriverManager.getConnection("jdbc:odbc:Pape");
        } catch (ClassNotFoundException | SQLException ex) {
      //      ex.printStackTrace();
            MainMenu.MDebugger(ex.getLocalizedMessage());
            MainMenu.MDebugger(ex.getMessage());
            JOptionPane.showMessageDialog(null,"error en la conexio"+ex.getMessage());
          //  MainMenu.MDebugger(ex.getLocalizedMessage());
            
            return false;
        }
        return true;
    }
    
}
