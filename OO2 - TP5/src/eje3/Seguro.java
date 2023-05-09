package eje3;

public abstract class Seguro {
	private double costo;

	public Seguro(double costo) {
		this.costo = costo;
	}

	public double calcularCosto() {
		return this.costo;
	}
}
