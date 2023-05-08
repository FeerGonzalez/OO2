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

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (of(mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.15;
//		} else {
//			precioTotal += precioProducto * 0.21;
//		}
//		log.log(CalculadorNoJubilado.class.getName());
//		return precioTotal;
//	}
}