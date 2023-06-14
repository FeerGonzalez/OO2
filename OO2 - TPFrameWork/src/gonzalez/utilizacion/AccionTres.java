package gonzalez.utilizacion;

import gonzalez.framework.Accion;

public class AccionTres implements Accion {

	@Override
	public void ejecutar() {
		System.out.println("Opcion 3");
	}

	@Override
	public String nombreItemMenu() {
		return "Accion 3";
	}

	@Override
	public String descripcionItemMenu() {
		return "Mostrar Opcion 3";
	}
}
