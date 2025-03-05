import java.util.ArrayList;
import java.util.List;

/**
 *La clase Biblioteca proporciona metodos para simular el funcionamiento de una biblioteca
 *
 * @author Alvaro Postigo Jimenez
 * @version 5.3.2025
 * @see Libro
 *
 */

public class Biblioteca {

    // TODO: Documentar estos atributos x
    /**
     * Lista de libros disponibles en la biblioteca
     */
    private final List<Libro> libros;

    // TODO: Documentar este método x
    /**
     * Constructor vacio de la biblioteca
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método x
    //  Test: NO HAY QUE TESTEAR ESTE METODO x
    /**
     * Constructor con parametros
     * @param libros
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo x
    //  Test: Comprobar si se ha agregado x
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo x
    //  Test: comprobar si se ha eliminado x
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método x
    /**
     * Metodo para recoger todos los libros de la biblioteca
     * @return libros en la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Metodo para buscar los libros por el titulo
     * @param titulo
     * @return el libro que coincide con el String dado
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**
     * @deprecated El metodo esta en desuso.
     * Si se quiere buscar por autor usar {@link #encuentraLibrosPorAutor(String)}
     * Encuentra libros por el autor dado
     * @param autor
     * @return los libros escritos por el autor
     *
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Busca los libros que coincidan con el autor dado
     * @since V2.0
     * Metodo mas eficiente que {@link #encuentaLibroPorAutor(String)}
     * @param autor
     * @return una lista con todos los libros que estan escritos por el mismo autor
     */

    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
