package ar.unrn.tp4.eje2.domain.portsout;

public interface Notificar {
	public void enviar(String destinatario, String asunto, String mensaje);
}
