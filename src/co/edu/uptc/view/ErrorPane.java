package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Font;

public class ErrorPane extends JPanel{

JButton exit ;
JLabel message;
ActionListener listener;
    public ErrorPane(ActionListener listener) {
        this.listener = listener;
        this.setBackground(Color.orange);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,400));
        this.setVisible(true);
        initComponents();
    }

    public void initComponents() {

        exit = new JButton("Salir");
        exit.setBounds(400,450,100,40);
        exit.addActionListener(listener);
        exit.setActionCommand("return");

        Font font = new Font("Arial", Font.BOLD, 18);

        message = new JLabel("Ingrese un valor valido");
        message.setFont(font);
        message.setBounds(350,300,300,20);
        this.add(exit);
        this.add(message);

    }
    
}
