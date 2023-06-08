package eje3;

public abstract class Comida {
	protected String descripcion;
	protected double precio;

	public Comida(double precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String obtenerDescripcion() {
		return descripcion;
	}

	public double calcularPrecio() {
		return precio;
	}
}
