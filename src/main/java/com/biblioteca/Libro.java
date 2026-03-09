package com.biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;

    public Libro(){
    }

    // Añadir documentación e incluir @throws
    public Libro(String isbn, String titulo, String autor, String editorial, String genero){
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("El titulo está vacio");
        }
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    //Añadir deprecated y documentación
    public String consultarTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }

        if(object instanceof Libro libro){
            if(libro.isbn == isbn){
                return true;
            }
        }
        return false;

    }

    // Añadir documentación @see a GestionLibros
   @Override
    public String toString(){
        return "Libro{isnb:" + isbn + "\n" + "titulo:" + titulo + "\n" + "autor" + autor + "}";
    }

    
    
}
