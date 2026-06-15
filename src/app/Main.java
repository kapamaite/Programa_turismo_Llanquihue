package app;

import model.*;
public class Main {

    public static void main(String[] args){
        Contacto contactoCliente=
                new Contacto("000888333",
                        "micorreo@gmail.com");
       Direccion direccion=
               new Direccion(
                       "Los Naranjos",
                       122,
                       "Llanquihue",
                       "Puerto Varas",
                       "Los Lagos");

        Cliente cliente = new Cliente(
                "20998333-2",
                "Lady Stardust",
                contactoCliente,
                direccion,
                "VIP");
        System.out.println("Cliente;");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getRut());
        System.out.println(cliente.getTipoCliente());
        System.out.println(cliente.getContacto().getCorreo());
    }
}
