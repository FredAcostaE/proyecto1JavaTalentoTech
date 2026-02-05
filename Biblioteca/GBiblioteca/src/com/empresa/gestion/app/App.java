package com.empresa.gestion.app;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.empresa.gestion.model.Libro;
import com.empresa.gestion.service.LibroService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        LibroService service = new LibroService();
        int opcion=-1;
        System.out.println(" ==== SISTEMA DE GESTIÓN DE LIBROS ==== ");

        do{
            try{
                mostrarMenu();
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        agregarLibro(teclado,service);
                        break;
                    case 2:
                        service.listarLibro();
                        break;
                    case 3:
                        System.out.println("Ingrese titulo, autor o ISBN");
                        teclado.nextLine();
                         service.buscarLibro(teclado.nextLine());
                         break;
                     case 4:
                        System.out.println("Ingrese ISBN a eliminar");
                        teclado.nextLine();
                        service.eliminarLibro(teclado.nextLine());
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema");
                        break;
                        default:
                            System.out.println("Opción invalida");
                }

            }catch(InputMismatchException e){ // InputMismatchException captura errores cuando el valor no es numerico
                System.out.println("Error debe ingresar un número");
                teclado.nextLine();
             }catch(Exception e){  //Exception captura cualquier otro tipo de error que no capture InputMismatchException
                System.out.println("Error inesperado: "+e.getMessage());
                teclado.nextLine();
             }
        }while(opcion !=0);
        teclado.close();
        System.out.println(" ==== PROGRAMA FINALIZADO ==== ");
    }
    private static void mostrarMenu(){
        System.out.println(" \n==== MENÚ DE LIBROS ==== ");
        System.out.println(" 1. Agrgar libro");
        System.out.println(" 2, Listar libros ");
        System.out.println(" 3. Buscar libro ");
        System.out.println(" 4. Eliminar libro");
        System.out.println(" Seleccione una opción");
    }
    private static void agregarLibro(Scanner teclado, LibroService service){
        try{
            teclado.nextLine();
            System.out.println("ISBN");
            String isbn = teclado.nextLine();
            System.out.println("Titulo");
            String titulo = teclado.nextLine();
            System.out.println("Autor");
            String autor = teclado.nextLine();
            service.agregarLibro(libro);
            System.out.println("Libro agregado correctamente");

        }catch(InputMismatchException e){
            System.out.println("Datos invalidos");
            teclado.nextLine();
        }
    }
}
