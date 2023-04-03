import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.Concurso;
import modelo.Participante;

public class ConcursoTest {
	@Test
	public void inscribirseAConcurso() {
		Concurso concurso = new Concurso("Concurso de Inteligencia", LocalDate.now().minusDays(3).toString(), LocalDate.now().plusDays(3).toString());
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = true;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
			assertEquals(LocalDate.now().toString() + "," + participante.getId() + "," + concurso.getId(), unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void inscribirseAConcursoPrimerDia() {
		Concurso concurso = new Concurso("Concurso de Belleza", LocalDate.now().toString(), LocalDate.now().plusDays(5).toString());
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = true;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
			assertEquals(LocalDate.now().toString() + "," + participante.getId() + "," + concurso.getId(), unObjeto.devolverString());
		} catch (IOException e) {
		
		}
	}
	
	@Test
	public void inscribirseAConcursoFueraDeFecha() {
		Concurso concurso = new Concurso("Concurso de Inventos", LocalDate.now().minusDays(8).toString(), LocalDate.now().minusDays(1).toString());
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		Participante participante = new Participante("Maximiliano Flores", "max_flores@gmail.com", unObjeto);
		
		boolean resultadoEsperado = false;
		
		try {
			assertEquals(resultadoEsperado, participante.inscribirseAConcurso(concurso));
			assertEquals(null, unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
}
