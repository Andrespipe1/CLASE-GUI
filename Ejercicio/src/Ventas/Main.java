package Ventas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(400, 400);
        ventana.setTitle("TITULOOOOS");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.GRAY);

        JPanel contenedor2 = new JPanel();
        contenedor2.setBackground(Color.orange);
        JLabel label = new JLabel("Calculos");

        contenedor.add(label);

        JTextField campo1 = new JTextField();
        campo1.setPreferredSize(new Dimension(200,25));
        contenedor.add(campo1);

        JButton boton = new JButton("Enviar");
        contenedor2.add(boton);


        //Agregar un boton de login
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        contenedor2.add(loginButton);


        //Agregar un actionlistener al boton
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = campo1.getText();
                JOptionPane.showMessageDialog(contenedor, "Hello "+user);
                JOptionPane.showMessageDialog(contenedor, "Adios "+user+" Usuario");

            }
        });

        ventana.add(contenedor);
        ventana.add(contenedor2);
        ventana.setVisible(true);
    }
}
