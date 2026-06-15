package ui;

import model.Tour;
import data.GestorDatos;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("src/resources/tours.txt");

        // 1. Recorrido: mostrar todos los tours
        System.out.println("=== Lista de Tours ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        // 2. Filtrado: tours de tipo "gastronomico"
        ArrayList<Tour> filtrados = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTipo().equals("gastronomico")) {
                filtrados.add(tour);
            }
        }

        // 3. Imprimir resultados filtrados
        System.out.println("\n=== Tours de tipo gastronomico ===");
        for (Tour tour : filtrados) {
            System.out.println(tour);
        }
    }
}