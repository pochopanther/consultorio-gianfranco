package test;


class TestConsultorio2 {
    public static void main(String[] args) {
   		 
    		 TestConsultorio.paciente1.setPeso(90f);
    		 TestConsultorio.paciente2.setPeso(100f);
    		 
    		 System.out.println("Visita 2:");
    		 System.out.println("Médico: " + TestConsultorio.medico1.getNombre() + " " + TestConsultorio.medico1.getApellido());
    		 System.out.println("Paciente " + TestConsultorio.paciente1.NombreCompleto() + "IMC: " + TestConsultorio.medico1.calcularIMC(TestConsultorio.paciente1));
    		 System.out.println("Paciente " + TestConsultorio.paciente2.NombreCompleto() + "IMC: " + TestConsultorio.medico1.calcularIMC(TestConsultorio.paciente2));
    }

 
}
