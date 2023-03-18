import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.Concurso;
import modelo.Participante;

public class ConcursoTest {
	@Test
	public void inscribirseAConcurso() {
		Concurso concurso = new Concurso("Concurso de Inteligencia", LocalDate.now().minusDays(3).toString(), LocalDate.now().plusDays(3).toString());
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
		
	}
	
	@Test
	public void inscribirseAConcursoPrimerDia() {
		Concurso concurso = new Concurso("Concurso de Belleza", LocalDate.now().toString(), LocalDate.now().plusDays(5).toString());
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
	}
	
	@Test
	public void inscribirseAConcursoFueraDeFecha() {
		Concurso consurso = new Concurso("Concurso de Inventos", LocalDate.now().minusDays(8).toString(), LocalDate.now().minusDays(1).toString());
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, participante.inscribirseAConcurso(consurso));
	}
}
