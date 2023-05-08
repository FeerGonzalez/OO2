package eje4;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return precioProducto;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.1);
	}

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (!of(mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.1;
//		}
//		log.log(CalculadorJubilado.class.getName());
//		return precioTotal;
//	}
}