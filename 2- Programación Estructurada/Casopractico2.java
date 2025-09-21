package casopractico2;
import java.util.Scanner;
public class Casopractico2 {
    static double descuentoEspecial = 0.10; // variable global para Ejercicio 11
    // 1. Verificación de Año Bisiesto
    public static void anioBisiesto() {
        System.out.println("Actividad 1:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }
    }
    // 2. Mayor de tres números
    public static void mayorDeTres() {
        System.out.println("Actividad 2:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tres números: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }
    // 3. Clasificación de Edad
    public static void clasificacionEdad() {
        System.out.println("Actividad 3:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
    // 4. Calculadora de Descuento según categoría
    public static void descuentoCategoria1() {
        System.out.println("Actividad 4, prueba 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la categoría (A/B/C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        double descuento = 0;
        if (categoria == 'A'){
            descuento = 0.1;
        } else if (categoria == 'B'){
            descuento = 0.15;
        } else if (categoria == 'C'){
            descuento = 0.2;
        } else {
            System.out.println("Categoria inválida.");
            return;
        }
        double finalPrecio = precio - (precio * descuento);
        System.out.print("Descuento aplicado: " + (descuento * 100) + " %");
        System.out.print("Precio final: " + finalPrecio);
    }
    public static void descuentoCategoria2() {
        System.out.println("Actividad 4, prueba 2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese categoría (A, B o C): ");
        String cat = sc.next().toUpperCase();
        double precio = 100; //Ejemplo
        double total = precio;
        switch (cat){
            case "A": total = precio * 0.9; break;
            case "B": total = precio * 0.8; break;
            case "C": total = precio * 0.7; break;
            default: System.out.println("Categoría inválida");
        }
        System.out.println("Precio final: " + total);
    }
    // 5. Suma de números pares (while)
    public static void sumaPares() {
        System.out.println("Actividad 5:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número límite: ");
        int limite = sc.nextInt();
        int suma = 0, i = 2;
        while (i <= limite) {
            suma += i;
            i += 2;
        }
        System.out.println("Suma de pares hasta " + limite + " = " + suma);
    }
    // 6. Contador de positivos, negativos y ceros (for)
    public static void contadorNumeros() {
        System.out.println("Actividad 6:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de números: ");
        int n = sc.nextInt();
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + ": ");
            int x = sc.nextInt();
            if (x > 0) positivos++;
            else if (x < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Ceros: " + ceros);
    }
    // 7. Validación de nota entre 0 y 10 (do-while)
    public static void validarNota() {
        System.out.println("Actividad 7:");
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);
    }
    // 8. Precio final con impuesto y descuento
    public static void precioFinal() {
        System.out.println("Actividad 8:");
        double precio = 200;
        double impuesto = precio * 0.21;
        double descuento = precio * 0.10;
        double total = precio + impuesto - descuento;
        System.out.println("Precio final: " + total);
    }
    // 9. Funciones para envío y total
    public static double costoEnvio(double compra) {
        System.out.println("Actividad 9:");
        return compra > 500 ? 0 : 50;
    }
    public static void totalCompra() {
        double compra = 400;
        double total = compra + costoEnvio(compra);
        System.out.println("Total de compra con envío: " + total);
    }
    // 10. Actualización de stock
    public static void actualizarStock() {
        System.out.println("Actividad 10:");
        int stock = 100;
        int vendidos = 30;
        int recibidos = 50;
        stock = stock - vendidos + recibidos;
        System.out.println("Stock actualizado: " + stock);
    }
    // 11. Descuento especial con variable global
    public static void descuentoEspecial() {
        System.out.println("Actividad 11:");
        double precio = 150;
        double total = precio * (1 - descuentoEspecial);
        System.out.println("Precio con descuento especial: " + total);
    }
    // 12. Modificación de array de precios
    public static void modificarArray() {
        System.out.println("Actividad 12:");
        double[] precios = {100, 200, 300, 400};
        for (int i = 0; i < precios.length; i++) {
            precios[i] *= 1.10; // aumentar 10%
        }
        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println(p);
        }
    }
    // 13. Impresión recursiva de array
    public static void imprimirRecursivo(double[] arr, int i) {
        System.out.println("Actividad 13:");
        if (i < arr.length) {
            System.out.println(arr[i]);
            imprimirRecursivo(arr, i+1);
        }
    }
    public static void main(String[] args) {
        // Llamadas de prueba
        anioBisiesto();
        mayorDeTres();
        clasificacionEdad();
        descuentoCategoria1();
        descuentoCategoria2();
        sumaPares();
        contadorNumeros();
        validarNota();
        precioFinal();
        totalCompra();
        actualizarStock();
        descuentoEspecial();
        modificarArray();

        double[] arr = {10, 20, 30};
        System.out.println("Array antes:");
        imprimirRecursivo(arr, 0);
        arr[1] = 50;
        System.out.println("Array después:");
        imprimirRecursivo(arr, 0);
    }
}