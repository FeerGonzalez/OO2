package eje2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.eje2.domain.model.DefaultSaludarEmpleado;
import ar.unrn.tp4.eje2.domain.portsout.EmpleadoRecord;

public class SaludarEmpleadoTest {
	@Test
	public void enviarSaludoAEmpleados() {
		List<EmpleadoRecord> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new EmpleadoRecord("Young", "Angus", "1982-10-08", "angus@acdc.com"));
		listaEmpleados.add(new EmpleadoRecord("Johnson", "Brian", "1975-09-11", "brian@acdc.com"));
		listaEmpleados.add(new EmpleadoRecord("Gonzalez", "Fernando", LocalDate.now().toString(), "fernando.g.gonzalez@hotmail.com"));
		
		FakeNotificar notificarFake = new FakeNotificar();
		FakeLectura lecturaFake = new FakeLectura(listaEmpleados);
		
		DefaultSaludarEmpleado saludarEmpleadoDefault = new DefaultSaludarEmpleado(lecturaFake, notificarFake);
		
		String resultadoEsperado = "fernando.g.gonzalez@hotmail.com" + "Feliz Cumple Años" + "Se te desea un feliz cumple años";
		
		saludarEmpleadoDefault.enviarSaludo();
		
		assertEquals(resultadoEsperado, notificarFake.getMensaje());
	}
	
}
