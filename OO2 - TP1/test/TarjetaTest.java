import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

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
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		
		unPedido.setGuardarInfo(unObjeto);
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1168;
		
		try {
			assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaVisa));
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaMastercard() {
		Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
		
		Pedido unPedido = new Pedido();
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		
		unPedido.setGuardarInfo(unObjeto);
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1155;
		
		try {
			assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaMastercard));
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
		
		Pedido unPedido = new Pedido();
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		
		unPedido.setGuardarInfo(unObjeto);
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1151;
		
		try {
			assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaComarca));
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void calcularCostoTarjetaViedma() {
		Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
		
		Pedido unPedido = new Pedido();
		FakeRegistroDatos unObjeto = new FakeRegistroDatos();
		
		unPedido.setGuardarInfo(unObjeto);
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		int resultadoEsperado = 1174;
		
		try {
			assertEquals(resultadoEsperado, unPedido.calcularCostoPedido(tarjetaViedma));
		} catch (IOException e) {
			
		}
	}
}
