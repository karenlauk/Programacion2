package colecciones_caso3;
import java.util.ArrayList;
import java.util.List;
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
// Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() +
                    " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("Error: profesor o curso no encontrado.");
        }
    }
    public void listarProfesores() {
        System.out.println("Profesores");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    public void listarCursos() {
        System.out.println("Cursos");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c);
            }
            cursos.remove(c);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
        // Dejar profesor = null en todos los cursos que dictaba
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor eliminado correctamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }
// Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("\nReporte: Cursos por Profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " → " + p.getCursos().size() + " cursos.");
        }
    }
}
