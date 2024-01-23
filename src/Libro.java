package Biblioteca.src;

public class Libro {
    // Atributos de la clase libro 
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private String generoLiterario;

    // Constructor con todos los atributos
    public Libro(String titulo, String autor, String isbn, int numPaginas, String generoLiterario) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.generoLiterario = generoLiterario;
    }

    // Getters de todos los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    // Metodo para imprimir la información de un libro
    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de paginas: " + numPaginas);
        System.out.println("Genero literario: " + generoLiterario);
        System.out.println(" ");
    }

}
