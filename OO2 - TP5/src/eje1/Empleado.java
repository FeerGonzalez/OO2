package eje1;

import java.util.Objects;

public abstract class Empleado {
	protected double salario;

	public Empleado(double salario) {
		Objects.requireNonNull(salario);

		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}

		this.salario = salario;
	}

	public abstract double calcularMonto();

}
