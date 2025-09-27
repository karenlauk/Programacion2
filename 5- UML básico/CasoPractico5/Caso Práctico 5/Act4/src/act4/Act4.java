package act4;
import java.time.LocalDate;
public class Act4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Lucia", "23456789");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1111-2222-3333-4444", LocalDate.of(2026, 5, 1), banco, cliente);
        System.out.println(tarjeta);
        System.out.println("Cliente: " + cliente);
    }   
}
