package com.empresa.gestion.model;

public class Empleado extends Persona{
    private double salario;
    private int horasTrabajadas;
    

    
    public Empleado(int id,String nombre, int edad, boolean activo, char genero,double salario, int horasTrabajadas){
        super(id,nombre,edad,activo,genero);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //♻️Polimorfismo (un método se puede comportar diferente depende la clase donde se encuentre)
    //Sobreescritura del método presentarse
    @Override
    public void presentarse(){
        System.out.println("Soy el empleado "+getNombre()+" tengo un salario de "+ salario);
    }

    public double calcularSalarioMensual(){
        double valorHora = salario/160; //Suponiendo que las horas trabajadas al mes son 160.
        double salarioFinal = valorHora * horasTrabajadas;
        return salarioFinal;
    }

    //Agragamos reglas del negocio
    public boolean esMayorDeEdad(){
        return edad >= 18;//Esta linea compara y devuelve true o false

    }
    public boolean puedeTrabajar(){
        return edad>=18 && activo==true;
    }
    public String clasificarEmpleado(){
        if(edad < 18 ){
           return "Menor de edad (no puede trabajar)"; //Condición simple
        }
        else if (edad<=60){
            return "Empleado activo"; //Condición anidada
        }
        else {
            return "Empleado en edad de retiro"; //Condición compuesta
        }
    }

        //(edad >= 18) ? ("OK") : ("NG"); //Operador tenario

        public String obtenerTipoEmpleado(){
            //Switch se usa cuando hay opciones definidas
            switch (genero) {
                case 'M':
                    return "Masculino";
                case 'F':
                    return "Femenino" ;                              
                default:
                    return "No especificado";
            }        
        }
        public String resumenEmpleado(){
            return "ID: "+id+
                   "| Nombre: "+nombre +
                   "| Edad: "+ edad +
                   "| Activo: "+activo +
                   "| Genero: "+ genero +
                   "| Salario: "+salario +
                   "| Horas trabajadas: "+ horasTrabajadas;
                   
        }        
}
