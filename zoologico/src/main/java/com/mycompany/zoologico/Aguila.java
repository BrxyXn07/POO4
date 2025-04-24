
package com.mycompany.zoologico;

class Aguila extends Animales {

    public Aguila(String nombre, int edad) {
        super(nombre, edad, "Aguila");
    }
    
    @Override
    
    public void hacerSonido(){
        System.out.println(getNombre() + " ¡dice: CO CO CO !");
        
    }
    
    @Override
    
    public void realizarActividad(){
        System.out.println(getNombre() + " esta jugando con un raton ");
    }
}
