package co.edu.uptc.model;

import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.pojo.Productos;

public class ProductosManager {
    
    public ProductosManager(){

    }
    
    UptcList<Productos> uptcList = new UptcList<Productos>();


    public boolean addProduct(Productos producto){
        if(searchProduct(producto.getCiu())==-1){
            uptcList.add(producto);
            System.out.println(producto.getCiu()  + "causa");
            return true;
        }else{
            System.out.println("yasta");
            return false;
        }
    }
    
    public UptcList<Productos> getUptcList() {
        return uptcList;
    }

    public void setUptcList(UptcList<Productos> uptcList) {
        this.uptcList = uptcList;
    }

    
    public Productos searchProductObj(String ciu){
    	int index = searchProduct(ciu);
    	if (index != -1) {
    		return uptcList.get(index);
    	}
    	return  null;
    }
    
    public int searchProduct(String ciu){
        int index = -1;

            for (int i = 0; i < uptcList.size(); i++) {
            
                if(ciu.equals(uptcList.get(i).getCiu()) ==true ){
                  index = i;  
                  break;
                }
            
        }
        return index;
    }
    public void deleteProduct(String ciu){
        int aux = searchProduct(ciu);
    if(aux != -1){
        System.out.println("borraos waos" + uptcList.get(aux).getCiu());

        uptcList.remove(aux);

    }else{
        throw new NullPointerException("Esa factura no existe");

    }

    }
    
    public void editProduct(String ciu, String barCode, String newCiu, String description, String unitPrice) {
    	int index = searchProduct(ciu);
    	if (index != -1) {
    		Productos product = uptcList.get(index);
    		product.setBarCode(barCode);
    		product.setCiu(newCiu);
    		product.setDescription(description);
    		product.setUnitPrice(unitPrice);
    	}
    }
}