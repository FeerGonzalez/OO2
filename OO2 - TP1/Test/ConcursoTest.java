import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.Concurso;
import modelo.ObjetoDeMentira;
import modelo.Participante;

public class ConcursoTest {
	@Test
	public void inscribirseAConcurso() {
		Concurso concurso = new Concurso("Concurso de Inteligencia", LocalDate.now().minusDays(3).toString(), LocalDate.now().plusDays(3).toString());
		ObjetoDeMentira unObjeto = new ObjetoDeMentira();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = true;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
		} catch (IOException e) {
			
		}
		
	}
	
	@Test
	public void inscribirseAConcursoPrimerDia() {
		Concurso concurso = new Concurso("Concurso de Belleza", LocalDate.now().toString(), LocalDate.now().plusDays(5).toString());
		ObjetoDeMentira unObjeto = new ObjetoDeMentira();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = true;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
		} catch (IOException e) {
		
		}
	}
	
	@Test
	public void inscribirseAConcursoFueraDeFecha() {
		Concurso consurso = new Concurso("Concurso de Inventos", LocalDate.now().minusDays(8).toString(), LocalDate.now().minusDays(1).toString());
		ObjetoDeMentira unObjeto = new ObjetoDeMentira();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = false;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(consurso));
		} catch (IOException e) {
			
		}
	}
}
