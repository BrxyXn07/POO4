
package com.mycompany.automoviles;


public class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto de marca " + marca + " y modelo " + modelo + ".");
    }
}

