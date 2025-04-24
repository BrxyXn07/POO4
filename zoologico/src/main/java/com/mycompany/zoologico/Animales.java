
package com.mycompany.zoologico;


abstract class Animales {
    
    private String nombre;
    private int edad;
    private String especie;

    public Animales(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getEspecie(){
        return especie;
        
    }
    
    public abstract void hacerSonido();
    public abstract void realizarActividad();

}