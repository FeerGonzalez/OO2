package eje3;

public class Queso implements Comida {
	private double precio;
	private Comida comida;

	public Queso(double precio, Comida comida) {
		this.precio = precio;
		this.comida = comida;
	}

	@Override
	public void verDetalle() {
		if (this.comida != null) {
			this.comida.verDetalle();
		}
		System.out.println("Es Queso: $" + this.precio);
	}

	@Override
	public double calcularCosto() {
		double costo = 0;
		if (this.comida != null) {
			costo = this.comida.calcularCosto();
		}
		return this.precio + costo;
	}

}
