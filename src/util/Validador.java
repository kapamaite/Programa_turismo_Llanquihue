package util;

public class Validador {

    public static boolean validarRut(String rut) {
        try {
            if (rut == null || rut.isEmpty()) {
                throw new IllegalArgumentException("El rut no puede estar vacío");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
            return false;
        }
    }

    public static boolean validarTexto(String texto, String campo) {
        try {
            if (texto == null || texto.isEmpty()) {
                throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
            return false;
        }
    }

    public static boolean validarPrecio(double precio) {
        try {
            if (precio <= 0) {
                throw new IllegalArgumentException("El precio debe ser mayor a 0");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
            return false;
        }
    }
}