package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class OptPanelPerson extends JPanel {

    private JButton addButton;
    private JButton removeButton;
    private JButton editButton;
    private ActionListener listener;
    private JButton returnButton;
    private JTextField takeIndex;
    private JTextField takeDoctype;
    private JLabel documentJLabel;
    private JLabel typeDocJLabel;

    public OptPanelPerson(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);
        this.setPreferredSize(new Dimension(520, 400));
        this.setBackground(new Color(50, 75, 100));
        initComponents();
        this.setVisible(false);

    }

    private void initComponents() {
        initAddButton();
        initRemoveButton();
        initTakeIndex();
        initEditButton();
        initReturnButton();
        initTakeDocType();
        initLabels();
    }
    private void initLabels(){
        documentJLabel = new JLabel("Documento");
        documentJLabel.setBounds(150,390,100,20);
        this.add(documentJLabel);
        typeDocJLabel = new JLabel("Tipo de documento");
        typeDocJLabel.setBounds(150,490,120,20);
        this.add(typeDocJLabel);
    }
    private void initAddButton() {
        addButton = new JButton("Añadir persona");
        addButton.setBounds(170, 150, 200, 40);
        addButton.addActionListener(listener);
        addButton.setActionCommand("addPerson");
        this.add(addButton);
    }

    private void initRemoveButton() {
        removeButton = new JButton("Eliminar persona");
        removeButton.setBounds(80, 340, 200, 40);
        removeButton.addActionListener(listener);
        removeButton.setActionCommand("removePerson");
        this.add(removeButton);
    }

    private void initTakeIndex() {
        takeIndex = new JTextField(200);
        takeIndex.setBounds(300, 390, 200, 40);
        takeIndex.addActionListener(listener);
        takeIndex.setActionCommand("takeIndex");
        this.add(takeIndex);
    }
    private void initTakeDocType() {
        takeDoctype = new JTextField(200);
        takeDoctype.setBounds(300, 490, 200, 40);
        takeDoctype.addActionListener(listener);
        takeDoctype.setActionCommand("takeDocType");
        this.add(takeDoctype);
    }
    public String getTakeIndex() {

        return takeIndex.getText();
    }
    public String getTakeDocType() {

        return takeDoctype.getText();
    }
    public void emptyIndexField(){
        takeIndex.setText("");
    }
    public void emptyDocTypeField(){
        takeDoctype.setText("");
    }

    private void initEditButton() {
        editButton = new JButton("Editar persona");
        editButton.setBounds(80, 550, 200, 40);
        editButton.addActionListener(listener);
        editButton.setActionCommand("editPerson");
        this.add(editButton);
    }

    private void initReturnButton() {
        returnButton = new JButton("Volver");
        returnButton.setBounds(170, 650, 200, 40);
        returnButton.setBackground(Color.red);
        returnButton.addActionListener(listener);
        returnButton.setActionCommand("return");
        this.add(returnButton);
    }
}
