package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainpanel extends JPanel {
    private JButton personasButton;
    private JButton productosButton;
    private JButton facturaButton;
    private final static Color color = Color.red;

    private ActionListener listener;

    public Mainpanel(ActionListener listener) {
        this.listener = listener;
        this.setLayout(null);

        this.setPreferredSize(new Dimension(350, 800));
        this.setBackground(new Color(0, 0, 0));

        this.setVisible(true);
        initComponents();
    }

    private void initComponents() {
        initPersonasButton();
        initProductosButton();
        initFacturaButton();
    }

    private void initPersonasButton() {
        personasButton = new JButton("Personas");
        personasButton.addActionListener(listener);
        personasButton.setActionCommand("personas");
        personasButton.setBounds(120, 250, 100, 40);
        personasButton.setBackground(color);
        this.add(personasButton);
    }

    private void initProductosButton() {
        productosButton = new JButton("Productos");
        productosButton.addActionListener(listener);
        productosButton.setActionCommand("productos");
        productosButton.setBounds(120, 350, 100, 40);
        productosButton.setBackground(color);
        this.add(productosButton);
    }

    private void initFacturaButton() {
        facturaButton = new JButton("Factura");
        facturaButton.addActionListener(listener);
        facturaButton.setActionCommand("factura");
        facturaButton.setBounds(120, 450, 100, 40);
        facturaButton.setBackground(color);
        this.add(facturaButton);
    }

    public JButton getPersonasButton() {
        return personasButton;
    }

    public JButton getProductosButton() {
        return productosButton;
    }

    public JButton getFacturaButton() {
        return facturaButton;
    }

    public static Color getColor() {
        return color;
    }

    public ActionListener getListener() {
        return listener;
    }
}
