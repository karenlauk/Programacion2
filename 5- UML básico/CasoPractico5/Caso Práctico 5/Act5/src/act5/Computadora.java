
package act5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa; 
    private Propietario propietario; 

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario){
        this.marca = marca; 
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modeloPlaca, chipset);
        setPropietario(propietario);
    }
    public PlacaMadre getPlacaMadre(){ 
        return placa; 
    }
    public Propietario getPropietario(){ 
        return propietario; 
    }
    public void setPropietario(Propietario p){
        if (this.propietario == p) return;
        this.propietario = p;
        if (p != null && p.getComputadora() != this) p.setComputadora(this);
    }
    @Override 
    public String toString(){ 
        return "Computadora[" + marca + ", SN:" + numeroSerie + ", " + placa + "]"; }
}
