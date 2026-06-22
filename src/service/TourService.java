package service;

import model.Tour;
import java.util.ArrayList;

public class TourService {

    private ArrayList<Tour> tours;

    public TourService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    // Recorre y muestra todos los tours
    public void mostrarTodos() {
        System.out.println("=== Lista de Tours ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    // Busca un tour por nombre
    public Tour buscarPorNombre(String nombre) {
        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(nombre)) {
                return tour;
            }
        }
        return null;
    }

    // Filtra tours por tipo
    public ArrayList<Tour> filtrarPorTipo(String tipo) {
        ArrayList<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(tour);
            }
        }
        return resultado;
    }

    // Filtra tours por precio máximo
    public ArrayList<Tour> filtrarPorPrecio(double precioMaximo) {
        ArrayList<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getPrecio() <= precioMaximo) {
                resultado.add(tour);
            }
        }
        return resultado;
    }
}