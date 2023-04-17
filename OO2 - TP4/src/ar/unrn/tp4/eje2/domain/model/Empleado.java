package ar.unrn.tp4.eje2.domain.model;

import java.time.LocalDate;
import java.util.Objects;

class Empleado {
	private String apellido;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String email;
	
	public Empleado(String apellido, String nombre, String fechaNacimiento, String email) {
		verificarCampo(apellido);
		verificarCampo(nombre);
		verificarCampo(fechaNacimiento);
		verificarCampo(email);
		
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
		this.email = email;
	}
	
	public String getNombreCompleto() {
		return this.apellido + this.nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private void verificarCampo(String campo) {
		Objects.requireNonNull(campo);
		
		if(campo.isEmpty() || campo.isBlank()) {
			throw new RuntimeException("El campo esta vacio");
		}
	}
}
