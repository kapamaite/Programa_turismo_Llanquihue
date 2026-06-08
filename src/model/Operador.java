package model;

/** Representa un operador turistico asociado.
 *
 */
public class Operador extends Persona{
    private String empresa;
    public Operador (String rut,
                     String nombre,
                     Contacto contacto,
                     String empresa) {
        super(rut, nombre, contacto);
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }
}
