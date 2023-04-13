package ar.unrn.eje4;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		Objects.requireNonNull(nombre);
		Objects.requireNonNull(apellido);
		
		if(nombre.isEmpty() || apellido.isEmpty()) {
			throw new RuntimeException("Hay campos vacios");
		}
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
}


//public record Persona(String nombre, String apellido) {
//
//}
