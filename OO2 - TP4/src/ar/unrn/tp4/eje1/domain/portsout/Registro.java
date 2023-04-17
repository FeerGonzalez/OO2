package ar.unrn.tp4.eje1.domain.portsout;

public interface Registro {
	public void registrar(String nombre, String numeroTelefono, String region) throws InfraestructureException;
}
