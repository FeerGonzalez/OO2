package eje2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements Item {
	private List<Tarea> listaTareas;

	public HistoriaUsuario() {
		this.listaTareas = new ArrayList<>();
	}

	public void agregarTarea(Tarea tarea) {
		this.listaTareas.add(tarea);
	}

	@Override
	public int calcularTiempo() {
		int tiempoEstimado = 0;

		for (Tarea tarea : listaTareas) {
			tiempoEstimado += tarea.getTiempoDeTarea();
		}

		return tiempoEstimado;
	}
}
