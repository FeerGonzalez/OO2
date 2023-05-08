package eje5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RemeraTest {
	@Test
	public void calcularPrecioImportada() {

		Remera remera = new Importada(175, 3, 5, 25);

		double resultadoEsperado = 232.75;

		assertEquals(resultadoEsperado, remera.calcularPrecio());
	}

	@Test
	public void calcularPrecioNacional() {
		Remera remera = new Nacional(120, 1.5, 20, 15);

		double resultadoEsperado = 115.8;

		assertEquals(resultadoEsperado, remera.calcularPrecio());
	}
}
