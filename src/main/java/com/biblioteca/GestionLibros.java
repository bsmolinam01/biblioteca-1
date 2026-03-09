/**
 * Representa la gestión de libros dentro de la biblioteca.
 * 
 * @author Brayan Stiven Molina Macias
 * @version 1.0
 */
package com.biblioteca;

import java.util.Arrays;
/**
 * La clase GestionLibros es responsable de gestionar los libros dentro de la biblioteca.
 * 
 * @author Brayan Stiven Molina Macias
 * @version 1.0
 */
public class GestionLibros {
    Libro[] libros;

    public GestionLibros(){
        libros = new Libro[0];
    }

    public void aniadirLibro(Libro libro){
        libros = Arrays.copyOf(libros, libros.length+1);
        libros[libros.length-1] = libro;
    }

    public Libro buscarLibro(String isbn){
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    public void mostrar(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
