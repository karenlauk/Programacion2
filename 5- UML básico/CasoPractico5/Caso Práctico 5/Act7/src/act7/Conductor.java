package act7;
public class Conductor {
     private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia){ 
        this.nombre = nombre; 
        this.licencia = licencia; 
    }
    public String getNombre(){ 
        return nombre; 
    }
    public String getLicencia(){ 
        return licencia; }
    public Vehiculo getVehiculo(){ 
        return vehiculo; 
    }

    public void setVehiculo(Vehiculo v){
        if (this.vehiculo == v) return;
        this.vehiculo = v;
        if (v != null && v.getConductor() != this) v.setConductor(this);
    }
    @Override 
    public String toString(){ 
        return "Conductor[" + nombre + ", lic:" + licencia + "]"; 
    }
}
