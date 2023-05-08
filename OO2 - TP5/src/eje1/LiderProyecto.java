package eje1;

import java.util.ArrayList;
import java.util.List;

public class LiderProyecto extends Empleado {
	private List<EmpleadoRegular> listaEmpleadosRegularesACargo;

	public LiderProyecto(double salario) {
		super(salario);
		this.listaEmpleadosRegularesACargo = new ArrayList<>();
	}

	public LiderProyecto(double salario, List<EmpleadoRegular> listaEmpleadoRegular) {
		super(salario);
		this.listaEmpleadosRegularesACargo = listaEmpleadoRegular;
	}

	@Override
	public double calcularMonto() {
		double monto = 0;

		for (EmpleadoRegular empleadoRegular : listaEmpleadosRegularesACargo) {
			monto += empleadoRegular.calcularMonto();
		}

		return this.salario + monto;
	}
}
