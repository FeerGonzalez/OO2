import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.Bebida;
import modelo.ComarcaPlus;
import modelo.Mastercard;
import modelo.Pedido;
import modelo.Plato;
import modelo.Tarjeta;
import modelo.Visa;

public class TarjetaTest {
	@Test
	public void calcularCostoTarjetaVisa() {
		try {
			Visa tarjetaVisa = new Visa("Mariano Flores", 0001);
			FakeRegistroDatos unObjeto = new FakeRegistroDatos();
			Pedido unPedido = new Pedido(unObjeto);
			
			unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
			unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
			
			unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
			unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
			
			int resultado = unPedido.calcularCostoPedido(tarjetaVisa);
			int resultadoEsperado = 1168;
		
			assertEquals(resultadoEsperado, resultado);
			assertEquals(LocalDate.now().toString() + " || " + resultado, unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaMastercard() {
		try {
			Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
			FakeRegistroDatos unObjeto = new FakeRegistroDatos();
			Pedido unPedido = new Pedido(unObjeto);
			
			unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
			unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
			
			unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
			unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
			
			int resultado = unPedido.calcularCostoPedido(tarjetaMastercard);
			int resultadoEsperado = 1155;
		
			assertEquals(resultadoEsperado, resultado);
			assertEquals(LocalDate.now().toString() + " || " + resultado, unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		try {
			ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
			FakeRegistroDatos unObjeto = new FakeRegistroDatos();
			Pedido unPedido = new Pedido(unObjeto);
			
			unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
			unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
			
			unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
			unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
			
			int resultado = unPedido.calcularCostoPedido(tarjetaComarca);
			int resultadoEsperado = 1151;
		
			assertEquals(resultadoEsperado, resultado);
			assertEquals(LocalDate.now().toString() + " || " + resultado, unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaViedma() {
		try {
			Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
			FakeRegistroDatos unObjeto = new FakeRegistroDatos();
			Pedido unPedido = new Pedido(unObjeto);
			
			unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
			unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
			
			unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
			unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
			
			int resultado = unPedido.calcularCostoPedido(tarjetaViedma);
			int resultadoEsperado = 1174;
			
			assertEquals(resultadoEsperado, resultado);
			assertEquals(LocalDate.now().toString() + " || " + resultado, unObjeto.devolverString());
		} catch (IOException e) {
			
		}
	}
}
