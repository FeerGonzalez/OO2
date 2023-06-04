package eje1.model;

public class Producto {
	private String nombre;
	private double precio;
	private double peso;

	public Producto(String nombre, double precio, double peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
	}

//	public String getNombre() {
//		return nombre;
//	}

	public double getPrecio() {
		return precio;
	}

	public double getPeso() {
		return peso;
	}
}
