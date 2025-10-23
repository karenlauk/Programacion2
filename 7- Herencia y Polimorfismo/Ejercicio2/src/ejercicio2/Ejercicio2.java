package ejercicio2;
public class Ejercicio2 {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("Círculo 1", 3.0),
            new Rectangulo("Rectángulo 1", 4.0, 2.5)
        };
        for (Figura f : figuras) {
            f.mostrarNombre();
            System.out.println("Área: " + f.calcularArea());
            System.out.println();
        }
    }
}
