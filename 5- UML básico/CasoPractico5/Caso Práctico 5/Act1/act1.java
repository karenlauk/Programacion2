package casopractico5;
import java.time.LocalDate;
public class CasoPractico5 {
    public class Foto {
       private final String imagen;
       private final String formato;
       
       public Foto (String imagen, String formato){
           this.imagen = imagen;
           this.formato = formato;
       }
       public String getImagen(){
           return imagen;
       }
       public String getFormato(){
           return formato;
       }
        @Override 
        public String toString(){
           return "Foto [" + imagen + ", " + formato + "]";
        }
    }
    public class Titular{
        private final String nombre;
        private final String dni;
        private Pasaporte pasaporte; //asociación didireccional
        
        public Titular (String nombre, String dni){
            this.nombre = nombre; 
            this.dni = dni;
        }
        public String getNombre(){
            return nombre;
        }
        public String getDni(){
            return dni;
        }
        public Pasaporte getPasaporte(){
            return pasaporte;
        }
        public void setPasaporte (Pasaporte p){
            if (this.pasaporte == p) return;
            this.pasaporte = p;
            if (p != null && p.getTitular()!= this) {
                p.setTitular(this);
        }
    }
        @Override
        public String toString(){
           return "Titular[" + nombre + ", " + dni + "]";
        }
    
    public final class Pasaporte {
        private final String numero;
        private final LocalDate fechaEmision;
        private final Foto foto;
        private Titular titular;
        public Pasaporte(String numero, LocalDate fechaEmision, String imagenFoto, 
                String formatoFoto, Titular titular){
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto(imagenFoto, formatoFoto);
            setTitular(titular);
        }
        public String getNumero(){ return numero; }
        public LocalDate getFechaEmision(){ return fechaEmision; }
        public Foto getFoto(){ 
            return foto; 
        }
        public Titular getTitular(){ 
            return titular; 
        }
        public void setTitular(Titular t){
            if (this.titular == t) return;
            this.titular = t;
            if (t != null && t.getPasaporte() != this) t.setPasaporte(this);
        }
    @Override 
    public String toString(){
        return "Pasaporte[" + numero + ", " + fechaEmision + ", " + foto + ", titular=" + (titular!=null?titular.getNombre():"null") + "]";
    }
}


