package eje5;

public class Nacional extends Remera {

	public Nacional(double precio, double recargo, double bonificacion, double impuestoComercio) {
		super(precio, recargo, bonificacion, 0, impuestoComercio);
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
