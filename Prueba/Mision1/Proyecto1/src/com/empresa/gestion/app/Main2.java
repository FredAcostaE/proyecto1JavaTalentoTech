package com.empresa.gestion.app;
import com.empresa.gestion.service.EmpleadoService;
import java.util.Scanner;
import com.empresa.gestion.model.Empleado;
public class Main2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        EmpleadoService service = new EmpleadoService();
        int opcion;

        do { 
            System.out.println("\n==== MENÚ DE EMPLEADOS ====");//syout
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleado");
            System.out.println("3. Consultar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("o. Salir");
            System.out.println("Seleccione una opción");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Id: ");
                    int id = teclado.nextInt();

                    System.out.println("Nombre: ");
                    teclado.nextLine();//Limpia el bufer
                    String nombre = teclado.nextLine();
                    
                    System.out.println("Edad: ");
                    int edad= teclado.nextInt();

                    System.out.print("Activo: ");
                    boolean activo = teclado.nextBoolean();

                    System.out.println("Genero: ");
                    char genero = teclado.next().charAt(0);

                    System.out.println("Salario: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Horas trabajadas: ");
                    int horasTrabajadas = teclado.nextInt();

                    Empleado emp = new Empleado(id,nombre,edad,activo,genero,salario,horasTrabajadas);
                    service.agregarEmpleado(emp);
                    break;
                    case 2:
                        service.listarEmpleados();
                        break;
                        case 3:
                            System.out.println("Ingrese Id: ");
                            service.consultarEmpleado(teclado.nextInt());
                            break;
                            case 4:
                            System.out.println("Ingrese Id: ");
                            service.eliminarEmpleado(teclado.nextInt());
                            break;
                            case 0:
                                System.out.println("Saliendo del sistema...");
                                break;                   
                    default:
                        System.out.println("❎ opción no encontrada");
            } 
        } while (opcion != 0);
        teclado.close();
    }
}
