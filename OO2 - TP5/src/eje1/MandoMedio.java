package eje1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Empleado {
	private List<LiderProyecto> listaLideresProyectoACargo;

	public MandoMedio(double salario) {
		super(salario);
		this.listaLideresProyectoACargo = new ArrayList<>();
	}

	public MandoMedio(double salario, List<LiderProyecto> listaLiderProyecto) {
		super(salario);
		this.listaLideresProyectoACargo = listaLiderProyecto;
	}

	@Override
	public double calcularMonto() {
		double monto = 0;

		for (LiderProyecto liderProyecto : listaLideresProyectoACargo) {
			monto += liderProyecto.calcularMonto();
		}

		return this.salario + monto;
	}
}
