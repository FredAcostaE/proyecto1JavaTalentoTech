package com.empresa.gestion.app;

import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.model.Gerente;
import com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",30,5000.0);
        Gerente gerente1 = new Gerente("Ana",40,8000.0,"Ventas");
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nomina = new NominaService();
                
        System.out.println("Salario anual del empleado es = $"+nomina.calcularSalarioAnual(empleado1));
        System.out.println("Salario anual del gerente es = $"+nomina.calcularSalarioAnual(gerente1));
    }
    
}
