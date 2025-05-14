package fx.pastelpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pastelpoo extends JFrame implements ActionListener {
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    public JButton boton;

    public Pastelpoo() {
        cuadro();
        captura();
    }

    private void cuadro() {
        this.setTitle("Solicitud de pedido");
        this.setSize(410, 610);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void captura() {
        texto1 = new JLabel("Nombre");
        caja1 = new JTextField();
        texto1.setBounds(50, 50, 200, 25);
        caja1.setBounds(150, 50, 200, 25);

        texto2 = new JLabel("Domicilio");
        caja2 = new JTextField();
        texto2.setBounds(50, 100, 200, 25);
        caja2.setBounds(150, 100, 200, 25);

        texto3 = new JLabel("Fecha de entrega");
        caja3 = new JTextField();
        texto3.setBounds(50, 150, 200, 25);
        caja3.setBounds(150, 150, 200, 25);

        boton = new JButton("Agregar pedido");
        boton.setBounds(50, 500, 200, 30);
        boton.addActionListener(this);

        this.add(texto1);
        this.add(texto2);
        this.add(texto3);
        this.add(caja1);
        this.add(caja2);
        this.add(caja3);
        this.add(boton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nom = caja1.getText();
        String dom = caja2.getText();
        String fech = caja3.getText();

        Object decora = JOptionPane.showInputDialog(null, "Seleccione su evento", "Decoracion",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Bautizo", "Cumpleaños", "boda"}, "Seleccione");

        Object relle = JOptionPane.showInputDialog(null, "Seleccione un Relleno", "Relleno",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Fresas", "Duraznos", "Manzana", "Tres leches"}, "Seleccione");

        Object peso = JOptionPane.showInputDialog(null, "Numero de personas", "Personas",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "25-5kg", "50-10Kg", "75-15kg", "100-20Kg", "150-30kg"}, "Seleccione");

        float precio = 0;
        if (peso.equals("25-5kg")) {
            precio = 5 * 120;
        } else if (peso.equals("50-10kg")) {
            precio = 10 * 120;
        } else if (peso.equals("75-15kg")) {
            precio = 15 * 120;
        } else if (peso.equals("150-30kg")) {
            precio = 30 * 120;
        }

        JOptionPane.showMessageDialog(this,
                "Confirmacion\n\n" +
                        "Nombre:" + nom + "\n" +
                        "Domicilio:" + dom + "\n" +
                        "Fecha de entrega:" + fech + "\n" +
                        "Decoracion: " + decora + "\n" +
                        "Relleno: " + relle + "\n" +
                        "Tamaño: " + peso + "\n" +
                        "Monto a pagar: $" + precio,
                "Pasteleria de pasteles",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Pastelpoo ventana = new Pastelpoo();
        ventana.setVisible(true);
    }
}



