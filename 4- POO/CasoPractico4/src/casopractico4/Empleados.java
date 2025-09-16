package casopractico4;

public class Empleados {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleados(int id, String nombre, String puesto, double salario) {
        this.id = id; 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; 
    }
    public Empleados(String nombre, String puesto) {
        this.id = totalEmpleados + 1; 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; 
        totalEmpleados++;
    }
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    } 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    } 
    @Override
    public String toString() {
        return "Empleado [ID = " + id + ", Nombre = " + nombre +
               ", Puesto = " + puesto + ", Salario = " + salario + "]";
    }
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

