package act7;
public class Act7 {
    public static void main(String[] args) {
        Motor motor = new Motor ("Nafta", "SN.MOTOR-123");
        Vehiculo v = new Vehiculo ("ABC123", "Fiat Uno", motor);
        Conductor cond = new Conductor ("Pedro", "Lic-4567");
        v.setConductor(cond);
        System.out.println(v);
        System.out.println("Conductor: " + cond);
    }   
}
