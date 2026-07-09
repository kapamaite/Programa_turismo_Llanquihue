package model;

public class Vehiculo implements Registrable {
    private String tipo;
    private String patente;

    public Vehiculo(String tipo, String patente) {
        this.tipo = tipo;
        this.patente = patente;
    }

    public String getTipo() { return tipo; }
    public String getPatente() { return patente; }

    @Override
    public void mostrarResumen() {
        System.out.println("Vehículo: " + tipo + ", Patente: " + patente);
    }
}