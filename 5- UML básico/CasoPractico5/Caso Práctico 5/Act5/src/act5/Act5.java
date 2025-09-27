package act5;
public class Act5 {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Juan", "34567890");
        Computadora compu = new Computadora("HP", "SN-9876", "ASUS123", "Intel-Z", propietario);
        System.out.println(compu);
        System.out.println("Propietario: " + propietario); 
    }
}
