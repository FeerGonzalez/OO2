package eje1;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {
	private List<MandoMedio> listaMandosMediosACargo;

	public Gerente(double salario) {
		super(salario);
		this.listaMandosMediosACargo = new ArrayList<>();
	}

	public Gerente(double salario, List<MandoMedio> listaMandoMedio) {
		super(salario);
		this.listaMandosMediosACargo = listaMandoMedio;
	}

	@Override
	public double calcularMonto() {
		double monto = 0;

		for (MandoMedio mandoMedio : listaMandosMediosACargo) {
			monto += mandoMedio.calcularMonto();
		}

		return this.salario + monto;
	}
}
