package ar.unrn.eje3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastosTest {
	@Test
	public void generarReporte() {
		Desayuno desayuno1 = new Desayuno("Cafe con tostados", 1200);
		Desayuno desayuno2 = new Desayuno("Cafe con leche con medialunas", 600);
		Desayuno desayuno3 = new Desayuno("Cafe negro con donas", 750);
		
		Cena cena1 = new Cena("Pizza Muzzarella", 6000);
		Cena cena2 = new Cena("Hamburguesa completa", 1700);
		
		AlquilerAuto alquiler1 = new AlquilerAuto("Peugeot 207", 2500);
		
		List<Gasto> listaGastos = new ArrayList<>();
		
		listaGastos.add(desayuno1);
		listaGastos.add(desayuno2);
		listaGastos.add(desayuno3);
		
		listaGastos.add(cena1);
		listaGastos.add(cena2);
		
		listaGastos.add(alquiler1);
		
		ReporteDeGastos reporte1 = new ReporteDeGastos(LocalDate.now(), listaGastos);
		
		String resultadoEsperado = "Expenses " + LocalDate.now() + "\r\n"
				+ "Cafe con tostados	1200	X\r\n"
				+ "Cafe con leche con medialunas	600	 \r\n"
				+ "Cafe negro con donas	750	 \r\n"
				+ "Pizza Muzzarella	6000	X\r\n"
				+ "Hamburguesa completa	1700	 \r\n"
				+ "Peugeot 207	2500	 \r\n"
				+ "Gasto de la comida 	10250\r\n"
				+ "Gasto total 	12750";
//		System.out.println(cadena);
		assertEquals(resultadoEsperado, reporte1.imprimir());
	}
}
