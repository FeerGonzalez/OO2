package eje2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.Test;

public class ReportTest {
	@Test
	public void archivoNoExistente() {
		Report reporte = new Report("Reporte del dia: " + LocalDate.now());

		String mensaje = "";

		try {
			reporte.export(null);
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "File es NULL; no puedo exportar...";

		assertEquals(mensajeEsperado, mensaje);
	}

	@Test
	public void archivoExistente() {
		NoSobrescribir reporte = new NoSobrescribir(new Report("Reporte del dia: " + LocalDate.now()));

		String mensaje = "";

		try {
			reporte.export(new File("Reporte"));
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "El archivo ya existe...";

		assertEquals(mensajeEsperado, mensaje);
	}

	@Test
	public void escribirReporte() {
		Sobrescribir reporte = new Sobrescribir(new Report("Reporte del dia: " + LocalDate.now()));

		String mensaje = "";

		try {
			reporte.export(new File("Reporte"));
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "Se registro el reporte...";

		assertEquals(mensajeEsperado, mensaje);
	}
}
