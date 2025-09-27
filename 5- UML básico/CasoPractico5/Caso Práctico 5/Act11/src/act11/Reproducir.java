package act11;
public class Reproducir {
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + (cancion.getArtista()!=null?cancion.getArtista().getNombre():"Desconocido"));
    }
}
