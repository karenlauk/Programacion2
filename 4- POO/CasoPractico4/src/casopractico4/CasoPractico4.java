package casopractico4;

public class CasoPractico4 {

    public static void main(String[] args) {
        Empleados emp1 = new Empleados(1, "Carlos Lopez", "Gerente", 80000);
        Empleados emp2 = new Empleados("Karen Lauk", "Analista");
        Empleados emp3 = new Empleados("Pedro Ruiz", "Desarrollador");

        emp2.actualizarSalario(10);  
        emp3.actualizarSalario(5000); 

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("Total de empleados creados: " +
                           Empleados.mostrarTotalEmpleados());
    }
    
}

