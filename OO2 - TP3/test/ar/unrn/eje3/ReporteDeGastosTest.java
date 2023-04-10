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
		
		String resultadoEsperado = "Gasto de la comida \t" + 5650 + "\n" + "Gasto total \t" + 8150;
		String cadena = reporte1.imprimir();
		
		assertEquals(resultadoEsperado, cadena);
	}
}
