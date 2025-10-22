package colecciones_caso2;
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
// Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
// Mostrar información
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " | ID: " + id + " | Nacionalidad: " + nacionalidad);
    }
// Getters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
