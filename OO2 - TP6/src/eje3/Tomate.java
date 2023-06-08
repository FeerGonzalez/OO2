package eje3;

public class Tomate extends Comida {
	private Comida extra;

	public Tomate(double precio, Comida extra) {
		super(precio, "Con Tomate");
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
