package act11;
public class Act11 {
    public static void main(String[] args) {
        Artista artista = new Artista("The Band", "Rock");
        Cancion can = new Cancion("Mi Cancion", artista);
        Reproducir rp = new Reproducir();
        rp.reproducir(can);
    }    
}
