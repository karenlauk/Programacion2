package casopráctico3;
//Actividad 5) Simulación de Nave Espacial
public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public NaveEspacial(String n, int c) {
        nombre = n;
        combustible = c;
    }
    public void despegar() {
        if (combustible >= 10) {
            combustible = combustible - 10;
            System.out.println(nombre + " despegó. Combustible: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible.");
        }
    }
    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible = combustible - consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }
    public void recargarCombustible(int cantidad) {
        combustible = combustible + cantidad;
        System.out.println("Se recargaron " + cantidad + ". Combustible: " + combustible);
    }
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}