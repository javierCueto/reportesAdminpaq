
package Class;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class numberConverter {
    private DecimalFormat format=new DecimalFormat("#.##");  
    private double convertedNumber;
    private String temporalNumber;
    
    public double methodConverter(double temporalNumber){
        try {
            this.convertedNumber=0;
            this.temporalNumber=format.format(temporalNumber);
            this.convertedNumber=Double.parseDouble(this.temporalNumber);
            return convertedNumber;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lo sentimos, error al convertir "
                    + "el número\n"+e.getMessage());
            return 0;
        }
    }
}
