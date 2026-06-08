
package model;
public class Persona {

    private String rut;
    private String nombre;
    private Persona contacto;

    public Persona(String rut, String nombre, Contacto contacto) {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        String rut1 = this.rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }
}
