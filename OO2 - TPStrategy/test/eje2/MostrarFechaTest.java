package eje2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import eje2.modelo.FechaCorta;
import eje2.modelo.FechaLarga;
import eje2.modelo.Persona;

public class MostrarFechaTest {
	@Test
	public void mostrarFechaCorta() {
		Persona persona = new Persona(new FechaCorta(), "2023-03-04");

		assertEquals("04-03-2023", persona.devolverFechaNacimiento());
	}

	@Test
	public void mostrarFechaLarga() {
		Persona persona = new Persona(new FechaLarga(), "2023-03-04");

		assertEquals("4 de marzo de 2023", persona.devolverFechaNacimiento());
	}
}
