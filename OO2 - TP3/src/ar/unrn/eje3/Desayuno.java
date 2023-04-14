package ar.unrn.eje3;

public class Desayuno extends Gasto{

	public Desayuno(String nombre, int costo) {
		super(nombre, costo);
	}

	public int devolverMontoSiEsComida() {
		return this.costo;
	}
	
	public boolean esExcesoDeGasto() {
		return this.costo > 1000;
	}
}
