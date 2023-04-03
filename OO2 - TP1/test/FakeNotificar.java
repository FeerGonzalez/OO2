import modelo.Notificar;

public class FakeNotificar implements Notificar{
	private String mensaje;
	
	@Override
	public void enviarNotificacion(String destinatario, String asunto, String mensaje) {
		this.mensaje = destinatario + asunto + mensaje;
	}
	
	String getMensaje() {
		return this.mensaje;
	}

}
