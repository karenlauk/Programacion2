package act13;
public class Act13 {
    public static void main(String[] args) {
        Usuario usuarioQR = new Usuario("Luis", "luis@mail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("valor-123", usuarioQR);
    }
}
