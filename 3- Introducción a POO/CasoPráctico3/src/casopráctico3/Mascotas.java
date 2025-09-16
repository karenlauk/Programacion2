package casopráctico3;
//Actividad 2)Registro de Mascotas
public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;

    public Mascotas(String n, String e, int ed) {
        nombre = n;
        especie = e;
        edad = ed;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }  
    public void cumplirAnios() {
        edad = edad + 1;
    }
}
