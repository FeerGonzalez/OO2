package eje1.model;

import java.util.Map;

public class ColectivoSur implements Calcular {
	private Map<String, Double> lugares;

	public ColectivoSur(Map<String, Double> lugares) {
		this.lugares = lugares;
	}

	@Override
	public double calcularPrecio(String origen, String destino, double peso) {
		double precio;

		precio = calcularPrecioDestino(destino);
		precio += esMayorAlPesoMinimo(peso);
		precio += esMayorAlPesoMaximo(peso);

		return precio;
	}

	private double esMayorAlPesoMinimo(double peso) {
		if (peso > 5 && peso < 30) {
			return 500;
		}
		return 0;
	}

	private double esMayorAlPesoMaximo(double peso) {
		if (peso > 30) {
			return 2000;
		}
		return 0;
	}

	private double calcularPrecioDestino(String destino) {
		if (lugares.containsKey(destino)) {
			return lugares.get(destino);
		}
		return 3000;
	}

}
