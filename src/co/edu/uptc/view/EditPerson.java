package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.model.dinamic.UptcList;

import java.awt.event.ActionListener;

public class EditPerson extends JPanel{

    JTextField doctyField;
    JTextField namesField;
    JTextField surNamesField;
    JTextField addressField;
    JTextField docNumField;
    JTextField AdressField;
    JTextField cityField;
    JLabel doctyLabel;
    JLabel namesLabel;
    JLabel surNamesLabel;
    JLabel docNumLabel;
    JLabel AdressLabel;
    JLabel addressLabel;
    JButton doneButton;
    JButton returnButton;
    JLabel cityLabel;
    private ActionListener listener;

    public EditPerson(ActionListener listener){
        this.listener = listener;
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.green);
        initComponents();
        initLabels();
        addDoneButton();
        initReturnButton();
        this.setVisible(false);

    }
    private void initLabels(){
        doctyLabel = new JLabel("Tipo de documento:");
        doctyLabel.setBounds(150,100,200,20);
        this.add(doctyLabel);
        
        docNumLabel = new JLabel("Numero de documento");
        docNumLabel.setBounds(150,150,200,20);
        this.add(docNumLabel);

        namesLabel = new JLabel("Nombres");
        namesLabel.setBounds(150,200,200,20);
        this.add(namesLabel);
        

        surNamesLabel = new JLabel("Apellidos");
        surNamesLabel.setBounds(150,250,200,20);
        this.add(surNamesLabel);

        
        AdressLabel = new JLabel("Direccion");
        AdressLabel.setBounds(150,300,200,20);
        this.add(AdressLabel);


        cityLabel = new JLabel("Ciudad");
        cityLabel.setBounds(150,350,200,20);
        this.add(cityLabel);

    }

 
    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(400, 530,100,20);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
    }
    private void initComponents(){
     
        doctyField = new JTextField(200);
        doctyField.setBounds(350,100,200,20);
        doctyField.addActionListener(listener);
        this.add(doctyField);

        docNumField = new JTextField(200);
        docNumField.setBounds(350,150,200,20);
        docNumField.addActionListener(listener);
        this.add(docNumField);

        namesField = new JTextField(200);
        namesField.setBounds(350,200,200,20);
        namesField.addActionListener(listener);
        this.add(namesField);

        surNamesField = new JTextField(200);
        surNamesField.setBounds(350,250,200,20);
        surNamesField.addActionListener(listener);
        this.add(surNamesField);

        
        AdressField = new JTextField(200);
        AdressField.setBounds(350,300,200,20);
        AdressField.addActionListener(listener);
        this.add(AdressField);

        cityField = new JTextField(200);
        cityField.setBounds(350,350,200,20);
        cityField.addActionListener(listener);
        this.add(cityField);

        
    }
    private void addDoneButton() {
        doneButton = new JButton("done");
        doneButton.setBounds(550, 530, 100, 20);
        doneButton.setBackground(Color.green);
        doneButton.setActionCommand("donePersonaEdit");
        doneButton.addActionListener(listener);
        this.add(doneButton);
    }
    
    public UptcList<String> getTextsJTextField() {
        UptcList<String> contents = new UptcList<>();
        contents.add(doctyField.getText());
        contents.add(docNumField.getText());
        contents.add(namesField.getText());
        contents.add(surNamesField.getText());
        contents.add(AdressField.getText());
        contents.add(cityField.getText());
        return contents;
    }
    
    public void clearText() {
    	doctyField.setText("");
        docNumField.setText("");
        namesField.setText("");
        surNamesField.setText("");
        AdressField.setText("");
        cityField.setText("");
    }
    
    public void setData(String docType, String docNum, String names, String surnames, String adress, String city) {
        doctyField.setText(docType);
    	docNumField.setText(docNum);
        namesField.setText(names);
        surNamesField.setText(surnames);
        AdressField.setText(adress);
        cityField.setText(city);
    }
    
    public void disableFields() {
    	doctyField.setEditable(false);
    	docNumField.setEditable(false);
    }
    
    public void enableFields() {
    	doctyField.setEditable(true);
    	docNumField.setEditable(true);
    }
}
