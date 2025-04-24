
package com.mycompany.automoviles;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un camión de marca " + marca + " y modelo " + modelo + ".");
    }
}
