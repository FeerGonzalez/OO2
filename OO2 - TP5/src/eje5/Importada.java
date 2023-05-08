package eje5;

public class Importada extends Remera {

	public Importada(double precio, double recargo, double impuestoAduana, double impuestoComercio) {
		super(precio, recargo, 0, impuestoAduana, impuestoComercio);
	}

	@Override
	protected double recargo(double monto) {
		return monto * (this.recargo / 100);
	}

	@Override
	protected double bonificacion(double monto) {
		return monto * (this.bonificacion / 100);
	}

	@Override
	protected double impuestoAduana(double monto) {
		return monto * (this.impuestoAduana / 100);
	}

	@Override
	protected double impuestoComercio(double monto) {
		return monto * (this.impuestoComercio / 100);
	}

}
