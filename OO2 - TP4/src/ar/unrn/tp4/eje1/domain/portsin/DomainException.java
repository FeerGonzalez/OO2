package ar.unrn.tp4.eje1.domain.portsin;

public class DomainException extends Exception {
	
	public DomainException() {
		super();
	}

	public DomainException(String mensaje) {
		super(mensaje);
	}
}
