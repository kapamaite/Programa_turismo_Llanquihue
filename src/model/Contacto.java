package model;
/** Representa la creacion de una persona
 *
 */
public class Contacto {
    private String telefono;
    private String correo;

    public Contacto (String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo= correo;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
