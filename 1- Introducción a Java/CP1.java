package cp1;
import java.util.Scanner;
public class CP1 {
    //Actividad 3
    public static void declararVariables() {
        System.out.println("Actividad 3");
        String texto = "Hola Mundo";
        int numero = 25;
        double decimal = 3.14;
        boolean bandera = true;
        System.out.println("String: " + texto);
        System.out.println("Int: " + numero);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + bandera);
    }
    //Actividad 4
    public static void pedirNombreEdad() {
        System.out.println("Actividad 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    //Actividad 5
    public static void operacionesConEnteros() {
        System.out.println("Actividad 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre 0");
        }
    }
    //Actividad 6
    public static void mostrarMensaje() {
        System.out.println("Actividad 6");
        System.out.println("Este es el mensaje solicitado en consola.");
    }
    //Actividad 8
    public static void conversiones() {
        System.out.println("Actividad 8");
        int a = 5;
        int b = 2;
        int divisionEntera = a / b;
        System.out.println("División entera: " + divisionEntera);
        double divisionReal = (double) a / b;
        System.out.println("División con decimales: " + divisionReal);
    }
    //Actividad 9
    public static void corregirCodigo() {
        System.out.println("Actividad 9");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine(); 
        System.out.println("Texto ingresado: " + texto);
    }
    //Actividad 10
    public static void pruebaDeEscritorio() {
        System.out.println("Actividad 10");
        int a, b, division;
        a = 5;        
        b = 2;        
        division = a / b; 
        System.out.println("Resultado de división: " + division); 
    }
    public static void main(String[] args) {
        declararVariables();
        pedirNombreEdad();
        operacionesConEnteros();
        mostrarMensaje();
        conversiones();
        corregirCodigo();
        pruebaDeEscritorio();
    }
}

