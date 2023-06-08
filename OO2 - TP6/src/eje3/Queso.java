package eje3;

public class Queso extends Comida {
	private Comida extra;

	public Queso(double precio, Comida extra) {
		super(precio, "Con Queso");
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
