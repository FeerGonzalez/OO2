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
		menu();
	}

	private void menu() {
		System.out.println("Bienvenido, ¿Que desea hacer?");
		int i;
		for (i = 0; i < listaAcciones.size(); i++) {
			System.out.println(i + 1 + ". " + listaAcciones.get(i).nombreItemMenu() + " ("
					+ listaAcciones.get(i).descripcionItemMenu() + ")");
		}

		agregarOpcionSalir(i + 1);

	}

	private void llenarListaAcciones() {
		this.listaAcciones = acciones.cargar();
	}

	private void agregarOpcionSalir(int opcion) {
		AccionSalir opcionSalir = new AccionSalir();
		System.out.println(opcion + ". " + opcionSalir.nombreItemMenu());
		listaAcciones.put(listaAcciones.size(), new AccionSalir());
	}

}
