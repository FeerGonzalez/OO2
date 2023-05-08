package eje1;

public class EmpleadoRegular extends Empleado {

	public EmpleadoRegular(double salario) {
		super(salario);
	}

	@Override
	public double calcularMonto() {
		return this.salario;
	}
}
