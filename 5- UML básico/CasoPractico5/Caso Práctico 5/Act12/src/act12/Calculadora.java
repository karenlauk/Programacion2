package act12;
public class Calculadora {
    public void calcular(Impuesto impuesto){
            double impuestoAplicado = impuesto.getMonto() * 0.21;
            System.out.println("Calculando impuesto para " + (impuesto.getContribuyente()!=null?impuesto.getContribuyente().getNombre():"anonimo"));
            System.out.println("Monto: " + impuesto.getMonto() + ", impuesto (21%): " + impuestoAplicado);
        }
    }   
