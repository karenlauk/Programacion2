package act8;
import java.time.LocalDateTime;
public class FirmaDigital {
    private String codigoHash;
    private LocalDateTime fecha;
    private Usuario usuario; 

    public FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario){
        this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario;
    }
    public String getCodigoHash(){ 
        return codigoHash; 
    }
    public LocalDateTime getFecha(){ 
        return fecha; 
    }
    public Usuario getUsuario(){ 
        return usuario; 
    }
    @Override 
    public String toString(){ 
        return "Firma[" + codigoHash + ", " + fecha + ", usuario=" + (usuario!=null?usuario.getNombre():"null") + "]"; 
    }
}
