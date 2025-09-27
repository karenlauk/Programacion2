package act4;
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni){ 
        this.nombre = nombre; 
        this.dni = dni; 
    }
    public String getNombre(){ 
        return nombre; 
    }
    public String getDni(){ 
        return dni; 
    }
    public TarjetaDeCredito getTarjeta(){ 
        return tarjeta; 
    }

    public void setTarjeta(TarjetaDeCredito t){
        if (this.tarjeta == t) return;
        this.tarjeta = t;
        if (t != null && t.getCliente() != this) t.setCliente(this);
    }
    @Override 
    public String toString(){ 
        return "Cliente[" + nombre + ", " + dni + "]"; 
    }
    
}   

