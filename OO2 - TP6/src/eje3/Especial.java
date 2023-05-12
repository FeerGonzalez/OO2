package eje3;

public class Especial implements Combo {
	private double precio;
	private Comida porcionesAgregadas;

	public Especial(double precio, Comida comida) {
		this.precio = precio;
		this.porcionesAgregadas = comida;
	}

	@Override
	public void verDetalle() {
		System.out.println("Este es un Combo Especial: $" + this.precio);
		if (this.porcionesAgregadas != null) {
			this.porcionesAgregadas.verDetalle();
		}
		System.out.println("Precio final del combo: $" + this.calcularMontoFinal());
	}

	private double calcularMontoFinal() {
		double costo = 0;
		if (this.porcionesAgregadas != null) {
			costo = this.porcionesAgregadas.calcularCosto();
		}
		return this.precio + costo;
	}

//	@Override
//	public double calcularMontoFinal() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
