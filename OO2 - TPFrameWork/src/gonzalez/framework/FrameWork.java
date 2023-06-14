package gonzalez.framework;

import java.util.HashMap;
import java.util.Objects;

public class FrameWork {
	private CargarAcciones acciones;
	private HashMap<Integer, Accion> listaAcciones;

	public FrameWork(CargarAcciones acciones) {
		Objects.requireNonNull(acciones);
		this.acciones = acciones;
	}

	public void start() {
		llenarListaAcciones();
		agregarOpcionSalir();
		menu();
	}

	private void menu() {
		System.out.println("Bienvenido, ¿Que desea hacer?");

		for (int i = 0; i < listaAcciones.size(); i++) {
			System.out
					.println(listaAcciones.get(i).nombreItemMenu() + " " + listaAcciones.get(i).descripcionItemMenu());
		}

	}

	private void llenarListaAcciones() {
		this.listaAcciones = acciones.cargar();
	}

	private void agregarOpcionSalir() {
		listaAcciones.put(listaAcciones.size() + 1, new AccionSalir());
	}

}
