package gonzalez.utilizacion;

import gonzalez.framework.Accion;

public class AccionDos implements Accion {

	@Override
	public void ejecutar() {
		System.out.println("Opcion 2");
	}

	@Override
	public String nombreItemMenu() {
		return "Accion 2";
	}

	@Override
	public String descripcionItemMenu() {
		return "Mostrar Opcion 2";
	}

}
