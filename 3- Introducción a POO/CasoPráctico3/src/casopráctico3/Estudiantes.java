package casopráctico3;
//Actividad 1) Registro de Estudiantes
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiantes(String n, String a, String c, double nota){
        nombre = n;
        apellido = a;
        curso = c;
        calificacion = nota;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    public void subirCalificacion(double puntos){
        calificacion = calificacion + puntos;
    }
    public void bajarCalificacion(double puntos){
        calificacion = calificacion - puntos;
    }
}
