package com.biblioteca;

import java.util.Scanner;

public class Biblioteca {
    GestionLibros gesLibro;
    Scanner sc = new Scanner(System.in);

    public Biblioteca(){
        gesLibro = new GestionLibros();
    }

    public void agregarLibrosNuevos(){
        System.out.println("Introduzca el isbn");
        String isbn = sc.next();
        System.out.println("Introduzca el titulo");
        String titulo = sc.next();
        System.out.println("Introduzca el autor");
        String autor = sc.next();
        System.out.println("Introduzca el editorial");
        String editorial = sc.next();
        System.out.println("Introduzca el genero");
        String genero = sc.next();

        Libro libro = new Libro(isbn, titulo, autor, editorial, genero);

        gesLibro.aniadirLibro(libro);
    }

    public void mostrarLibro(){
        gesLibro.mostrar();
    }

    public void menu(){
        boolean salir = false;
        do{
            System.err.println("*************************************");
            System.out.println("**        MENU PRINCIPAL.         **");
            System.out.println("*************************************");
            System.out.println("GESTIÓN DE LIBRO");
            System.out.println("-------------------------");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Mostra todos los libros");

            System.out.println("10. Salir");
            
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarLibrosNuevos();
                    break;
                case 4:
                    mostrarLibro();
                    break;
                case 10:
                    System.out.println("HASTA LUEGO!!!");
                    salir = true;
                    break;
            
                default:
                    break;
            }

        }while(!salir);
    }
}
