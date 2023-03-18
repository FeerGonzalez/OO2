package modelo;

public class Bebida {
	private String nombre;
	private int precio;
	
	public Bebida(String nombre, int precio) {
		if(nombre == null) {
			throw new RuntimeException("Faltan datos");
		}
		if(nombre.isEmpty()) {
			throw new RuntimeException("Los campos estan vacios");
		}
		this.nombre = nombre;
		this.precio = precio;
	}
	
	int getPrecio() {
		return this.precio;
	}
}
