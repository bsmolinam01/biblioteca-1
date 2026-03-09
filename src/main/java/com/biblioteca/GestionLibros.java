package com.biblioteca;

import java.util.Arrays;

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
