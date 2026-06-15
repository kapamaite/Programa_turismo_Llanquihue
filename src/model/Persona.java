package model;

public class Persona {

    private String rut;
    private String nombre;
    private Contacto contacto;

    public Persona(String rut, String nombre, Contacto contacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
