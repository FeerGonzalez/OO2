import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.BebidaRecord;
import modelo.ComarcaPlus;
import modelo.Mastercard;
import modelo.PlatoRecord;
import modelo.Tarjeta;
import modelo.Visa;

public class TarjetaTest {
	@Test
	public void calcularCostoTarjetaVisa() {
		Visa tarjetaVisa = new Visa("Mariano Flores", 0001);
		
		BebidaRecord bebida1 = new BebidaRecord("Agua", 80);
		BebidaRecord bebida2 = new BebidaRecord("Sprite", 100);
		
		PlatoRecord plato = new PlatoRecord("Milanesa con papas fritas", 560);
		
		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);
		
		listaPlatos.add(plato);
		listaPlatos.add(plato);
		
		int resultadoEsperado = 1333;
		
		assertEquals(resultadoEsperado, tarjetaVisa.calcularCosto(listaBebidas, listaPlatos));
	}
	
	@Test
	public void calcularCostoTarjetaMastercard() {
		Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
		
		BebidaRecord bebida1 = new BebidaRecord("Coca Cola", 120);
		BebidaRecord bebida2 = new BebidaRecord("Sprite", 100);
		
		PlatoRecord plato = new PlatoRecord("Hamburguesa con papas fritas", 520);
		
		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);
		
		listaPlatos.add(plato);
		
		int resultadoEsperado = 766;
		
		assertEquals(resultadoEsperado, tarjetaMastercard.calcularCosto(listaBebidas, listaPlatos));
	}
	
	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
		
		BebidaRecord bebida = new BebidaRecord("Fanta", 110);
		
		PlatoRecord plato = new PlatoRecord("Pizza", 380);
		
		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		
		listaBebidas.add(bebida);
		
		listaPlatos.add(plato);
		listaPlatos.add(plato);
		
		int resultadoEsperado = 895;
		
		assertEquals(resultadoEsperado, tarjetaComarca.calcularCosto(listaBebidas, listaPlatos));
	}
	
	@Test
	public void calcularCostoTarjetaViedma() {
		Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
		
		BebidaRecord bebida = new BebidaRecord("Coca Cola", 120);
		
		PlatoRecord plato = new PlatoRecord("Fideos con tuco", 320);
		
		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		
		listaBebidas.add(bebida);
		
		listaPlatos.add(plato);
		
		int resultadoEsperado = 462;
		
		assertEquals(resultadoEsperado, tarjetaViedma.calcularCosto(listaBebidas, listaPlatos));
	}
}
