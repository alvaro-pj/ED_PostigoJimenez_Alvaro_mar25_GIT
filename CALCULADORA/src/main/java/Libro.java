/**
 * Clase que representa un libro
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Atributos de cada uno de los libros
     * @param titulo titulo del libro
     * @param autor autor que ha escrito el libro
     * @param anioPublicacion Año en el que se publico el libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo para obtener el autor del libro
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo para obtener el año de publicación del libro
     * @return el año de publicación
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
