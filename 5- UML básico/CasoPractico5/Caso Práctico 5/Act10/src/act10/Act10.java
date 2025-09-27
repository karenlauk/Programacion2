package act10;
import java.time.LocalDateTime;
public class Act10 {
    public static void main(String[] args) {
        Titular tc = new Titular("Sofia", "45678901");
        CuentaBancaria cb = new CuentaBancaria("CBU-123", 5000.0, "clave-xyz", LocalDateTime.now(), tc);
        System.out.println(cb);
        System.out.println("Titular: " + tc);  
    }
}
