package lol;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(400, 200);
        ventana.setTitle("Calculadora de Suma");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel contenedor
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(3, 2, 10, 10)); // 3 filas, 2 columnas, 10px de espacio entre componentes
        contenedor.setBackground(Color.LIGHT_GRAY);

        // Crear componentes
        JLabel label1 = new JLabel("Número 1:");
        JTextField campo1 = new JTextField(10);
        JLabel label2 = new JLabel("Número 2:");
        JTextField campo2 = new JTextField(10);
        JButton botonCalcular = new JButton("Calcular");
        JLabel resultado = new JLabel("Resultado:");

        // Agregar componentes al contenedor
        contenedor.add(label1);
        contenedor.add(campo1);
        contenedor.add(label2);
        contenedor.add(campo2);
        contenedor.add(botonCalcular);
        contenedor.add(resultado);

        // Agregar el contenedor al frame
        ventana.add(contenedor);

        // Hacer visible la ventana
        ventana.setVisible(true);

        // Agregar ActionListener al botón
        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener los números de los campos de texto
                    double numero1 = Double.parseDouble(campo1.getText());
                    double numero2 = Double.parseDouble(campo2.getText());

                    // Realizar la suma
                    double suma = numero1 + numero2;

                    // Mostrar el resultado
                    resultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    // Manejar el error si el texto ingresado no es un número válido
                    resultado.setText("Por favor, ingrese números válidos.");
                }
            }
        });
    }
}
