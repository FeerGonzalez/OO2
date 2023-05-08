package eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmpleadoTest {
	@Test
	public void CalcularMontoEmpleados() {
		EmpleadoRegular empleadoRegular1 = new EmpleadoRegular(20);
		EmpleadoRegular empleadoRegular2 = new EmpleadoRegular(20);
		EmpleadoRegular empleadoRegular3 = new EmpleadoRegular(20);

		List<EmpleadoRegular> listaEmpleadoRegular = new ArrayList<>();
		listaEmpleadoRegular.add(empleadoRegular1);
		listaEmpleadoRegular.add(empleadoRegular2);
		listaEmpleadoRegular.add(empleadoRegular3);

		LiderProyecto liderProyecto1 = new LiderProyecto(50, listaEmpleadoRegular);
		List<LiderProyecto> listaLiderProyecto = new ArrayList<>();
		listaLiderProyecto.add(liderProyecto1);

		MandoMedio mandoMedio1 = new MandoMedio(100, listaLiderProyecto);
		List<MandoMedio> listaMandoMedio = new ArrayList<>();
		listaMandoMedio.add(mandoMedio1);

		Gerente gerente1 = new Gerente(150, listaMandoMedio);
		List<Gerente> listaGerente = new ArrayList<>();
		listaGerente.add(gerente1);

		Director director1 = new Director(200, listaGerente);

		double resultadoEsperado = 560;

		assertEquals(resultadoEsperado, director1.calcularMonto());

	}

	@Test
	public void calcularMontoMandoMedio() {
		EmpleadoRegular empleadoRegular1 = new EmpleadoRegular(20);
		EmpleadoRegular empleadoRegular2 = new EmpleadoRegular(20);
		EmpleadoRegular empleadoRegular3 = new EmpleadoRegular(20);

		List<EmpleadoRegular> listaEmpleadoRegular = new ArrayList<>();
		listaEmpleadoRegular.add(empleadoRegular1);
		listaEmpleadoRegular.add(empleadoRegular2);
		listaEmpleadoRegular.add(empleadoRegular3);

		LiderProyecto liderProyecto1 = new LiderProyecto(50, listaEmpleadoRegular);
		List<LiderProyecto> listaLiderProyecto = new ArrayList<>();
		listaLiderProyecto.add(liderProyecto1);

		MandoMedio mandoMedio1 = new MandoMedio(100, listaLiderProyecto);
		List<MandoMedio> listaMandoMedio = new ArrayList<>();
		listaMandoMedio.add(mandoMedio1);

		double resultadoEsperado = 210;

		assertEquals(resultadoEsperado, mandoMedio1.calcularMonto());
	}
}
