package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MiPrimeraTabla extends JTable {

    public MiPrimeraTabla() {
        DefaultTableModel modelo = getMiModeloDeTabla();
        setModel(modelo);
        setBounds(20, 20, 300, 200);
    }

    private DefaultTableModel getMiModeloDeTabla() {
        DefaultTableModel modelo = new DefaultTableModel();

        setColumnas(modelo);
        setFilas(modelo);

        return modelo;
    }

    private void setColumnas(DefaultTableModel modelo) {
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
    }

    private void setFilas(DefaultTableModel modelo) {
        String[] persona1 = {"P1", "E1", "N1"};
        String[] persona2 = {"P2", "E2", "N2"};

        modelo.addRow(persona1);
        modelo.addRow(persona2);
    }
}
