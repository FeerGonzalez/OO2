package eje3;

public class Papa extends Comida {
	private Comida extra;

	public Papa(double precio, Comida extra) {
		super(precio, "Con Papa");
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
