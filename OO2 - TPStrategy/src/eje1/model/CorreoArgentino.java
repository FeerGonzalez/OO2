package eje1.model;

import java.util.Map;

public class CorreoArgentino implements Calcular {

	private Map<String, Double> lugares;

	public CorreoArgentino(Map<String, Double> lugares) {
		this.lugares = lugares;
	}

	@Override
	public double calcularPrecio(String origen, String destino, double peso) {
		double precio;

		precio = calcularPrecioDestino(destino);
		precio += calcularPrecioPorKm(origen, destino);

		return precio;
	}

	private double calcularPrecioPorKm(String origen, String destino) {
		double precio = 0, precioPorKm = 5;

		// No anda la web externa para calcular los km, solo devuelve 0

		return precio;
	}

	private double calcularPrecioDestino(String destino) {
		if (lugares.containsKey(destino)) {
			return lugares.get(destino);
		}
		return 800;
	}

}
