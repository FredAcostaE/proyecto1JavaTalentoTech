package com.empresa.gestion.model;

//Clase abstracta
public class Persona {

    //🔒🔒Encapsulación
    protected String nombre;
    protected int edad;
    protected boolean activo; // True or false
    protected char genero;//'M' o 'F'
    protected int id;

    //🧱 Constructor
    public Persona (int id,String nombre, int edad, boolean activo, char genero){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.genero = genero;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
   
    public char getGenero(){
        return genero;
    }
     public void setGenero(char genero){
       this.genero = genero;
    }
     public int getId(){
            return id;
    }

    //Método
    public void presentarse(){
        System.out.println("Hola soy "+nombre+" Tengo "+edad+" años.");
    }   
    public void mostrarInformacionBasica(){

        System.out.println("ID: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Activo: "+ activo);
        System.out.println("Genero: "+ genero);
    }   
    
}
