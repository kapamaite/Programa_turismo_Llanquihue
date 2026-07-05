package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios = new ArrayList<>();

    public GestorServicios() {
        servicios.add(new RutaGastronomica("Ruta del Queso", 4, 5));
        servicios.add(new RutaGastronomica("Sabores del Sur", 3, 3));
        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 2, "Lancha"));
        servicios.add(new PaseoLacustre("Tour Lago Todos los Santos", 3, "Catamarán"));
        servicios.add(new ExcursionCultural("Visita Puerto Montt", 5, "Casa del Arte"));
        servicios.add(new ExcursionCultural("Historia de Llanquihue", 4, "Museo Regional"));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    public void mostrarTodos() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}