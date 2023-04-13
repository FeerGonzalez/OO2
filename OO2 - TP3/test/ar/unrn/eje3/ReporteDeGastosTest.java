package ar.unrn.eje3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastosTest {
	@Test
	public void generarReporte() {
		Desayuno desayuno1 = new Desayuno("Cafe con tostados", 800);
		Desayuno desayuno2 = new Desayuno("Cafe con leche con medialunas", 600);
		Desayuno desayuno3 = new Desayuno("Cafe negro con donas", 750);
		
		Cena cena1 = new Cena("Pizza Muzzarella", 1800);
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
		
		String resultadoEsperado = "Cafe con tostados	800	 \r\n"
				+ "Cafe con leche con medialunas	600	 \r\n"
				+ "Cafe negro con donas	750	 \r\n"
				+ "Pizza Muzzarella	1800	 \r\n"
				+ "Hamburguesa completa	1700	 \r\n"
				+ "Peugeot 207	2500	 \r\n"
				+ "Gasto de la comida 	5650\r\n"
				+ "Gasto total 	8150\r\n"
				+ "";
		String cadena = reporte1.imprimir();
//		System.out.println(cadena);
		assertEquals(resultadoEsperado, cadena);
	}
}
