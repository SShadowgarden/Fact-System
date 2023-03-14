package co.edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.model.dinamic.UptcList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class addProductPane extends JPanel {

    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;
  
    private JLabel barCodLabel;
    private JLabel ciuLabel;
    private JLabel descriptionLabel;
    private JLabel unitPriceLabel;
    private JButton returnButton;
    private JButton doneButton;
    private ActionListener listener;

    public addProductPane(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(new Color(227,176,000));
        addComponents();
        this.setVisible(false);
    }

    private void addComponents() {
        addBarCodLabel();
        addCiuLabel();
        addDescriptionLabel();
        addUnitPriceLabel();
        addCampo1();
        addCampo2();
        addCampo3();
        addCampo4();
        addReturnButton();
        addDoneButton();
    }

    private void addBarCodLabel() {
        barCodLabel = new JLabel("Codigo de barras");
        barCodLabel.setBounds(100, 100, 100, 20);
        barCodLabel.setVisible(true);
        this.add(barCodLabel);
    }

    private void addCiuLabel() {
        ciuLabel = new JLabel("CIu");
        ciuLabel.setBounds(100, 140, 100, 20);
        ciuLabel.setVisible(true);
        this.add(ciuLabel);
    }

    private void addDescriptionLabel() {
        descriptionLabel = new JLabel("Descripción");
        descriptionLabel.setBounds(100, 180, 100, 20);
        descriptionLabel.setVisible(true);
        this.add(descriptionLabel);
    }

    private void addUnitPriceLabel() {
        unitPriceLabel = new JLabel("Precio unitario");
        unitPriceLabel.setBounds(100, 220, 100, 20);
        unitPriceLabel.setVisible(true);
        this.add(unitPriceLabel);
    }

    private void addCampo1() {
        campo1 = new JTextField(300);
        campo1.setBounds(250, 100, 200, 20);
        campo1.setActionCommand("barCode");
        campo1.addActionListener(listener);
        this.add(campo1);
    }

    private void addCampo2() {
        campo2 = new JTextField(300);
        campo2.setBounds(250, 140, 200, 20);
        campo2.setActionCommand("ciu");
        campo2.addActionListener(listener);
        this.add(campo2);
    }

    private void addCampo3() {
        campo3 = new JTextField(300);
        campo3.setBounds(250, 180, 200, 20);
        campo3.setActionCommand("description");
        this.add(campo3);
    }

    private void addCampo4() {
        campo4 = new JTextField(300);
        campo4.setBounds(250, 220, 200, 20);
        campo4.setActionCommand("unitPrice");
        this.add(campo4);
    }

    private void addReturnButton() {
        returnButton = new JButton("return");
        returnButton.setBounds(400, 530, 100, 20);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        this.add(returnButton);
    }
    private void addDoneButton() {
        doneButton = new JButton("done");
        doneButton.setBounds(550, 530, 100, 20);
        doneButton.setBackground(Color.green);
        doneButton.setActionCommand("doneProduct");
        doneButton.addActionListener(listener);
        this.add(doneButton);
    }
    public UptcList<String> getTextsJTextField() {
        UptcList<String> contents = new UptcList<>();
        contents.add(campo1.getText());
        contents.add(campo2.getText());
        contents.add(campo3.getText());
        contents.add(campo4.getText());
        return contents;
    }
    public void clearText() {
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
    }
}
