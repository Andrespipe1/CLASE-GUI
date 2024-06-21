import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Titulo de ventana ESFOT POO");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        //ventana.setLayout(new GridLayout(7, 2));
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));

        JLabel label = new JLabel("\tHola mundo");
        ventana.getContentPane().add(label);

        JButton boton = new JButton("Enviar");
        ventana.getContentPane().add(boton);

        JCheckBox check = new JCheckBox("Aceptas?");
        ventana.getContentPane().add(check);

        JTextField texto = new JTextField();
        ventana.getContentPane().add(texto);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        ventana.setJMenuBar(menuBar);


        String[] comboItems = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> combo = new JComboBox<>(comboItems);
        ventana.getContentPane().add(combo);

        JButton boton2 = new JButton("Enviar 2");
        ventana.getContentPane().add(boton2);

        ventana.setVisible(true);

    }
}