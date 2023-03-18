package main;

import modelo.Bebida;
import modelo.ComarcaPlus;
import modelo.Mastercard;
import modelo.Pedido;
import modelo.Plato;
import modelo.Tarjeta;
import modelo.Visa;

public class Main2 {

	public static void main(String[] args) {
		
		Pedido unPedido = new Pedido();
		
		Visa tarjetaVisa = new Visa("Mariano Flores", 0001);
		Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
		ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
		Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
		
		unPedido.agregarBebidaAlPedido(new Bebida("Agua", 80));
		unPedido.agregarBebidaAlPedido(new Bebida("Coca Cola", 120));
		
		unPedido.agregarPlatoAlPedido(new Plato("Milanesa con papas fritas", 560));
		unPedido.agregarPlatoAlPedido(new Plato("Pizza", 380));
		
		System.out.println(unPedido.calcularCostoPedido(tarjetaVisa));
		System.out.println(unPedido.calcularCostoPedido(tarjetaMastercard));
		System.out.println(unPedido.calcularCostoPedido(tarjetaComarca));
		System.out.println(unPedido.calcularCostoPedido(tarjetaViedma));
	}

}
