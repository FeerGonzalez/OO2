import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.Concurso;
import modelo.Participante;

public class ConcursoTest {
	@Test
	public void inscribirseAConcurso() {
		Concurso concurso = new Concurso("Concurso de Inteligencia", "2023-03-08", "2023-03-13");
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
		Concurso consurso = new Concurso("Concurso de Inventos", "2023-03-05", "2023-03-10");
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com");
		
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, participante.inscribirseAConcurso(consurso));
	}
}
