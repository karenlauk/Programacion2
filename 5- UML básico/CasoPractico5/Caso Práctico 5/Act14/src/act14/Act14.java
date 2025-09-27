package act14;
public class Act14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("VideoDemo", 10);
        EditorVideo editor = new EditorVideo();
        editor.exportar("mp4", proyecto);
    }
}
