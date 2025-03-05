import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro1;
    Libro libro2;
    Libro libro3;
    Biblioteca biblioteca;
    @BeforeEach
    void setUp() {
        libro1 = new Libro("Rebelión en la Granja", "George Orwell", 1984);
        libro2 = new Libro("Clean Code", "Robert C. Martin", 2008);
        libro3 = new Libro("El camino a Wigan Pier", "George Orwell", 1937);
        biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
    }


    @Test
    void agregarLibro() {
        boolean resultado = biblioteca.agregarLibro(libro1);
        assertTrue(resultado, "Libro no agregado");
    }

    @Test
    void eliminarLibro() {
        boolean resultado = biblioteca.eliminarLibro(libro1);
        assertTrue(resultado, "Libro no eliminado");
    }

    @Test
    void encuentraLibrosPorAutor() {
        List<Libro> resultado = biblioteca.encuentraLibrosPorAutor("George Orwell");
        assertTrue(resultado.size() > 0, "No se encuentra el libro");
    }
}