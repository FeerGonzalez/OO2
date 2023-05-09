package eje3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SeguroTest {
	@Test
	public void calcularCostoPaquete() {
		Medico seguro1 = new Medico(150);
		Vida seguro2 = new Vida(100);
		Automovil seguro3 = new Automovil(120);
		Hogar seguro4 = new Hogar(180);

		Paquete paqueteSeguros = new Paquete();

		paqueteSeguros.agregarSeguro(seguro1);
		paqueteSeguros.agregarSeguro(seguro2);
		paqueteSeguros.agregarSeguro(seguro3);
		paqueteSeguros.agregarSeguro(seguro4);

		double resultadoEsperado = 440;

		assertEquals(resultadoEsperado, paqueteSeguros.calcularCosto());
	}

	@Test
	public void calcularCostoPaqueteAcumulado() {
		Medico seguro1 = new Medico(150);
		Vida seguro2 = new Vida(100);
		Automovil seguro3 = new Automovil(120);
		Hogar seguro4 = new Hogar(180);
		Medico seguro5 = new Medico(110);
		Vida seguro6 = new Vida(170);

		Paquete paquete1 = new Paquete();
		Paquete paquete2 = new Paquete();

		paquete1.agregarSeguro(seguro1);
		paquete1.agregarSeguro(seguro2);
		paquete1.agregarSeguro(seguro3);
		paquete1.agregarSeguro(seguro4);

		paquete2.agregarSeguro(seguro5);
		paquete2.agregarSeguro(seguro6);
		paquete2.agregarSeguro(paquete1);

		double resultadoEsperado = 612;

		assertEquals(resultadoEsperado, paquete2.calcularCosto());
	}
}
