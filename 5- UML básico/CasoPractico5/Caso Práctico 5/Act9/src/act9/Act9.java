package act9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Act9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente ("Raúl", "OSDE");
        Profesional prof = new Profesional ("Dr. Gomez", "Cardiología");
        CitaMedica cita = new CitaMedica (LocalDate.of(2025,10,10), LocalTime.of(15,0), paciente, prof);
        System.out.println(cita);      
    }
    
}
