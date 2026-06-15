package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int duracionHoras;
    private double precio;

    public Tour(String nombre, String tipo, int duracionHoras, double precio){
        this.nombre=nombre;
        this.tipo=tipo;
        this.duracionHoras= duracionHoras;
        this.precio=precio;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo){
    this.tipo=tipo;
}
public int getDuracionHoras(){
    return duracionHoras;
}
public void setDuracionHoras(int duracionHoras){
    this.duracionHoras= duracionHoras;
}
public double getPrecio(){
    return precio;
}
public void setPrecio(double precio){
    this.precio=precio;
}
@Override
public String toString() {
    return "Tour{" +
            "nombre=" + nombre + '\'' +
            ",tipo' " + tipo + '\'' +
            "duracionHoras=" + duracionHoras +
            ",precio=" + precio +
            '}';
    }
}