package test;
import modelo.Paciente;
import modelo.Medico;


public class TestConsultorio {
	
	static Paciente paciente1 = new Paciente("José","Pérez", 1.72f, 80);
	static Paciente paciente2 = new Paciente("Jorge", "Fernandéz", 1.75f, 70);
	static Medico medico1 = new Medico("Daniel", "López", "Pedíatra");
	 
	
    public static void main(String[] args) {
   
    		 
    		 System.out.println("Visita 1:");
    		 System.out.println("Médico: " + medico1.getNombre() + " " + medico1.getApellido());
    		 System.out.println("Paciente " + paciente1.NombreCompleto() + "IMC: " + medico1.calcularIMC(paciente1));
    		 System.out.println("Paciente " + paciente2.NombreCompleto() + "IMC: " + medico1.calcularIMC(paciente2));
    }
}

