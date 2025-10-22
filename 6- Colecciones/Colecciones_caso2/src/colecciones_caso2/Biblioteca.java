package colecciones_caso2;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
     private String nombre;
    private List<Libro> libros;
// Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
// Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
// Listar libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
// Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }
// Eliminar libro
    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
// Cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }
// Filtrar por año
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del año " + anio);
        }
    }
// Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("Autores en la biblioteca:");
        for (Libro l : libros) {
            System.out.println("- " + l.getAutor().getNombre() + " (" + l.getAutor().getNacionalidad() + ")");
        }
    }
}
