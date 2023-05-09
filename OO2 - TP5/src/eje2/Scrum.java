package eje2;

import java.util.ArrayList;
import java.util.List;

public class Scrum implements Item {
	private List<Item> listaItems;

	public Scrum() {
		this.listaItems = new ArrayList<>();
	}

	public void agregarItem(Item item) {
		this.listaItems.add(item);
	}

	@Override
	public int calcularTiempo() {
		int tiempoEstimado = 0;

		for (Item item : listaItems) {
			tiempoEstimado += item.calcularTiempo();
		}

		return tiempoEstimado;
	}
}
