package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.pojo.Productos;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BillPaneAdd extends JPanel {
   
       
JLabel nFactlabel ;
JLabel dateLabel ;
JLabel clientLabel ;
JLabel amountLabel ;
JLabel totalCostLabel ;
JLabel subTotalLabel ;
JLabel productIdJLabel;
JLabel  ivaLabel;
JTextField getProducTextField;
JTextField getAmountTextField;

JTextField nFacturaT;
JTextField fechaText;
JTextField clienteTextField;

JTextField totalValuField;
JTextField ivaTextField;
JTextField subToTextField;



JTable productsTable;
JButton returnButton;
JButton addButton;
DefaultTableModel modeloTabla;
JButton doneButton;
JScrollPane panelTabla ;

UptcList<Integer> amounts = new UptcList<>();

int amount =0;
int subTotal = 0;
private ActionListener listener;
private UptcList<Productos> productosList = new UptcList<Productos>();

    public BillPaneAdd(ActionListener listener){
        this.listener = listener;
       this.setLayout(null);

        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(800,800));
        addLabels();
        addOptions();
        addTextFields();
        createTableClients();
        this.setVisible(true);

    }
    
    public UptcList<Productos> getProductosList() {
        return productosList;
    }
    
    public UptcList<Integer> getAmounts() {
        return amounts;
    }

    public void fillList(Productos prodList, Integer amount){
        System.out.println(prodList.toString()+ " siay");
        productosList.add(prodList);
        amounts.add(amount);
        createTableClients();
    }
    public int setAmount(int cant){
        this.amount = cant;
        return amount;
    }
    

    public int getSubTotal() {
        return subTotal;
    }

    /*public void eraseList(){
        productosList.clear();
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
    }*/
    
    public void createTableClients(){
       
        List<Object[]> datos = new ArrayList<>();
         modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("N° de item");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("V. Unit");
        modeloTabla.addColumn("Cantidad");
        
        for (int y = 0; y < productosList.size(); y++) {
            Productos producto = productosList.get(y);
            Object[] fila = {
                y + 1, 
                producto.getCiu(),
                producto.getDescription(),
                producto.getUnitPrice(),
                amounts.get(y)
            };
            datos.add(fila);
        }
        for(Object[] fila : datos) {
            modeloTabla.addRow(fila);
        }

        productsTable = new JTable(modeloTabla);
        productsTable.setFont(new java.awt.Font("Tahoma", 0, 12));
        panelTabla = new JScrollPane(productsTable);
        productsTable.getTableHeader().setResizingAllowed(true);
        panelTabla.setBounds(100,210,400,300);
        panelTabla.setVisible(true);
        this.add(panelTabla);
        

    }


    public void addTextFields(){
        getProducTextField = new JTextField(200);
        getProducTextField.setBounds(100,180,100,20); 
        getProducTextField.addActionListener(listener);
        getProducTextField.setActionCommand("getProductId");
        this.add(getProducTextField);

        getAmountTextField = new JTextField(200);
        getAmountTextField.setBounds(250,180,100,20);
        getAmountTextField.addActionListener(listener);
        getAmountTextField.setActionCommand("getProductAmount");
        this.add(getAmountTextField);

    }

    public void addLabels(){
        nFactlabel = new JLabel("N° de Factura");
        nFactlabel.setBounds(100,30, 100,20);
        this.add(nFactlabel);

        dateLabel = new JLabel("Fecha");
        dateLabel.setBounds(100,50, 100,20);
        this.add(dateLabel);

        clientLabel = new JLabel("Cliente");
        clientLabel.setBounds(100,70,100,20);
        this.add(clientLabel);
        

        amountLabel = new JLabel("Cantidad");
        amountLabel.setBounds(250,160,80,20);
        this.add(amountLabel);

        productIdJLabel = new JLabel("Product ID");
        productIdJLabel.setBounds(100,160,100,20);
        this.add(productIdJLabel);

        subTotalLabel = new JLabel("Valor Total");
        subTotalLabel.setBounds(100,580,100,20);
        this.add(subTotalLabel);

        ivaLabel = new JLabel("IVA");
        ivaLabel.setBounds(100,600,100,20);
        this.add(ivaLabel);

        totalCostLabel  = new JLabel("Total a Pagar");
        totalCostLabel.setBounds(100,620,300,20);
        this.add(totalCostLabel);
     

    }
    public void addOptions(){
        nFacturaT = new JTextField(200);
        nFacturaT.setBounds(210,30,100,20);
        nFacturaT.addActionListener(listener);
        nFacturaT.setActionCommand("getNFactura");
        this.add(nFacturaT);


        fechaText = new JTextField(200);
        fechaText.setBounds(210,50,100,20);
        fechaText.addActionListener(listener);
        fechaText.setActionCommand("getFecha");
        this.add(fechaText);

        clienteTextField = new JTextField(200);
        clienteTextField.setBounds(210,70,100,20);
        clienteTextField.addActionListener(listener);
        clienteTextField.setActionCommand("getCliente");
        this.add(clienteTextField);

        
        returnButton = new JButton("Volver");
        returnButton.setBounds(480,710,100,20);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);

        doneButton = new JButton("Guardar");
        doneButton.setBounds(600,710,100,20);
        doneButton.setBackground(Color.red);
        doneButton.addActionListener(listener);
        doneButton.setActionCommand("saveButton");
        this.add(doneButton);

        addButton = new JButton("Añadir");
        addButton.setBounds(400,180,100,20);
        addButton.setBackground(Color.red);
        addButton.addActionListener(listener);
        addButton.setActionCommand("addNewProductInBill");
        this.add(addButton);
           
        totalValuField = new JTextField(200);
        totalValuField.setBounds(200,620,100,20);
        totalValuField.addActionListener(listener);
        totalValuField.setActionCommand("getTotal");
        this.add(totalValuField);

        ivaTextField = new JTextField(200);
        ivaTextField.setBounds(200,600,100,20);
        ivaTextField.addActionListener(listener);
        ivaTextField.setActionCommand("getIva");
        this.add(ivaTextField);

        subToTextField = new JTextField(200);
        subToTextField.setBounds(200,580,100,20);
        subToTextField.addActionListener(listener);
        subToTextField.setActionCommand("getSubTo");
        this.add(subToTextField);
        
    }
    public void setSubToTextField(double value) {
        subToTextField.setText("" + value );
    }
    public void setIVATextField(double value) {
        ivaTextField.setText(""+ value );
    }
    public void setTotalTextField(double value) {
        totalValuField.setText("" + value );
    }

    public UptcList<String> getTextsJTextField() {
        UptcList<String> contents = new UptcList<>();
        contents.add(nFacturaT.getText());
        contents.add(fechaText.getText());
        contents.add(clienteTextField.getText());
        
        return contents;
    }
    public UptcList<String> getAddThing(){
        UptcList<String> toAdd= new UptcList<>();
        toAdd.add(getProducTextField.getText());
        toAdd.add(getAmountTextField.getText());

        return toAdd;
    }
    
    public void clearText() {
        nFacturaT.setText("");
        fechaText.setText("");
        clienteTextField.setText("");
       
    }
    public void clearAddFields(){
        getProducTextField.setText("");
        getAmountTextField.setText(""); 
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
            
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        g2d.fillRect(60, 650, 680,20);

        g2d.fillRect(60, 0, 680, 20);

        g2d.fillRect(60,20,20,630);

        g2d.fillRect(720,20,20,630);


    }
}

