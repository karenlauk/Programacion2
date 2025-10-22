package colecciones_caso3;
public class Colecciones_caso3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");
    // 1. Crear profesores
        Profesor p1 = new Profesor("P1", "Laura Gómez", "Matemática");
        Profesor p2 = new Profesor("P2", "Carlos Pérez", "Informática");
        Profesor p3 = new Profesor("P3", "María Torres", "Física");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
    // 2. Crear cursos
        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Física Mecánica");
        Curso c4 = new Curso("C4", "Bases de Datos");
        Curso c5 = new Curso("C5", "Cálculo Diferencial");
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
    // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C5", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C4", "P2");
        uni.asignarProfesorACurso("C3", "P3");
    // 4. Listar cursos y profesores
        System.out.println("\nLISTA DE CURSOS");
        uni.listarCursos();
        System.out.println("\nLISTA DE PROFESORES");
        uni.listarProfesores();
    // 5. Cambiar el profesor de un curso
        System.out.println("\nCAMBIAR PROFESOR DEL CURSO C1");
        uni.asignarProfesorACurso("C1", "P2");
    // 6. Remover un curso
        System.out.println("\nELIMINAR CURSO C5");
        uni.eliminarCurso("C5");
    // 7. Remover un profesor
        System.out.println("\nELIMINAR PROFESOR P3");
        uni.eliminarProfesor("P3");
    // 8. Mostrar reporte
        uni.reporteCursosPorProfesor();
    // 9. Confirmar cambios
        System.out.println("\nLISTA FINAL DE CURSOS");
        uni.listarCursos();
        System.out.println("\nLISTA FINAL DE PROFESORES");
        uni.listarProfesores();
    }
}
