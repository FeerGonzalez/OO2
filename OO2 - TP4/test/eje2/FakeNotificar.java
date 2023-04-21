package eje2;

import ar.unrn.tp4.eje2.domain.portsout.Notificar;

public class FakeNotificar implements Notificar{
	private String mensaje;

	@Override
	public void enviar(String destinatario, String asunto, String mensaje) {
		this.mensaje = destinatario + asunto + mensaje;
		
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
}
