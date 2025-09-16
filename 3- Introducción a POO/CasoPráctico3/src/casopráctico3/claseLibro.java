package casopráctico3;
//Actividad 3) Encapsulamiento con la Clase Libro
public class claseLibro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public claseLibro(String t, String a, int anio) {
        titulo = t;
        autor = a;
        anioPublicacion = anio;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anio) {
        if (anio > 0) {
            anioPublicacion = anio;
        } else {
            System.out.println("El año no es válido.");
        }
    }
}
