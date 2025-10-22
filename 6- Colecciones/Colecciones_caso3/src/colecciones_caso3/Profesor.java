package colecciones_caso3;
import java.util.ArrayList;
import java.util.List;
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
// Agregar curso (sin duplicar y sincronizando)
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza el otro lado
            }
        }
    }
// Eliminar curso (y romper la relación del otro lado)
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }
// Listar cursos del profesor
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no tiene cursos asignados.");
        } else {
            System.out.println("Cursos dictados por " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
            }
        }
    }
// Mostrar info del profesor
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }
// Getters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
}
