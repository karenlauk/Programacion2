package casopráctico3;
//Actividad 4) Gestión de gallinas en Granja Digital
public class granjaDigital {
    private int gallina;
    private int edad;
    private int huevosPuestos;
    public granjaDigital(int id, int ed) {
        gallina = id;
        edad = ed;
        huevosPuestos = 0;
    }
    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
    }
    public void envejecer() {
        edad = edad + 1;
    }
    public void mostrarEstado() {
        System.out.println("Gallina " + gallina + " | Edad: " + edad + " | Huevos: " + huevosPuestos);
    }
}
