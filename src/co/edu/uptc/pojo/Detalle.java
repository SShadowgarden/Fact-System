package co.edu.uptc.pojo;

import java.util.List;

import co.edu.uptc.model.dinamic.UptcList;

public class Detalle { 
    
    private UptcList<Productos> products;
    private UptcList<Integer> amounts;

    public Detalle(UptcList<Productos> products, UptcList<Integer> amounts) {
    	this.products = products;
    	this.amounts = amounts;
    }

	public UptcList<Productos> getProducts() {
		return products;
	}

	public void setProducts(UptcList<Productos> products) {
		this.products = products;
	}

	public UptcList<Integer> getAmounts() {
		return amounts;
	}

	public void setAmounts(UptcList<Integer> amounts) {
		this.amounts = amounts;
	}
    
}
