package co.edu.uptc.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBill extends JPanel {
  
    JLabel billNumberJLabel;
    JTextField billNumberJTextField;
    JLabel billDateJLabel;
    JTextField billDateJTextField;
    JLabel clientJLabel;
    JTextField clientJTextField;
    JLabel itemNumberJLabel;
    JTextField itemNumberJTextField;
    JLabel productCodeJLabel;
    JTextField productCodeJTextField;
    JLabel productDescriptionJLabel;
    JTextField productDescriptionJTextField;
    JLabel unitValueJLabel;
    JTextField unitValueJTextField;
    JLabel amountJLabel;
    JTextField amountJTextField;
    JLabel totalValueJLabel;
    JTextField totalValueJTextField;
    JLabel ivaJLabel;
    JTextField ivaJTextField;
    JLabel totalJLabel;
    JTextField totalJTextField;

    public AddBill() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        createBillNumberLabel();
        createBillNumberTextField();
        createBillDateLabel();
        createBillDateTextField();
        createClientLabel();
        createClientTextField();
        createItemNumberLabel();
        createItemNumberTextField();
        createProductCodeLabel();
        createProductCodeTextField();
        createProductDescriptionLabel();
        createProductDescriptionTextField();
        createUnitValueLabel();
        createUnitValueTextField();
        createAmountLabel();
        createAmountTextField();
        createTotalValueLabel();
        createTotalValueTextField();
        createIvaLabel();
        createIvaTextField();
        createTotalLabel();
        createTotalTextField();
    }

    private void createBillNumberLabel() {
        billNumberJLabel = new JLabel("Numero de Factura");
        billNumberJLabel.setBounds(20, 50, 100, 20);
        this.add(billNumberJLabel);
    }

    private void createBillDateLabel() {
        billDateJLabel = new JLabel("Fecha de Factura");
        billDateJLabel.setBounds(20, 80, 100, 20);
        this.add(billDateJLabel);
    }

    private void createClientLabel() {
        clientJLabel = new JLabel("Cliente");
        clientJLabel.setBounds(20, 110, 100, 20);
        this.add(clientJLabel);
    }

    private void createItemNumberLabel() {
        itemNumberJLabel = new JLabel("Numero de Item");
        itemNumberJLabel.setBounds(20, 140, 100, 20);
        this.add(itemNumberJLabel);
    }

    private void createProductCodeLabel() {
        productCodeJLabel = new JLabel("Codigo Producto");
        productCodeJLabel.setBounds(20, 170, 100, 20);
        this.add(productCodeJLabel);
    }

    private void createProductDescriptionLabel() {
        productDescriptionJLabel = new JLabel("Descripcion Producto");
        productDescriptionJLabel.setBounds(20, 200, 100, 20);
        this.add(productDescriptionJLabel);
    }

    private void createUnitValueLabel() {
        unitValueJLabel = new JLabel("Valor Unitario");
        unitValueJLabel.setBounds(20, 230, 100, 20);
        this.add(unitValueJLabel);
    }

    private void createAmountLabel() {
        amountJLabel = new JLabel("Cantidad");
        amountJLabel.setBounds(20, 260, 100, 20);
        this.add(amountJLabel);
    }

    private void createTotalValueLabel() {
        totalValueJLabel = new JLabel("Total");
        totalValueJLabel.setBounds(20, 290, 100, 20);
        this.add(totalValueJLabel);
    }

    private void createIvaLabel() {
        ivaJLabel = new JLabel("Iva");
        ivaJLabel.setBounds(20, 320, 100, 20);
        this.add(ivaJLabel);
    }

    private void createTotalLabel() {
        totalJLabel = new JLabel("Total");
        totalJLabel.setBounds(20, 350, 100, 20);
        this.add(totalJLabel);
    }
    
    private void createBillNumberTextField() {
        billNumberJTextField = new JTextField();
        billNumberJTextField.setBounds(130, 50, 150, 20);
        this.add(billNumberJTextField);
    }

    private void createBillDateTextField() {
        billDateJTextField = new JTextField();
        billDateJTextField.setBounds(130, 80, 150, 20);
        this.add(billDateJTextField);
    }
    
    private void createClientTextField() {
        clientJTextField = new JTextField();
        clientJTextField.setBounds(130, 110, 150, 20);
        this.add(clientJTextField);
    }

    private void createItemNumberTextField() {
        itemNumberJTextField = new JTextField();
        itemNumberJTextField.setBounds(130, 140, 150, 20);
        this.add(itemNumberJTextField);
    }
    
    private void createProductCodeTextField() {
        productCodeJTextField = new JTextField();
        productCodeJTextField.setBounds(130, 170, 150, 20);
        this.add(productCodeJTextField);
    }
    
    private void createProductDescriptionTextField() {
        productDescriptionJTextField = new JTextField();
        productDescriptionJTextField.setBounds(130, 200, 150, 20);
        this.add(productDescriptionJTextField);
    }
    
    private void createUnitValueTextField() {
        unitValueJTextField = new JTextField();
        unitValueJTextField.setBounds(130, 230, 150, 20);
        this.add(unitValueJTextField);
    }
    
    private void createAmountTextField() {
        amountJTextField = new JTextField();
        amountJTextField.setBounds(130, 260, 150, 20);
        this.add(amountJTextField);
    }
    
    private void createTotalValueTextField() {
        totalValueJTextField = new JTextField();
        totalValueJTextField.setBounds(130, 290, 150, 20);
        this.add(totalValueJTextField);
    }
    
    private void createIvaTextField() {
        ivaJTextField = new JTextField();
        ivaJTextField.setBounds(130, 320, 150, 20);
        this.add(ivaJTextField);
    }
    
    private void createTotalTextField() {
        totalJTextField = new JTextField();
        totalJTextField.setBounds(130, 350, 150, 20);
        this.add(totalJTextField);
    }
    
    
}
