package com.empresa.gestion.service;
import com.empresa.gestion.model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    // Método agregar
    public void agregarEmpleado(Empleado emp){
        empleados.add(emp);
        System.out.println("✅ Empleado agregado con exito");
    }
    public void listarEmpleados(){
        if (empleados.isEmpty()) {   //isEmpty valida si el array empleados esta vacio
            System.out.println("⚠️ No hay empleados registrados");
            return;            
        }
        //Se crea un loop para recorrer el array
        for (Empleado e: empleados) {
            System.out.println(e.resumenEmpleado());
            
        }

    }
    // Eliminar empleado
    public void eliminarEmpleado(int id){

        for(int i=0; i<empleados.size();i++){
            if(empleados.get(i).getId()==id){ //get(i) es el indice para buscar el id en la lista
                empleados.remove(i);
                System.out.println("🗑️ Se elimino el empleado con id: "+id);
                return;               
            }
        }
        System.out.println("❎ Empleado no encontrado");
    } 
    //Consultar empleado
    public void consultarEmpleado(int id){
        for(Empleado e : empleados){
            if(e.getId()==id){
                System.out.println(e.resumenEmpleado());
                return;
            }
        }
        System.out.println("❎ Empleado no encontrado");

    }   
}
