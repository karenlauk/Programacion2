package ejercicio3;
import java.util.ArrayList;
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("María", 150000));
        empleados.add(new EmpleadoTemporal("Juan", 80, 1500));
        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra: " + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> Es empleado de planta.");
            } else {
                System.out.println(" ->  Es empleado temporal.");
            }
        }
    } 
}

