package eje1;

import java.util.Objects;

public abstract class Empleado {
	protected float monto;
	
	public Empleado(float monto) {
		Objects.requireNonNull(monto);
		
		if(monto < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		
		this.monto = monto;
	}
}
