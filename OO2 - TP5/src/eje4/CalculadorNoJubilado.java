package eje4;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.15);
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.21);
	}

}