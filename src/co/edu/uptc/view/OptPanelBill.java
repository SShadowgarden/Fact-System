package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class OptPanelBill extends JPanel {

    private JButton addButton;
    private JButton removeButton;
    private JLabel factNumJLabel;
    private JButton editButton;
    private ActionListener listener;
    private JButton returnButton;
    private JTextField takeIndex;

    public OptPanelBill(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);
        initComponents();
        this.setPreferredSize(new Dimension(520, 400));
        this.setBackground(new Color(50, 75, 100));
        this.setVisible(false);
    }

    private void initComponents() {
        initAddButton();
        initRemoveButton();
        initTakeIndex();
        initEditButton();
        initReturnButton();
        initLabel();
    }

    private void initAddButton() {
        addButton = new JButton("Añadir Factura");
        addButton.setBounds(170, 150, 200, 40);
        addButton.addActionListener(listener);
        addButton.setActionCommand("addBill");
        this.add(addButton);
    }

    private void initRemoveButton() {
        removeButton = new JButton("Eliminar Factura");
        removeButton.setBounds(80, 350, 200, 40);
        removeButton.addActionListener(listener);
        removeButton.setActionCommand("removeBill");
        this.add(removeButton);
    }

    private void initTakeIndex() {
        takeIndex = new JTextField(200);
        takeIndex.setBounds(300, 390, 200, 40);
        takeIndex.addActionListener(listener);
        takeIndex.setActionCommand("takeIndex");
        this.add(takeIndex);
    }
    public String getText(){
        return takeIndex.getText();
    }
    private void initLabel(){
        factNumJLabel = new JLabel("Número de Factura");
        factNumJLabel.setBounds(150, 390, 150, 40);
        this.add(factNumJLabel);
    }
    private void initEditButton() {
        editButton = new JButton("Editar Factura");
        editButton.setBounds(80, 450, 200, 40);
        editButton.addActionListener(listener);
        editButton.setActionCommand("editBill");
        this.add(editButton);
    }

    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(170, 550, 200, 40);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
    }

}
