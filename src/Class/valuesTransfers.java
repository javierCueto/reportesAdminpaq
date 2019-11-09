
package Class;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class valuesTransfers {
    private String code;
    private String name;
    private String units;
    private String exit;
    private String entrance;
    private String subtotal;
    private String price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public valuesTransfers(String code, String name, String price, String units, String exit, String entrance, String subtotal) {
        this.code = code;
        this.name = name;
        this.units = units;
        this.exit = exit;
        this.entrance = entrance;
        this.subtotal = subtotal;
        this.price = price;
    }
    
    
}
