package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MiSegundaTabla extends JTable {

    public MiSegundaTabla() {
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
        String[] persona3 = {"P3", "E3", "N3"};
        String[] persona4 = {"P4", "E4", "N4"};

        modelo.addRow(persona3);
        modelo.addRow(persona4);
    }
}
