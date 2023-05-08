package eje4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion, LogTransaction log) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = log;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal = this.mesConPromocion(precioProducto);
		} else {
			precioTotal = this.mesSinPromocion(precioProducto);
		}
		log.log(this.getClass().getName());
		return precioTotal;
	}

	protected abstract double mesConPromocion(double precioProducto);

	protected abstract double mesSinPromocion(double precioProducto);
}
