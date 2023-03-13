package main;

import java.time.LocalDate;

import modelo.*;

public class Main {

	public static void main(String[] args) {
		Concurso unConcurso = new Concurso("Concurso de tiro al blanco", "2023-03-15", "2023-03-20"); //Todavia no esta en fecha de inscripcion
		Concurso concurso2 = new Concurso("Concurso de Belleza", LocalDate.now().toString(), LocalDate.now().plusDays(5).toString()); //Comienza la fecha de inscripcion
		Concurso consurso3 = new Concurso("Concurso de Inventos", "2023-03-05", "2023-03-10"); //Termino la fecha de inscripcion
		Concurso concurso4 = new Concurso("Concurso de Inteligencia", "2023-03-08", "2023-03-13"); //Puede inscribirse
		
		System.out.println("Fecha de apertura: " + unConcurso.getFechaAperturaInscripcion());
		System.out.println("Fecha de cierre: " + unConcurso.getFechaCierreInscripcion());
		
		Participante unParticipante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		unParticipante.inscribirseAConcurso(unConcurso);
		unParticipante.inscribirseAConcurso(concurso2);
		unParticipante.inscribirseAConcurso(consurso3);
		unParticipante.inscribirseAConcurso(concurso4);
		
		System.out.println(unParticipante.getPuntos());
	}

}
