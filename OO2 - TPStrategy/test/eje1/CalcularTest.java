package eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import eje1.model.CarritoDeCompra;
import eje1.model.ColectivoSur;
import eje1.model.CorreoArgentino;
import eje1.model.Producto;

public class CalcularTest {
	@Test
	public void calcularMontoViajeColectivoSur() {
		CarritoDeCompra carrito = new CarritoDeCompra(
				new ColectivoSur(Map.of("Capital Federal", 1000.0, "Gran Buenos Aires", 1500.0)),
				List.of(new Producto("Computadora", 200, 1)));

		assertEquals(3200, carrito.calcularPrecioTotal("Capital Federal", "Viedma"));
	}

	@Test
	public void calcularViajeCorreo() {
		CarritoDeCompra carrito = new CarritoDeCompra(new CorreoArgentino(Map.of("Capital Federal", 500.0)),
				List.of(new Producto("Computadora", 200, 1)));

		assertEquals(700, carrito.calcularPrecioTotal("Viedma", "Capital Federal"));
	}
}
