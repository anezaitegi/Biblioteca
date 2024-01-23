package Biblioteca.src;
/*
 Biblioteca: Guarda los libros en un array de la clase Libro.
 Como maximo tendrá 100 libros. 
*/

public class Biblioteca {
    private Libro[] libros;

    public Biblioteca() {
        libros = new Libro[100];
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(String titulo, String autor, String isbn, int numPaginas, String generoLiterario) {
        for (int i = 0; i < 100; i++) {
            if (libros[i] == null) {
                libros[i] = new Libro(titulo, autor, isbn, numPaginas, generoLiterario);
                return true;
            }
        }
        return false;
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        for (int i = 0; i < 100; i++) {
            if (libros[i] != null && libros[i].getIsbn().equalsIgnoreCase(isbn)) {
                libros[i] = null;
            }
        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            if (libros[i] != null) {
                libros[i].imprimir();
            }
        }
        System.out.println();

    }

    // Muestra los libros con el genero literario dado
    public void getPorGeneroLiterario(String generoLiterario) {
        System.out.println("Los libros de " + generoLiterario + " de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            if (libros[i] != null && libros[i].getGeneroLiterario().equalsIgnoreCase(generoLiterario)) {
                libros[i].imprimir();
            }
        }
        System.out.println();

    }

    // Nos devuelve un array con los libros de un autor
    public Libro[] librosDeAutor(String autor) {
        Libro[] librosAutor = new Libro[100];
        int contador = 0;
        for (int i = 0; i < 100; i++) {
            if (libros[i] != null && libros[i].getAutor().equalsIgnoreCase(autor)) {
                librosAutor[contador] = libros[i];
                contador++;
            }
        }
        return librosAutor;
    }

    // Nos imprime el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo = "";
        for (int i = 0; i < 100; i++) {
            if (libros[i] != null && libros[i].getNumPaginas() > max) {
                max = libros[i].getNumPaginas();
                titulo = libros[i].getTitulo();
            }
        }
        System.out.println("El libro mas largo es: " + titulo);
        System.out.println();
    }
}
