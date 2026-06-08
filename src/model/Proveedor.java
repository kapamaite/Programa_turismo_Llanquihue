package model;

/** Representa un proveedor de servicios
 *
 */
public class Proveedor {
    private final String servicio;

    public Proveedor(String rut,
                     String nombre,
                     Contacto contacto,
                     String servicio) {
        super();
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }
}