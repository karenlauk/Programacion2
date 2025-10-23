package ejercicio3;
public class EmpleadoTemporal extends Empleado {
    private double horas;
    private double pagoPorHoras;
    public EmpleadoTemporal(String nombre, double horas, double pagoPorHoras){
        super(nombre);
        this.horas=horas;
        this.pagoPorHoras=pagoPorHoras;
    }
    @Override
    public double calcularSueldo(){
        return horas * pagoPorHoras;
    }
}