package modelo;

public class Plato {
	private String nombre;
	private int precio;
	
	public Plato(String nombre, int precio) {
		if(nombre == null) {
			throw new RuntimeException("Faltan datos");
		}
		if(nombre.isEmpty()) {
			throw new RuntimeException("Hay un campo vacio");
		}
		
		this.nombre = nombre;
		this.precio = precio;
	}
	
	int getPrecio() {
		return this.precio;
	}
}
