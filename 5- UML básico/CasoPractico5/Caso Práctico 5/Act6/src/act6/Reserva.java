package act6;
import java.time.LocalDate;
import java.time.LocalTime;
public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; 
    private Mesa mesa;             
    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa){
        this.fecha = fecha; 
        this.hora = hora; 
        this.cliente = cliente; 
        this.mesa = mesa;
    }
    @Override public String toString(){ 
        return "Reserva[" + fecha + " " + hora + ", " + cliente + ", " + mesa + "]"; }
    }

