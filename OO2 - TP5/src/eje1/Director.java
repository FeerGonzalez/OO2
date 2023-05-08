package eje1;

import java.util.ArrayList;
import java.util.List;

public class Director extends Empleado {
	private List<Gerente> listaGerentesACargo;

	public Director(double salario) {
		super(salario);
		this.listaGerentesACargo = new ArrayList<>();
	}

	public Director(double salario, List<Gerente> listaGerentes) {
		super(salario);
		this.listaGerentesACargo = listaGerentes;
	}

	@Override
	public double calcularMonto() {
		double monto = 0;

		for (Gerente gerente : listaGerentesACargo) {
			monto += gerente.calcularMonto();
		}

		return this.salario + monto;
	}
}
