package Ventas;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(400, 400);
        ventana.setTitle("TITULOOOOS");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.BLUE);

        JPanel contenedor2 = new JPanel();
        JLabel label = new JLabel("2024-06-21");
        contenedor.add(label);

        JTextField campo1 = new JTextField();

        JButton boton = new JButton("Enviar");
        contenedor2.add(boton);

        ventana.add(contenedor);
        ventana.add(contenedor2);
        ventana.setVisible(true);
    }
}
