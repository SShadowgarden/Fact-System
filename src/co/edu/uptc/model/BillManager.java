package co.edu.uptc.model;

import java.util.List;

import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.pojo.Factura;

public class BillManager {
    
    List<Factura> uptcList = new UptcList<Factura>();


    public void addBill(Factura factura){
        if(searchBill(factura.getHeader().getBillNumber())==-1){
        	uptcList.add(factura);
        }
    }
    
    public UptcList<Factura> getUptcList() {
        return (UptcList<Factura>) uptcList;
    }

    public void setUptcList(UptcList<Factura> uptcList) {
        this.uptcList = uptcList;
    }

    public int searchBill(String factNumber){
        for (int i = 0; i < uptcList.size(); i++) {
            if(uptcList.get(i).getHeader().getBillNumber().equals(factNumber)){
            	return i;  
            }
        }
        return -1;
    }

    public Factura getBill(String factNumber) {
        int index = searchBill(factNumber);
        if(index!= -1){
            return uptcList.get(index);
        }
        return null;
    }
    
    public void deleteBill(String factNumber){
        int aux = searchBill(factNumber);
    if(aux != -1){
        uptcList.remove(aux);

    }else{
        throw new NullPointerException("Esa factura no existe");

    }

    }
    public void editBill(String factNumber){
        int index = searchBill(factNumber);
        if(index != -1){
            uptcList.get(index);
        }
    }
    
    public boolean checkPersonOnBillExist(String docNum) {
    	for (int i = 0; i < uptcList.size(); i++) {
			if (uptcList.get(i).getHeader().getClientDoc().equals(docNum)) {
				return true;
			}
		}
    	return false;
    }
}
