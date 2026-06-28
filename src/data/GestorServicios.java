package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica("Ruta del Queso", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Sabores del Sur", 3, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Paseo Lago Llanquihue", 2, "Lancha");
        PaseoLacustre paseo2 = new PaseoLacustre("Tour Lago Todos los Santos", 3, "Catamarán");

        ExcursionCultural excursion1 = new ExcursionCultural("Visita Puerto Montt", 5, "Casa del Arte");
        ExcursionCultural excursion2 = new ExcursionCultural("Historia de Llanquihue", 4, "Museo Regional");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}