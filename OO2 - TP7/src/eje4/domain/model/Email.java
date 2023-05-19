package eje4.domain.model;

import java.util.Objects;

import eje4.domain.portsin.DomainException;

class Email {
	private String email;

	public Email(String email) throws DomainException {
		Objects.requireNonNull(email);

		if (email.isEmpty() || email.isBlank()) {
			throw new DomainException("El campo de email no puede estar vacio");
		}
		if (!checkEmail(email)) {
			throw new DomainException("El formato de Email es invalido");
		}

		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	private boolean checkEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}
}
