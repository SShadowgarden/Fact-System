package co.edu.uptc.view;

import java.awt.Color;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainFrame extends JFrame  {
    BillPaneAdd billPaneAdd;
    OptPanelPerson optPerson;
    Mainpanel mp;
    OptPanelBill optPanelBill;
    OptPanelProduct optPanelProduct;
    addProductPane productsAdd;
    BillEdit billEdit;
    AddPersonaPane addPersonaPane;
    EditProdPane editProdPane;
    EditPerson editPerson;
    ErrorPane errorPane;
    public MainFrame(ActionListener listener) {

        this.setSize(1200, 900);
        mp = new Mainpanel(listener);
        billEdit = new BillEdit(listener);
        errorPane = new ErrorPane(listener);
        optPanelProduct = new OptPanelProduct(listener);
        optPerson = new OptPanelPerson(listener);
        billPaneAdd = new BillPaneAdd(listener);
        optPanelBill = new OptPanelBill(listener);
        editProdPane = new EditProdPane(listener);
        editPerson = new EditPerson(listener);
        addPersonaPane = new AddPersonaPane(listener);
        productsAdd  = new addProductPane(listener);
        getContentPane().setBackground(Color.YELLOW);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mp, BorderLayout.WEST);
        this.setVisible(true);
    }

    public void hidePanes(){
        if( optPerson.isVisible() ==true){
            this.optPerson.setVisible(false);
        }else if(optPanelProduct.isVisible()==true){

           this.optPanelProduct.setVisible(false);

        }else if(billPaneAdd.isVisible() == true){
            this.billPaneAdd.setVisible(false);
        }else if(optPanelBill.isVisible() ==true){

           this.optPanelBill.setVisible(false);
        }else if(productsAdd.isVisible() ==true){

            this.productsAdd.setVisible(false);
        }else if(addPersonaPane.isVisible() == true){

            this.addPersonaPane.setVisible(false);
        }else if(editPerson.isVisible()==true){

            this.editPerson.setVisible(false);
        }else if(errorPane.isVisible()==true){

            this.errorPane.setVisible(false);
        }else if(editProdPane.isVisible()==true){
            this.editProdPane.setVisible(false);
        }else if(billEdit.isVisible() ==true){
             this.billEdit.setVisible(false);
        }else{

            System.out.println("a");
        }
    }
    public void addBillPaneAdd(){
        this.add(billPaneAdd);
        this.billPaneAdd.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addEditPersonPanel(){
        this.add(editPerson);
        this.editPerson.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addOptPerson(){
        this.add( optPerson);
        this.optPerson.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void AddOptPanelProduct(){

        this.add(optPanelProduct);
        this.optPanelProduct.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addEditProdPane(){
        this.add(editProdPane);
        this.editProdPane.setVisible(true);
        this.repaint();
        this.pack();
    }
    
    public void addOptPanelBill(){
        this.add(optPanelBill);
        this.optPanelBill.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addProductsAdd(){
        this.productsAdd.setVisible(true);
        this.add(productsAdd);
        this.repaint();
        this.pack();
    }
    public void addPersonaPane(){
        this.add(addPersonaPane);
        this.addPersonaPane.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addErrorPane(){
        this.add(errorPane);
        this.errorPane.setVisible(true);
        this.repaint();
        this.pack();
    }
    public void addEditBillPane(){
        this.add(billEdit);
        this.billEdit.setVisible(true);
        this.repaint();
        this.pack();
    }
    
    public BillEdit getBillEdit() {
        return billEdit;
    }

    public addProductPane getProductsAdd() {
        return productsAdd;
    }

    public BillPaneAdd getbillPaneAdd() {
        return billPaneAdd;
    }

    public void setbillPaneAdd(BillPaneAdd billPaneAdd) {
        this.billPaneAdd = billPaneAdd;
    }
    

    public EditProdPane getEditProdPane() {
        return editProdPane;
    }

    public void setEditProdPane(EditProdPane editProdPane) {
        this.editProdPane = editProdPane;
    }

    public OptPanelPerson getOptPerson() {
        return optPerson;
    }

    public void setOptPerson(OptPanelPerson optPerson) {
        this.optPerson = optPerson;
    }


    public Mainpanel getMp() {
        return mp;
    }

    public void setMp(Mainpanel mp) {
        this.mp = mp;
    }

    public OptPanelBill getOptPanelBill() {
        return optPanelBill;
    }

    public void setOptPanelBill(OptPanelBill optPanelBill) {
        this.optPanelBill = optPanelBill;
    }

    public OptPanelProduct getOptPanelProduct() {
        return optPanelProduct;
    }

    public void setOptPanelProduct(OptPanelProduct optPanelProduct) {
        this.optPanelProduct = optPanelProduct;
    }

    public void setProductsAdd(addProductPane productsAdd) {
        this.productsAdd = productsAdd;
    }

    public AddPersonaPane getAddPersonaPane() {
        return addPersonaPane;
    }

    public void setAddPersonaPane(AddPersonaPane addPersonaPane) {
        this.addPersonaPane = addPersonaPane;
    }

    public EditPerson getEditPerson() {
        return editPerson;
    }

    public void setEditPerson(EditPerson editPerson) {
        this.editPerson = editPerson;
    }

    
}
