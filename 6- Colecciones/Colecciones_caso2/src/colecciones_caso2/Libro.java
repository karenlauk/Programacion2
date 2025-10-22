package colecciones_caso2;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
// Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
// Mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo +
                " | ISBN: " + isbn +
                " | Año: " + anioPublicacion +
                " | Autor: " + autor.getNombre() +
                " (" + autor.getNacionalidad() + ")");
    }
// Getters
    public String getIsbn() {
        return isbn;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public Autor getAutor() {
        return autor;
    }
}
