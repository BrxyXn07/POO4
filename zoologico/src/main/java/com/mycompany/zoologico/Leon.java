
package com.mycompany.zoologico;


class Leon extends Animales {

    public Leon(String nombre, int edad) {
        super(nombre, edad, "Leon");
    }
    
    @Override
    
    public void hacerSonido(){
        System.out.println(getNombre() + " ¡dice: grrr");
        
    } 
    
    @Override
    
    public void realizarActividad(){
        System.out.println(getNombre() + " esta corriendo por toda la selva ");
    }

}
