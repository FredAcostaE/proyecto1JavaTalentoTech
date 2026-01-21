package com.empresa.gestion.model;

public class Empleado extends Persona{
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        super(nombre, edad);
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;

    }
    //♻️Polimorfismo (un método se puede comportar diferente depende la clase donde se encuentre)
    //Sobreescritura del método presentarse
    @Override
    public void presentarse(){
        System.out.println("Soy el empleado "+getNombre()+" tengo un salario de "+ salario);
        //Otra forma
         //System.out.println("Soy el empleado "+super(nombre)+" tengo un salario de "+ salario);
    }
    
}
