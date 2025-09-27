package act4;
import java.time.LocalDate;
public class TarjetaDeCredito {
   private String numero;
   private LocalDate fechaVencimiento;
   private Cliente cliente; 
   private Banco banco;     

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco, Cliente cliente){
        this.numero = numero; 
        this.fechaVencimiento = fechaVencimiento; 
        this.banco = banco;
        setCliente(cliente);
    }
    public String getNumero(){ 
        return numero; 
    }
    public Banco getBanco(){ 
        return banco; 
    }
    public Cliente getCliente(){ 
        return cliente; 
    }    
    public void setCliente(Cliente c){
        if (this.cliente == c) return;
        this.cliente = c;
        if (c != null && c.getTarjeta() != this) c.setTarjeta(this);
    }
    @Override 
    public String toString(){ 
        return "Tarjeta[" + numero + ", venc:" + fechaVencimiento + ", banco=" + banco + "]"; 
    } 
}
