package com.company;

import javax.swing.*;

public class MiVentana extends JFrame {

    public MiVentana() {
        setSize(500, 500);
        setTitle("Prueba tabla");
        setLocationRelativeTo(null);
        setComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setComponentes() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);


        JTable tabla = seleccionarTabla(2);
        panel.add(tabla);
//      SCROLL
        JScrollPane scrollPane = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(20, 20, 300, 200);
        panel.add(scrollPane);
    }

    public JTable seleccionarTabla(int index) {

        JTable tabla = new JTable();

        switch (index) {
            case 1: {
                tabla = new MiPrimeraTabla();
            }
            break;
            case 2: {
                tabla = new MiSegundaTabla();
            }
            break;
        }
        return tabla;
    }
}
