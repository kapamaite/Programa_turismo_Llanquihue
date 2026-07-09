package model;

public class ColaboradorExterno implements Registrable {
    private String nombre;
    private String especialidad;

    public ColaboradorExterno(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador Externo: " + nombre + ", Especialidad: " + especialidad);
    }
}