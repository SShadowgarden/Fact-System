package co.edu.uptc.pojo;

public class Productos {
    private String barCode;
    private String ciu;
    private String description; 
    private String unitPrice;
    public String getBarCode() {
        return barCode;
    }
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public String getCiu() {
        return ciu;
    }
    public void setCiu(String ciu) {
        this.ciu = ciu;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Productos(String barCode, String ciu, String description, String unitPrice) {
        this.barCode = barCode;
        this.ciu = ciu;
        this.description = description;
        this.unitPrice = unitPrice;
    }
      
}
