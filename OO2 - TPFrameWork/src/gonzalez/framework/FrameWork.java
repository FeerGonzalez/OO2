package gonzalez.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FrameWork {
	private CargarAcciones acciones;
	private Pantalla pantalla;
	private HashMap<Integer, Accion> listaAcciones;

	public FrameWork(String path) {
		Objects.requireNonNull(path);
		this.acciones = new ArchivoCargarDatos(path);
	}

	public void start() {
		llenarListaAcciones();
		menu();
	}

	private void menu() {
//		System.out.println("Bienvenido, ¿Que desea hacer?");
//		int i;
//		for (i = 0; i < listaAcciones.size(); i++) {
//			System.out.println(i + 1 + ". " + listaAcciones.get(i).nombreItemMenu() + " ("
//					+ listaAcciones.get(i).descripcionItemMenu() + ")");
//		}
		agregarOpcionSalir(this.listaAcciones.size() + 1);
		this.pantalla = new Pantalla(convertirALista(), obtenerHilos());
		this.pantalla.mostrar();
	}

	private void llenarListaAcciones() {
		this.listaAcciones = acciones.cargar();
	}

	private void agregarOpcionSalir(int opcion) {
//		AccionSalir opcionSalir = new AccionSalir();
//		System.out.println(opcion + ". " + opcionSalir.nombreItemMenu());
		listaAcciones.put(listaAcciones.size(), new AccionSalir());
	}

	private List<Accion> convertirALista() {
		List<Accion> lista = new ArrayList<>();

		for (int i = 0; i < this.listaAcciones.size(); i++) {
			lista.add(this.listaAcciones.get(i));
		}

		return lista;
	}

	private int obtenerHilos() {
		if (acciones.esJson()) {
			return acciones.devolverCantidadThreads();
		}
		return 1;
	}

}
