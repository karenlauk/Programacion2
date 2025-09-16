package casopractico4;

public class Empleados {
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    // Atributo estático (compartido por todos los objetos)
    private static int totalEmpleados = 0;
    // Constructor que recibe todos los atributos
    public Empleados(int id, String nombre, String puesto, double salario) {
        this.id = id; // uso de this
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // aumentar contador
    }
    // Constructor sobrecargado: solo recibe nombre y puesto
    public Empleados(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // asignación automática de id
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // salario por defecto
        totalEmpleados++;
    }
    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Getter y Setter de salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Método toString para mostrar la información
    @Override
    public String toString() {
        return "Empleado [ID = " + id + ", Nombre = " + nombre +
               ", Puesto = " + puesto + ", Salario = " + salario + "]";
    }
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

