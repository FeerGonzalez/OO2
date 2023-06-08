package eje3;

public class Carne extends Comida {
	private Comida extra;

	public Carne(double precio, Comida extra) {
		super(precio, "Con Carne");
		this.extra = extra;
	}

	@Override
	public String obtenerDescripcion() {
		return extra.obtenerDescripcion() + "\n" + this.descripcion;
	}

	@Override
	public double calcularPrecio() {
		return this.precio + extra.calcularPrecio();
	}
}
