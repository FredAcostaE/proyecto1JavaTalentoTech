package com.empresa.gestion.service;
import java.util.ArrayList;
import com.empresa.gestion.model.Libro;


public class LibroService {
    private ArrayList<Libro> libros =new ArrayList<>();

    public void agregarLibro(Libro libro){
        libros.add(libro); //Función add del tipo arraylist agrega un objeto
        System.out.println("Libro agregado correctamente");

    }

    public void listarLibro(){
        if(libros.isEmpty()){ //isEmpty Valida si la lista esta vacia
             System.out.println("No hay libros registrados");
             return;
        }
        for (Libro l: libros) {
            System.out.println(l.informacionLibro());            
        }
    }
    public void eliminarLibro(String isbn){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getIsbn().equals(isbn)){
                libros.remove(i);
                System.out.print("Libro eliminado correctamente");
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }
    public void buscarLibro(String valor){
        for(Libro l: libros){
            if(l.getIsbn().equalsIgnoreCase(valor)){ //EqualsIgnoreCase() no discrimina mayuscula de minusculas
                System.out.println(l.informacionLibro());
                return;
            }
            if(l.getTitulo().equalsIgnoreCase(valor)){
                System.out.println(l.informacionLibro());                
            }
            if(l.getAutor().equalsIgnoreCase(valor)){
                System.out.println(l.informacionLibro());                
            }
        }
        System.out.println("Libro no encontrado");
    }

}
