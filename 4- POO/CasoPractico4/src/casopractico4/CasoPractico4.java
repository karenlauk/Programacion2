package casopractico4;

public class CasoPractico4 {

    public static void main(String[] args) {
        // Crear empleados con distintos constructores
        Empleados emp1 = new Empleados(1, "Carlos López", "Gerente", 80000);
        Empleados emp2 = new Empleados("María Gómez", "Analista");
        Empleados emp3 = new Empleados("Pedro Ruiz", "Desarrollador");

        // Actualizar salarios
        emp2.actualizarSalario(10);  // aumento del 10%
        emp3.actualizarSalario(5000); // aumento fijo de 5000

        // Mostrar información de empleados
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " +
                           Empleados.mostrarTotalEmpleados());
    }
}

