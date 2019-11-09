//05/02/2018
//JOSE JAVIER CUETO


/*
SOME DETAILS
-MODIFY UPDATES ON PRODUCTS IN TABLE WHEN A PRODUCT IS UPDATED(REVIEW),UPDATING IN REAL TIME

*/
package Class;
import Views.MainMenu;
public class Main {


    public static void main(String[] args) {
        //in this lines is changed the interface with a look like windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //this class is the main, the firts windows that start
        MainMenu v1=new MainMenu("El programa se inicio correctamente");
        v1.setTitle("Ramiro Lorenzo Mendoza");
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
        
    }
    
}
