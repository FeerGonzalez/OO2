package eje2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ScrumTest {
	@Test
	public void calcularTiempoEstimadoProyecto() {
		Tarea tarea1 = new Tarea(10);
		Tarea tarea2 = new Tarea(15);
		Tarea tarea3 = new Tarea(20);

		HistoriaUsuario item1 = new HistoriaUsuario();
		item1.agregarTarea(tarea1);
		item1.agregarTarea(tarea2);

		Spike item2 = new Spike();

		item2.agregarTarea(tarea3);

		Scrum proyecto = new Scrum();
		proyecto.agregarItem(item1);
		proyecto.agregarItem(item2);

		int resultadoEsperado = 45;

		assertEquals(resultadoEsperado, proyecto.calcularTiempo());
	}

	@Test
	public void calcularTiempoEstimadoHistoriaUsuario() {
		Tarea tarea1 = new Tarea(10);
		Tarea tarea2 = new Tarea(15);
		Tarea tarea3 = new Tarea(5);

		HistoriaUsuario item1 = new HistoriaUsuario();
		item1.agregarTarea(tarea1);
		item1.agregarTarea(tarea2);
		item1.agregarTarea(tarea3);

		int resultadoEsperado = 30;

		assertEquals(resultadoEsperado, item1.calcularTiempo());
	}
}
