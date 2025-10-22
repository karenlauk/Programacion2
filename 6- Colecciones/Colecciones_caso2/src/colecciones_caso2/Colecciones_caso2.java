package colecciones_caso2;
public class Colecciones_caso2 {
    public static void main(String[] args) {
// 1. Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
// 2. Crear autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A2", "Jane Austen", "Reino Unido");
        Autor a3 = new Autor("A3", "J.K. Rowling", "Reino Unido");
// 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Orgullo y prejuicio", 1813, a2);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la piedra filosofal", 1997, a3);
        biblioteca.agregarLibro("ISBN004", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y el prisionero de Azkaban", 1999, a3);
// 4. Listar libros
        System.out.println("LISTA DE LIBROS");
        biblioteca.listarLibros();
// 5. Buscar por ISBN
        System.out.println("\nBUSCAR LIBRO POR ISBN (ISBN003)");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();
// 6. Filtrar por año
        System.out.println("\nLIBROS PUBLICADOS EN 1997");
        biblioteca.filtrarLibrosPorAnio(1997);
// 7. Eliminar libro
        System.out.println("\nELIMINAR LIBRO (ISBN002)");
        biblioteca.eliminarLibro("ISBN002");
// 8. Mostrar lista actualizada
        System.out.println("\nLISTA ACTUALIZADA DE LIBROS");
        biblioteca.listarLibros();
// 9. Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());
// 10. Mostrar autores disponibles
        System.out.println("\nAUTORES DISPONIBLES");
        biblioteca.mostrarAutoresDisponibles();
    } 
}