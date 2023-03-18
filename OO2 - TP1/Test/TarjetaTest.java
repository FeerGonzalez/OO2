import static org.junit.jupiter.api.Assertions.assertEquals;

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
		Visa tarjetaVisa = new Visa("Mariano Flores", 0001);
		
		Pedido unPedido = new Pedido();
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1168;
		
		assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaVisa));
	}
	
	@Test
	public void calcularCostoTarjetaMastercard() {
		Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
		
		Pedido unPedido = new Pedido();
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1155;
		
		assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaMastercard));
	}
	
	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
		
		Pedido unPedido = new Pedido();
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1151;
		
		assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaComarca));
	}
	
	@Test
	public void calcularCostoTarjetaViedma() {
		Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
		
		Pedido unPedido = new Pedido();
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1174;
		
		assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaViedma));
	}
}
