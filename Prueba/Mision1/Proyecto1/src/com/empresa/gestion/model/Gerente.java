package com.empresa.gestion.model;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, int edad, double salario, String departamento){
        super(nombre, edad, salario);
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;

    }
    //♻️Polimorfismo (un método se puede comportar diferente depende la clase donde se encuentre)
    //Sobreescritura del método presentarse
    @Override
    public void presentarse(){
        System.out.println("Soy el gerente "+getNombre()+" estoy a cargo del departamento "+ departamento);
    }

    
}
