package co.edu.uptc.pojo;


import co.edu.uptc.model.dinamic.UptcList;

public class Factura {
    private Cabecera header;
    private Detalle deatail;
    private Pie foot;
    
    public Cabecera getHeader() {
        return header;
    }
    
    public void setHeader(Cabecera header) {
        this.header = header;
    }
    
    public Detalle getDeatail() {
        return deatail;
    }
    
    public void setDeatail(Detalle deatail) {
        this.deatail = deatail;
    }
    
    public Pie getFoot() {
        return foot;
    }
    
    public void setFoot(Pie foot) {
        this.foot = foot;
    }
    
    public Factura(UptcList<String> headerData, UptcList<Productos> productosList, UptcList<Integer> amountsProductos) {
        this.header = createHeader(headerData);;
        this.deatail = createDetail(productosList, amountsProductos);
        this.foot = createFoot(productosList, amountsProductos);
    }
    
    public Cabecera createHeader(UptcList<String> list) {
    	return new Cabecera(list.get(0), list.get(1), list.get(2));
    }
    
    public Detalle createDetail(UptcList<Productos> products, UptcList<Integer> amounts) {
    	return new Detalle(products, amounts);
    }
    
    public Pie createFoot(UptcList<Productos> products, UptcList<Integer> amounts) {
    	return new Pie(products, amounts);
    }
    
    public double getSubTotal() {
        return foot.getsubTotal();
    }
    
    public double getTotal() {
        return foot.getTotal();
    }
    
    public double getIVA() {
    	return foot.getIVA();
    }
}
