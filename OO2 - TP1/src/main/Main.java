package main;

import java.io.IOException;
import java.time.LocalDate;

import modelo.Concurso;
import modelo.InformacionEnArchivo;
import modelo.Participante;

public class Main {

	public static void main(String[] args) {
		
//		Concurso unConcurso = new Concurso("Concurso de tiro al blanco", LocalDate.now().plusDays(1).toString(), LocalDate.now().plusDays(6).toString()); //Todavia no esta en fecha de inscripcion
		Concurso concurso2 = new Concurso("Concurso de Belleza", LocalDate.now().toString(), LocalDate.now().plusDays(5).toString()); //Comienza la fecha de inscripcion
//		Concurso consurso3 = new Concurso("Concurso de Inventos", "2023-03-05", "2023-03-10"); //Termino la fecha de inscripcion
		Concurso concurso4 = new Concurso("Concurso de Inteligencia", LocalDate.now().minusDays(2).toString(), LocalDate.now().plusDays(3).toString()); //Puede inscribirse
			
		Participante unParticipante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		;
			
//		unParticipante.inscribirseAConcurso(unConcurso);
		try {
			unParticipante.setGuardarInfo(new InformacionEnArchivo("Inscripturas"));
			unParticipante.inscribirseAConcurso(concurso2);
			unParticipante.inscribirseAConcurso(concurso4);
		} catch (IOException e) {
		}
//		unParticipante.inscribirseAConcurso(consurso3);
//		unParticipante.inscribirseAConcurso(concurso4);
	}

}
