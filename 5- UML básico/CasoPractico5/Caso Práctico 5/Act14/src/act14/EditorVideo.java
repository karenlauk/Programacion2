package act14;
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto){
        System.out.println("Exportando proyecto " + proyecto.getNombre() + " a formato " + formato);
        Render r = new Render(formato);
        System.out.println("Export terminado: " + r);
        return r;
    }
}
