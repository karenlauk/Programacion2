package act12;
public class Act12 {
    public static void main(String[] args) {
        Contribuyente contrib = new Contribuyente("Diego", "20-12345678-9");
        Impuesto imp = new Impuesto(1000.0, contrib);
        Calculadora calc = new Calculadora();
        calc.calcular(imp);
    }
}
