package caso7;
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo +
                           ", Puertas: " + cantidadPuertas);
    }
}