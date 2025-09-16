package casopráctico3;
public class CasoPráctico3 {
    public static void main(String[] args) {
        //1)
        System.out.println ("1)");
        Estudiantes e1 = new Estudiantes("Karen", "Lauk", "Programación II", 8);
        e1.mostrarInfo();
        e1.subirCalificacion(1);
        e1.mostrarInfo();
        e1.bajarCalificacion(2);
        e1.mostrarInfo();
        // 2)
        System.out.println ("2)");
        Mascotas m1 = new Mascotas("Doki", "Perro", 4);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
        // 3)
        System.out.println ("3)");
        claseLibro l1 = new claseLibro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        System.out.println(l1.getTitulo() + " - " + l1.getAutor());
        l1.setAnioPublicacion(-200);  // inválido
        l1.setAnioPublicacion(1985);  // válido
        System.out.println("Año: " + l1.getAnioPublicacion());
        // 4)
        System.out.println ("4)");
        granjaDigital g1 = new granjaDigital(1, 2);
        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();
        // 5)
        System.out.println ("5)");
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(10);
        nave.recargarCombustible(20);
        nave.mostrarEstado();
    }
}