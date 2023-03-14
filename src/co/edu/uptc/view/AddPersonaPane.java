package co.edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.model.dinamic.UptcList;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class AddPersonaPane extends JPanel {
    
    private JLabel docTyJLabel;
    private JLabel docNumJLabel;
    private JLabel namesJLabel;
    private JLabel surNamesJLabel;
    private JLabel AdressJLabel;
    private JLabel cityJLabel;
    private JTextField doctyField;
    private JTextField docNumField;
    private JTextField namesField;
    private JTextField surNamesField;
    private JTextField AdressField;
    private JTextField cityField;
    private JButton returnButton;
    private ActionListener listener;
    private JButton doneButton;
    public AddPersonaPane(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(new Color(227,176,000));
        initComponents();
        this.setVisible(false);
    }

    private void initComponents() {
        initDocTyField();
        initDocNumField();
        initNamesField();
        initSurNamesField();
        initAdressField();
        initCityField();
        initReturnButton();
        addDoneButton();
    }

    private void initDocTyField() {
        docTyJLabel = new JLabel("Tipo de documento");
        docTyJLabel.setBounds(60, 100, 200, 20);
        this.add(docTyJLabel);
        doctyField = new JTextField();
        doctyField.setBounds(200, 100, 100, 20);
        this.add(doctyField);
    }

    private void initDocNumField() {
        docNumJLabel = new JLabel("Número de documento");
        docNumJLabel.setBounds(60, 200, 200, 20);
        this.add(docNumJLabel);
        docNumField = new JTextField();
        docNumField.setBounds(200, 200, 100, 20);
        this.add(docNumField);
    }

    private void initNamesField() {
        namesJLabel = new JLabel("Nombre");
        namesJLabel.setBounds(100, 300, 100, 20);
        this.add(namesJLabel);
        namesField = new JTextField();
        namesField.setBounds(200, 300, 100, 20);
        this.add(namesField);
    }

    private void initSurNamesField() {
        surNamesJLabel = new JLabel("Apellidos");
        surNamesJLabel.setBounds(100, 400, 100, 20);
        this.add(surNamesJLabel);
        surNamesField = new JTextField();
        surNamesField.setBounds(200, 400, 100, 20);
        this.add(surNamesField);
    }

    private void initAdressField() {
        AdressJLabel = new JLabel("Dirección");
        AdressJLabel.setBounds(100, 500, 100, 20);
        this.add(AdressJLabel);
        AdressField = new JTextField();
        AdressField.setBounds(200, 500, 100, 20);
        this.add(AdressField);
    }

    private void initCityField() {
        cityJLabel = new JLabel("Ciudad");
        cityJLabel.setBounds(100, 600, 100, 20);
        this.add(cityJLabel);
        cityField = new JTextField();
        cityField.setBounds(200, 600, 100, 20);
        this.add(cityField);
    }

    
    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(400, 530,100,20);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
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
    private void addDoneButton() {
        doneButton = new JButton("done");
        doneButton.setBounds(550, 530, 100, 20);
        doneButton.setBackground(Color.red);
        doneButton.setActionCommand("donePersona");
        doneButton.addActionListener(listener);
        this.add(doneButton);
    }
    public void clearText() {
        docNumField.setText("");
        doctyField.setText("");
        namesField.setText("");
        surNamesField.setText("");
        AdressField.setText("");
        cityField.setText("");
    }
}