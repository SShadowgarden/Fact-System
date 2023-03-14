package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import co.edu.uptc.model.PersonaManager;

public class PersonaPanel extends JPanel{

    private JTextField docTypeField;
    private JTextField docNumberField;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField addressField;
    private JTextField cityField;
    private ActionListener listener;
    private PersonaManager personaManager;

    public PersonaPanel(ActionListener listener){
        this.listener = listener;
        this.personaManager = new PersonaManager();
        initComponents();
        setupPanel();
    }

    private void initComponents(){
        docTypeField = createTextField("PersonDocType", 150, 100);
        docNumberField = createTextField("PersonDocNumber", 150, 130);
        nameField = createTextField("PersonName", 150, 160);
        surnameField = createTextField("PersonSurname", 150, 190);
        addressField = createTextField("PersonAddress", 150, 220);
        cityField = createTextField("PersonCity", 150, 250);
    }

    private JTextField createTextField(String actionCommand, int x, int y) {
        JTextField textField = new JTextField(200);
        textField.setBounds(x, y, 200, 20);
        textField.setActionCommand(actionCommand);
        textField.addActionListener(listener);
        this.add(textField);
        return textField;
    }

    private void setupPanel() {
        this.setPreferredSize(new Dimension(400, 500));
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.orange);
    }

}
