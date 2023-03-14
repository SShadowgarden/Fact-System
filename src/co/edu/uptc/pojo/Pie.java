package co.edu.uptc.pojo;

import java.util.List;

public class Pie {
    private double subTotal;
    private double iva;
    private double total;
    private final static double IVA = 0.19;
    
    public double getsubTotal() {
        return subTotal;
    }
    public void setsubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    public double getIva() {
        return iva;
    }
    public double getIVA() {
    	return IVA;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    public Pie(List<Productos> products, List<Integer> amounts) {
    	this.subTotal = calculateSubTotal(products, amounts);
    	this.total = calculateTotal();
    }
    
    public double calculateSubTotal(List<Productos> products, List<Integer> amounts) {
    	double aux = 0;
    	for (int i = 0; i < products.size(); i++) {
    		aux += Double.parseDouble(products.get(i).getUnitPrice()) * amounts.get(i);
    	}
    	return aux;
    }
    
    public double calculateTotal() {
    	return subTotal*(1+IVA);
    }
    
}
