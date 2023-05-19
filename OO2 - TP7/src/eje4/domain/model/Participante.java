package eje4.domain.model;

import java.util.Objects;

import eje4.domain.portsin.DomainException;

class Participante {
	private String nombre;
	private Telefono telefono;
	private Email email;
	private Region region;

	public Participante(String nombre, String telefono, String email, String region) throws DomainException {
		Objects.requireNonNull(nombre);

		if (nombre.isEmpty() || nombre.isBlank()) {
			throw new DomainException("Hay campos vacios");
		}

		this.nombre = nombre;
		this.telefono = new Telefono(telefono);
		this.email = new Email(email);
		this.region = new Region(region);
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getTelefono() {
		return telefono.getTelefono();
	}

	public String getEmail() {
		return email.getEmail();
	}

	public String getRegion() {
		return region.getRegion();
	}
}
