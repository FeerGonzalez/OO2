package eje4.domain.portsout;

public interface Registro {
	public void registrar(String nombre, String numeroTelefono, String region) throws InfraestructureException;
}
