package act8;
import java.time.LocalDateTime;
public class Act8 {
    public static void main(String[] args) {
        Usuario uf = new Usuario ("Laura", "laura@mail.com");
        Documento doc = new Documento ("Contrato", "Contenido de contrato", "hash123", LocalDateTime.now(),uf);
        System.out.println(doc);
    }
    
}
