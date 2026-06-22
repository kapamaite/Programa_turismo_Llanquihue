package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService;
import util.Validador;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Carga de datos desde archivo
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("src/resources/tours.txt");

        // Validación de ejemplo
        Validador.validarRut("20998333-2");
        Validador.validarTexto("gastronomico", "tipo");
        Validador.validarPrecio(25000);

        // Crear servicio con la lista cargada
        TourService servicio = new TourService(tours);

        // 1. Mostrar todos los tours
        servicio.mostrarTodos();

        // 2. Buscar un tour por nombre
        System.out.println("\n=== Búsqueda por nombre ===");
        Tour encontrado = servicio.buscarPorNombre("Ruta del Queso");
        if (encontrado != null) {
            System.out.println("Tour encontrado: " + encontrado);
        } else {
            System.out.println("Tour no encontrado.");
        }

        // 3. Filtrar por tipo
        System.out.println("\n=== Tours de tipo gastronomico ===");
        ArrayList<Tour> gastro = servicio.filtrarPorTipo("gastronomico");
        for (Tour tour : gastro) {
            System.out.println(tour);
        }

        // 4. Filtrar por precio máximo
        System.out.println("\n=== Tours con precio máximo $20000 ===");
        ArrayList<Tour> economicos = servicio.filtrarPorPrecio(20000);
        for (Tour tour : economicos) {
            System.out.println(tour);
        }
    }
}