package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.model.dinamic.UptcList;

public class EditProdPane extends JPanel{
    JLabel barCodLabel;
    JLabel ciuLabel;
    JLabel descriptionLabel;
    JLabel unitPriceLabel;

    JTextField barCodeText;
    JTextField ciuText;
    JTextField descriptionText;
    JTextField unitPriceText;
    ActionListener listener;
	JButton returnButton;
	JButton doneButton;


    public EditProdPane(ActionListener listener) {
        this.listener = listener;

    this.setLayout(null);
     this.setPreferredSize(new Dimension(800,800));
     this.setBackground(new Color(227,176,000));
        initComponents();   
        addTextFields();
        initReturnButton();
        addDoneButton();
    }
    private void initComponents() {

        barCodLabel = new JLabel("Bar Code:");
        barCodLabel.setBounds(150,200,200,20);
        this.add(barCodLabel);

        ciuLabel = new JLabel("CIU:");
        ciuLabel.setBounds(150,250,200,20);
        this.add(ciuLabel);
        
        descriptionLabel = new JLabel("Description:");
        descriptionLabel.setBounds(150,300,200,20);
        this.add(descriptionLabel);

        unitPriceLabel = new JLabel("Unit Price:");
        unitPriceLabel.setBounds(150,350,200,20);
        this.add(unitPriceLabel);


    }
    private void addTextFields(){
        
        barCodeText = new JTextField();
        barCodeText.setBounds(350,200,200,20);
        barCodeText.addActionListener(listener);
        this.add(barCodeText);

        ciuText = new JTextField();
        ciuText.setBounds(350,250,200,20);
        ciuText.addActionListener(listener);
        this.add(ciuText);

        descriptionText = new JTextField();
        descriptionText.setBounds(350,300,200,20);
        descriptionText.addActionListener(listener);
        this.add(descriptionText);

        unitPriceText = new JTextField();
        unitPriceText.setBounds(350,350,200,20);
        this.add(unitPriceText);
    }
    
    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(400, 530,100,20);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
    }

    private void addDoneButton() {
        doneButton = new JButton("done");
        doneButton.setBounds(550, 530, 100, 20);
        doneButton.setBackground(Color.red);
        doneButton.setActionCommand("doneProductEdit");
        doneButton.addActionListener(listener);
        this.add(doneButton);
    }
    
    public UptcList<String> getTextsJTextField() {
        UptcList<String> contents = new UptcList<>();
        contents.add(  barCodLabel.getText());
        contents.add(  ciuText.getText());
        contents.add(  descriptionText.getText());
        contents.add(  unitPriceText.getText());
        return contents;
    }
    
    public void setData(String barCod, String ciu, String description, String unitPrice) {
        barCodLabel.setText(barCod);;
        ciuText.setText(ciu);;
        descriptionText.setText(description);;
        unitPriceText.setText(unitPrice);;
    }
    
    public void cleanFields() {
        barCodLabel.setText("");;
        ciuText.setText("");;
        descriptionText.setText("");;
        unitPriceText.setText("");;
    }
}