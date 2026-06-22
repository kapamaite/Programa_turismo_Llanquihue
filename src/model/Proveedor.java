package model;

/** Representa un proveedor de servicios
 *
 */
public class Proveedor extends Persona {
    private String servicio;

    public Proveedor(String rut,
                     String nombre,
                     Contacto contacto,
                     String servicio) {
        super(rut, nombre, contacto);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", servicio='" + servicio + '\'' +
                '}';
    }
}