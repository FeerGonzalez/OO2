package gonzalez.framework;

public class AccionSalir implements Accion {

	@Override
	public void ejecutar() {
		System.out.println("Saliendo");
	}

	@Override
	public String nombreItemMenu() {
		return "Salir";
	}

	@Override
	public String descripcionItemMenu() {
		return "Salir de la aplicacion";
	}

}
