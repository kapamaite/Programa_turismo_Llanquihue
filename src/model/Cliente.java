package model;

public class Cliente {
    private String nombre;
    private Contacto contacto;
    private Direccion direccion;
    private String tipoCliente;

    public Cliente(String rut,
                   String nombre,
                   Contacto contacto,
                   Direccion direccion,
                   String tipoCliente) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }
    public String getRut(){
        return nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }

    public Contacto getContacto() {
        return contacto;
    }
}