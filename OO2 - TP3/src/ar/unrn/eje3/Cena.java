package ar.unrn.eje3;

public class Cena extends Gasto{

	public Cena(String nombre, int costo) {
		super(nombre, costo);
	}
	
	public int devolverMontoSiEsComida() {
		return this.costo;
	}
	
	public boolean esExcesoDeGasto() {
		return this.costo > 5000;
	}

}
