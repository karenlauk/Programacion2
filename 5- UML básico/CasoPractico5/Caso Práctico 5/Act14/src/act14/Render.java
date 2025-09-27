package act14;
public class Render {
    private String formato;
    public Render(String formato){ 
        this.formato = formato; 
    }
    public String getFormato(){
        return formato; 
    }
    @Override public String toString(){ return "Render[" + formato + "]";
    }
}
