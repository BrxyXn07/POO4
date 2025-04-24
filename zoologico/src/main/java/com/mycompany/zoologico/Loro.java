
package com.mycompany.zoologico;


class Loro extends Animales {

    public Loro(String nombre, int edad) {
        super(nombre, edad, "Loro");
    }
    
    @Override
    
    public void hacerSonido(){
        System.out.println(getNombre() + " !Dice: Hola humano");
    }
    
    @Override
    
    public void realizarActividad(){
        System.out.println(getNombre() + " esta volando alrededor ");
    
    
}
}