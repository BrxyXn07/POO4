

package com.mycompany.automoviles;


public class Automoviles {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[8];

        vehiculos[0] = new Auto("Toyota", "Corolla");
        vehiculos[1] = new Moto("Yamaha", "R15");
        vehiculos[2] = new Camion("Volvo", "FH16");
        vehiculos[3] = new Auto("Honda", "Civic");
        vehiculos[4] = new Moto("Kawasaki", "Ninja");
        vehiculos[5] = new Camion("Scania", "R500");
        vehiculos[6] = new Auto("Ford", "Mustang");
        vehiculos[7] = new Moto("Suzuki", "GSX-R750");

        int i = 0;
        while (i < vehiculos.length) {
            vehiculos[i].conducir(); // POLIMORFISMO
            i++;
        }
    }
}


