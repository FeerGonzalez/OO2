package ar.unrn.tp4.eje1.domain.model;

import java.util.Objects;

import ar.unrn.tp4.eje1.domain.portsin.DomainException;

class Participante {
	private String nombre;
	private Telefono telefono;
	private Region region;
	
	public Participante(String nombre, String telefono, String region) throws DomainException {
		Objects.requireNonNull(nombre);
		
		if(nombre.isEmpty() || nombre.isBlank()) {
			throw new DomainException("Hay campos vacios");
		}
		
		this.nombre = nombre;
		this.telefono = new Telefono(telefono);
		this.region = new Region(region);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTelefono() {
		return telefono.getTelefono();
	}
	
	public String getRegion() {
		return region.getRegion();
	}
}
