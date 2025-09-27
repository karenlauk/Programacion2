package act8;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; 

    public Documento(String titulo, String contenido, String codigoHash, java.time.LocalDateTime fecha, Usuario usuario){
        this.titulo = titulo; 
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }
    public FirmaDigital getFirma(){ 
        return firma; 
    }
    @Override 
    public String toString(){ 
        return "Documento[" + titulo + ", firma=" + firma + "]"; 
    } 
}
