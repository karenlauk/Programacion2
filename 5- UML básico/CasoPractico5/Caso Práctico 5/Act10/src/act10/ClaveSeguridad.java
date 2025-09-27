package act10;
import java.time.LocalDateTime;
public class ClaveSeguridad {
    private String codigo;
    private LocalDateTime ultimaModificacion;
    public ClaveSeguridad(String codigo, LocalDateTime ultimaModificacion){
        this.codigo = codigo; 
        this.ultimaModificacion = ultimaModificacion;
    }
    public String getCodigo(){ 
        return codigo; 
    }
    public LocalDateTime getUltimaModificacion(){ 
        return ultimaModificacion; 
    }
    @Override 
    public String toString(){ 
        return "Clave[" + codigo + ", " + ultimaModificacion + "]"; 
    }
}
