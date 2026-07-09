package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;
import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades = new ArrayList<>();

    public GestorEntidades() {
        entidades.add(new GuiaTuristico("Carlos Pérez", "Español"));
        entidades.add(new GuiaTuristico("John Smith", "Inglés"));
        entidades.add(new Vehiculo("Bus", "LLQH-21"));
        entidades.add(new Vehiculo("Van", "TOUR-45"));
        entidades.add(new ColaboradorExterno("Ana Rojas", "Fotografía"));
        entidades.add(new ColaboradorExterno("Luis Vera", "Cocina"));
    }

    public void mostrarEntidades() {
        for (Registrable r : entidades) {
            r.mostrarResumen();
            if (r instanceof GuiaTuristico) {
                System.out.println("  -> Tipo: Guía Turístico");
            } else if (r instanceof Vehiculo) {
                System.out.println("  -> Tipo: Vehículo");
            } else if (r instanceof ColaboradorExterno) {
                System.out.println("  -> Tipo: Colaborador Externo");
            }
        }
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}