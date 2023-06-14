package gonzalez.utilizacion;

import gonzalez.framework.Accion;

public class AccionUno implements Accion {

	@Override
	public void ejecutar() {
		System.out.println("Opcion 1");
	}

	@Override
	public String nombreItemMenu() {
		return "Accion 1";
	}

	@Override
	public String descripcionItemMenu() {
		return "Mostrar Opcion1";
	}

}
