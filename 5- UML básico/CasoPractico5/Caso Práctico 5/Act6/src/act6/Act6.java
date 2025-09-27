package act6;
import java.time.LocalDate;
import java.time.LocalTime;
public class Act6 {
    public static void main(String[] args) {
        Cliente cr = new Cliente("Marta", "11-2345678");
        Mesa mesa = new Mesa(7, 4);
        Reserva reserva = new Reserva(LocalDate.now(), LocalTime.of(20, 30), cr, mesa);
        System.out.println(reserva);
    }
}
