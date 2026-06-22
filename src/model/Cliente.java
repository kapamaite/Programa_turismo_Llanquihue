package model;

public class Cliente extends Persona {
    private Direccion direccion;
    private String tipoCliente;

    public Cliente(String rut,
                   String nombre,
                   Contacto contacto,
                   Direccion direccion,
                   String tipoCliente) {
        super(rut, nombre, contacto);
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}