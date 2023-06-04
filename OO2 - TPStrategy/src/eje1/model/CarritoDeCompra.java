package eje1.model;

import java.util.List;

public class CarritoDeCompra {
	private Calcular calculo;
	private List<Producto> listaProductos;

	public CarritoDeCompra(Calcular opcionDeCompra, List<Producto> lista) {
		this.calculo = opcionDeCompra;
		this.listaProductos = lista;
	}

	public double calcularPrecioTotal(String origen, String destino) {
		double precioTotal = 0;

		for (Producto producto : listaProductos) {
			precioTotal += producto.getPrecio();
		}
		precioTotal += calculo.calcularPrecio(origen, destino, obtenerPesoProductos());

		return precioTotal;
	}

	private double obtenerPesoProductos() {
		double peso = 0;

		for (Producto producto : listaProductos) {
			peso += producto.getPeso();
		}

		return peso;
	}
}
