package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import javax.swing.JOptionPane;

public class InterfazGrafica {

    private GestorEntidades gestor = new GestorEntidades();

    public void iniciar() {
        String[] opciones = {"Agregar Guía Turístico", "Agregar Vehículo", "Mostrar todos", "Salir"};

        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "Selecciona una opción:",
                    "Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            if (opcion == 0) {
                String nombre = JOptionPane.showInputDialog("Nombre del guía:");
                String idioma = JOptionPane.showInputDialog("Idioma:");
                gestor.getEntidades().add(new GuiaTuristico(nombre, idioma));
                JOptionPane.showMessageDialog(null, "Guía agregado correctamente.");

            } else if (opcion == 1) {
                String tipo = JOptionPane.showInputDialog("Tipo de vehículo:");
                String patente = JOptionPane.showInputDialog("Patente:");
                gestor.getEntidades().add(new Vehiculo(tipo, patente));
                JOptionPane.showMessageDialog(null, "Vehículo agregado correctamente.");

            } else if (opcion == 2) {
                StringBuilder resumen = new StringBuilder();
                for (var r : gestor.getEntidades()) {
                    resumen.append(r.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, resumen.toString(), "Entidades registradas", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (opcion != 3 && opcion != -1);
    }
}