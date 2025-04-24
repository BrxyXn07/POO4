
package com.mycompany.zoologico;

import java.util.ArrayList;
import java.util.List;


class elZoologico {
    private List<Animales> animales;
    
    public elZoologico(){
        animales = new ArrayList<>();
    }
    
    public void agregarAnimal(Animales animal){
        animales.add(animal);
        System.out.println("Se ha agregado un " + animal.getEspecie());
    }
    
    public void mostrarSonidos(){
        for (Animales animal : animales){
            animal.hacerSonido();
        }       
    }
    
    public void realizarActividades(){
        for (Animales animal : animales){
            animal.realizarActividad();
        }
    }
    

    
}
