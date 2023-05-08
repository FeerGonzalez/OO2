package eje5;

public abstract class Remera {
	protected double precio;
	protected double recargo;
	protected double bonificacion;
	protected double impuestoAduana;
	protected double impuestoComercio;

	public Remera(double precio, double recargo, double bonificacion, double impuestoAduana, double impuestoComercio) {
		this.precio = precio;
		this.recargo = recargo;
		this.bonificacion = bonificacion;
		this.impuestoAduana = impuestoAduana;
		this.impuestoComercio = impuestoComercio;
	}

	public double calcularPrecio() {
		double precio = this.precio;

		precio += this.recargo(this.precio);
		precio -= this.bonificacion(this.precio);
		precio += this.impuestoAduana(this.precio);
		precio += this.impuestoComercio(this.precio);

		return precio;
	}

	protected abstract double recargo(double monto);

	protected abstract double bonificacion(double monto);

	protected abstract double impuestoAduana(double monto);

	protected abstract double impuestoComercio(double monto);
}
