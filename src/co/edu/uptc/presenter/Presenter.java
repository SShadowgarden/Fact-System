package co.edu.uptc.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.uptc.model.BillManager;
import co.edu.uptc.model.PersonaManager;
import co.edu.uptc.model.ProductosManager;
import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.model.vector.UptcVector;
import co.edu.uptc.pojo.Factura;
import co.edu.uptc.pojo.Persona;
import co.edu.uptc.pojo.Productos;
import co.edu.uptc.view.BillEdit;
import co.edu.uptc.view.MainFrame;

public class Presenter implements ActionListener {

    private MainFrame view;
    List<String> upctVector = new UptcVector<>();
    private BillManager billModel;
    private PersonaManager personaModel;
    private ProductosManager productosModel;

    public Presenter() {
        billModel = new BillManager();
        personaModel = new PersonaManager();
        productosModel = new ProductosManager();
        view = new MainFrame(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("personas")) {
            view.hidePanes();
            view.addOptPerson();

        } else if (e.getActionCommand().equals("return")) {
            view.hidePanes();
        } else if (e.getActionCommand().equals("productos")) {
            view.hidePanes();
            view.AddOptPanelProduct();
        }else if(e.getActionCommand().equals("removeProduct")){
           try {
            if(view.getOptPanelProduct().getTakeIndex() != "" ){
                
                String aux = view.getOptPanelProduct().getTakeIndex();
                productosModel.deleteProduct(aux);
         }
           } catch (Exception err) {
            
            view.hidePanes();
            view.addErrorPane();
        }
          
        } else if (e.getActionCommand().equals("factura")) {
            view.hidePanes();
            view.addOptPanelBill();

        } else if (e.getActionCommand().equals("editPerson")) {
            view.getEditPerson().enableFields();
            if (!view.getOptPerson().getTakeIndex().equals("") && !view.getOptPerson().getTakeDocType().equals("")) {
            	String docNum = view.getOptPerson().getTakeIndex();
            	boolean exist = billModel.checkPersonOnBillExist(docNum);
            	Persona person = personaModel.getPerson(docNum);
            	if (person != null && person.getDocType().equals(view.getOptPerson().getTakeDocType())) {
            		view.hidePanes();
                	view.addEditPersonPanel();
            		view.getEditPerson().setData(person.getDocType(), person.getDocNumber(), person.getNames(), person.getSurNames(), person.getAdress(), person.getCity());
                	if (exist) {
                		view.getEditPerson().disableFields();	
                	}
            	} else {
            		JOptionPane.showMessageDialog(null, "La persona no existe");
            	}
            	
            } else{
                JOptionPane.showMessageDialog(null, "Ingrese valores validos");
            }
        } else if (e.getActionCommand().equals("addProduct")) {
            view.hidePanes();
            view.addProductsAdd();
        } else if (e.getActionCommand().equals("doneProduct")) {
            List<String> aux = view.getProductsAdd().getTextsJTextField();
            if (productosModel.addProduct(new Productos(aux.get(0), aux.get(1), aux.get(2), aux.get(3)))) {
                view.getProductsAdd().clearText();
            } else {
                JOptionPane.showMessageDialog(null, "Operación fallida");
            }
        } else if (e.getActionCommand().equals("addPerson")) {
            view.hidePanes();
            view.addPersonaPane();
        } else if (e.getActionCommand().equals("donePersona")) {
            List<String> aux = view.getAddPersonaPane().getTextsJTextField();
            if (personaModel.AddPersona(new Persona(aux.get(0), aux.get(1), aux.get(2), aux.get(3), aux.get(4), aux.get(5)))) {
                view.getAddPersonaPane().clearText();
            } else {
                JOptionPane.showMessageDialog(null, "Operación fallida");
            }
        } else if (e.getActionCommand().equals("removePerson")) {
        	personaModel.xd();
            if(!view.getOptPerson().getTakeIndex().equals("") && !view.getOptPerson().getTakeDocType().equals("")){
            	personaModel.DeletePersona(view.getOptPerson().getTakeIndex(), view.getOptPerson().getTakeDocType());
            } else{
                JOptionPane.showMessageDialog(null, "Ingrese valores validos");
            }
            
    }else if(e.getActionCommand().equals("addBill")){
            view.hidePanes();
            view.addBillPaneAdd();


        }else if(e.getActionCommand().equals("saveButton")){
            UptcList<String> headerData =   view.getbillPaneAdd().getTextsJTextField();
            UptcList<Productos> productosList = view.getbillPaneAdd().getProductosList();
            UptcList<Integer> amountsProductos = view.getbillPaneAdd().getAmounts();
            Factura bill = new Factura(headerData,productosList, amountsProductos);
              billModel.addBill(bill);
              view.getbillPaneAdd().setSubToTextField(bill.getSubTotal());
              view.getbillPaneAdd().setIVATextField(bill.getIVA());
              view.getbillPaneAdd().setTotalTextField(bill.getTotal());

              view.getbillPaneAdd().clearText();
              view.getbillPaneAdd().clearAddFields();
             // view.getbillPaneAdd().eraseList();
            

        }else if(e.getActionCommand().equals("addNewProductInBill")){
            List<String> getParams = view.getbillPaneAdd().getAddThing();
            view.getbillPaneAdd().fillList(productosModel.searchProductObj(getParams.get(0)),Integer.parseInt(getParams.get(1)));
        } else if(e.getActionCommand().equals("donePersonaEdit")) {
        	UptcList<String> contents = view.getEditPerson().getTextsJTextField();
        	personaModel.editPerson(view.getOptPerson().getTakeIndex(),contents.get(0), contents.get(1), contents.get(2), contents.get(3), contents.get(4), contents.get(5));
        	view.getEditPerson().clearText();
        } else if (e.getActionCommand().equals("editProduct")) {
        	if (!view.getOptPanelProduct().getTakeIndex().equals("")) {
        		String ciu = view.getOptPanelProduct().getTakeIndex();
        		Productos product = productosModel.searchProductObj(ciu);
        		if (product != null) {
                	view.hidePanes();
                	view.addEditProdPane();
        			view.getEditProdPane().setData(product.getBarCode(), product.getCiu(), product.getDescription(), product.getUnitPrice());
        		} else {
        			JOptionPane.showMessageDialog(null, "El producto no existe");
        		}
        	} else {
        		JOptionPane.showMessageDialog(null, "Ingrese valores validos");
        	}
        } else if (e.getActionCommand().equals("doneProductEdit")){
        	UptcList<String> contents = view.getEditProdPane().getTextsJTextField();
        	productosModel.editProduct(view.getOptPanelProduct().getTakeIndex(), contents.get(0), contents.get(1), contents.get(2), contents.get(3));
        	view.getEditProdPane().cleanFields();  
        }else if(e.getActionCommand().equals("removeBill")){
            try {

                if(view.getOptPanelProduct().getTakeIndex().equals("")){
                    
                    int aux = billModel.searchBill(view.getOptPanelBill().getText());
                    billModel.deleteBill(""+aux);
                }
               } catch (Exception err) {
                
                view.hidePanes();
                view.addErrorPane();
            }
              
        
        } else if(e.getActionCommand().equals("editBill")) {
            if (!view.getOptPanelBill().getText().equals("")) {
                String id = view.getOptPanelBill().getText();
                Factura bill = billModel.getBill(id);
                System.out.println("paso 1");
                if (bill != null) {
                    view.hidePanes();
                    view.addEditBillPane();
                    System.out.println("paso 2");
                    view.getBillEdit().setData(bill.getHeader().getBillNumber(), bill.getHeader().getBillDate(), bill.getHeader().getClientDoc(), bill.getDeatail().getProducts(), bill.getDeatail().getAmounts(), bill.getSubTotal(), bill.getIVA(), bill.getTotal());
                }
            }
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }

    }

}
