package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class OptPanelProduct extends JPanel{
    
    private JButton addButton;
    private JButton removeButton;
    private JLabel documentJLabel;
    private JButton editButton;
    private ActionListener listener;
    private JButton returnButton;
    private JTextField takeIndex;

    public OptPanelProduct(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);
        initComponents();
        initLabels();
        this.setPreferredSize(new Dimension(520,400));
        this.setBackground(new Color(50,75,100));
        this.setVisible(false);
    }

    private void initComponents() {
        initAddButton();
        initRemoveButton();
        initTakeIndex();
        initEditButton();
        initReturnButton();
    }
    
    private void initAddButton() {
        addButton = new JButton("Añadir Producto");
        addButton.setBounds(170,150,200,40);
        addButton.addActionListener(listener);
        addButton.setActionCommand("addProduct");
        this.add(addButton);
    }

    private void initRemoveButton() {
        removeButton = new JButton("Eliminar producto");
        removeButton.setBounds(80, 340, 200, 40);
        removeButton.addActionListener(listener);
        removeButton.setActionCommand("removeProduct");
        this.add(removeButton);
    }
    
    private void initTakeIndex() {
        takeIndex = new JTextField(200);
        takeIndex.setBounds(300,390,200,40);
        takeIndex.addActionListener(listener);
        takeIndex.setActionCommand("takeIndex");
        this.add(takeIndex);
    }
    
    private void initEditButton() {
        editButton = new JButton("Editar producto");
        editButton.setBounds(80, 550, 200, 40);
        editButton.addActionListener(listener);
        editButton.setActionCommand("editProduct");
        this.add(editButton);
    }
    
    private void initLabels(){
        documentJLabel = new JLabel("Ciu");
        documentJLabel.setBounds(150,390,100,20);
        this.add(documentJLabel);
    }
    
    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(170, 650, 200, 40);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
    }
    
    public String getTakeIndex() {

        return takeIndex.getText();
    }

}
