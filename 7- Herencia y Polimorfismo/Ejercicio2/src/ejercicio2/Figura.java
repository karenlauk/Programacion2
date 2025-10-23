package ejercicio2;
public abstract class Figura {
    protected String nombre;
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea(); // método abstracto
    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }
}