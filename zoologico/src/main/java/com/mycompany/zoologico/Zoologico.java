
package com.mycompany.zoologico;


class Zoologico {
    public static void main(String[] args) {
        elZoologico zoologico = new elZoologico();

        Animales miAguila = new Aguila("Rex", 5);
        Animales miLeon = new Leon("Alex", 3);
        Animales miLoro = new Loro("Polly", 2);

        zoologico.agregarAnimal(miAguila);
        zoologico.agregarAnimal(miLeon);
        zoologico.agregarAnimal(miLoro);
        
        System.out.println("\nSonidos de los animales:");
        zoologico.mostrarSonidos();

        System.out.println("\nActividades de los animales:");
        zoologico.realizarActividades();
        
    }
}

