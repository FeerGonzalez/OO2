package eje3;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends Seguro {
	private List<Seguro> listaSeguros;

	public Paquete() {
		super(0);
		this.listaSeguros = new ArrayList<>();
	}

	public void agregarSeguro(Seguro seguro) {
		this.listaSeguros.add(seguro);
	}

	public double calcularCosto() {
		double costo = 0;
		for (Seguro seguro : listaSeguros) {
			costo += seguro.calcularCosto();
		}

		costo = aplicarDescuento(costo);

		return costo;
	}

	private double aplicarDescuento(double monto) {
		int cantidadSeguros = this.listaSeguros.size();
		double descuento = 0.05;

		descuento = descuento * cantidadSeguros;

		return monto - (monto * descuento);
	}
}
