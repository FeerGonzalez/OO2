package eje4.domain.model;

import java.util.ArrayList;
import java.util.List;

import eje1y2.Observer;

abstract class Observable {
	private List<Observer> observadores;

	public Observable() {
		this.observadores = new ArrayList<>();
	}

	public void agregarObservador(Observer obs) {
		this.observadores.add(obs);
	}

	protected void notificar(String valor) {
		for (Observer observer : observadores) {
			observer.actualizar(valor);
		}
	}
}
