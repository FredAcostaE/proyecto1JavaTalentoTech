package com.empresa.gestion.app;

import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.model.Gerente;
import com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1,"Juan",30,true,'M',5000.0,160);
        Gerente gerente1 = new Gerente(2,"Ana",40,true,'F',8000.0,160,300.0,"Ventas");
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nomina = new NominaService();
        double [] nominaTrimestre = {2000.0,1000.0,5000.0};


        System.out.println("=====EMPLEADO====="); 
        empleado1.mostrarInformacionBasica();
        System.out.println("Salario: "+empleado1.calcularSalarioMensual()); 
        System.out.println("¿Puede trabajar? R/ "+empleado1.puedeTrabajar());     
        System.out.println("Salario anual del empleado es = $"+nomina.calcularSalarioAnual(empleado1));
        System.out.println("Genero  "+empleado1.obtenerTipoEmpleado());
        System.out.println("El salario del empleado en este trimestre es: $"+nomina.calcularTotalNomina(nominaTrimestre));

        System.out.println("=====GERENTE====="); 
        gerente1.mostrarInformacionBasica();
        System.out.println("Salario: "+gerente1.calcularSalarioMensual()); 
        System.err.println("¿Puede trabajar? R/ "+gerente1.puedeTrabajar());
        System.out.println("Salario anual del gerente es = $"+nomina.calcularSalarioAnual(gerente1));
        System.out.println("Puede trabajar?" + gerente1.puedeTrabajar());
        System.out.println("Puede trabajar?" + gerente1.clasificarEmpleado());
        System.out.println("Genero "+gerente1.obtenerTipoEmpleado());
    }
    
}
