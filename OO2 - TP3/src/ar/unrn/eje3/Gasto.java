package ar.unrn.eje3;

public abstract class Gasto {
	protected String nombre;
	protected int costo;
	
	public Gasto(String nombre, int costo) {
		if(nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("Faltan datos");
		}
		
		this.nombre = nombre;
		this.costo = costo;
	}
	
	public int getCosto() {
		return this.costo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int devolverMontoSiEsComida() {
		return 0;
	}
	
	public boolean esExcesoDeGasto() {
		return false;
	}
}
