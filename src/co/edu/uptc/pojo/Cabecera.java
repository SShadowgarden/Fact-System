package co.edu.uptc.pojo;


public class Cabecera {
    public String billNumber;
    public String billDate;
    public String clientDoc;
    
    
    public String getClientDoc() {
		return clientDoc;
	}
	public void setClientDoc(String clientDoc) {
		this.clientDoc = clientDoc;
	}
	public String getBillNumber() {
        return billNumber;
    }
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }
    public String getBillDate() {
        return billDate;
    }
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
    public String clientDoc() {
        return clientDoc;
    }
    public void clientDoc(String clientDoc) {
        this.clientDoc = clientDoc;
    }
    public Cabecera(String billNumber, String billDate, String clientDoc) {
        this.billNumber = billNumber;
        this.billDate = billDate;
        this.clientDoc = clientDoc;
    }
    
}
