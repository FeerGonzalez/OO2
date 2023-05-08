package eje4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class CalculadorTest {
	@Test
	public void calcularJubiladosConPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue(), new DefaultLogTransaction());

		double resultado = calculador.calcularPrecio(100);
		double resultadoEsperado = 100;

		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void calcularJubiladosSinPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue() - 1,
				new DefaultLogTransaction());

		double resultado = calculador.calcularPrecio(100);
		double resultadoEsperado = 110;

		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void calcularNoJubiladosConPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue(), new DefaultLogTransaction());

		double resultado = calculador.calcularPrecio(100);
		double resultadoEsperado = 115;

		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void calcularNoJubiladosSinPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue() - 1,
				new DefaultLogTransaction());

		double resultado = calculador.calcularPrecio(100);
		double resultadoEsperado = 121;

		assertEquals(resultadoEsperado, resultado);
	}
}
