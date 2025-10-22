package colecciones_caso3;
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
// Asignar profesor sincronizando ambos lados
    public void setProfesor(Profesor p) {
        // Si ya tenía profesor anterior, eliminarse de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
    // Si hay nuevo profesor, agregar este curso a su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Profesor: " + nombreProfesor);
    }
// Getters
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
}
