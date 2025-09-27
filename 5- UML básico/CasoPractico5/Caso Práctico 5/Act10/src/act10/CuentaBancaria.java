package act10;
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular; 

    public CuentaBancaria(String cbu, double saldo, String codigoClave, java.time.LocalDateTime ultimaModif, Titular titular){
        this.cbu = cbu; this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModif); 
        setTitular(titular);
    }
    public String getCbu(){ 
        return cbu; 
    }
    public double getSaldo(){ 
        return saldo; 
    }
    public ClaveSeguridad getClave(){ 
        return clave; 
    }
    public Titular getTitular(){ 
        return titular; 
    }
    public void setTitular(Titular t){
        if (this.titular == t) return;
        this.titular = t;
        if (t != null && t.getCuenta() != this) t.setCuenta(this);
    }
    @Override 
    public String toString(){ 
        return "Cuenta[" + cbu + ", saldo:" + saldo + ", clave=" + clave + "]"; 
    }
}