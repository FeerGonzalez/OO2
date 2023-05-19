package eje4.domain.model;

import java.util.ArrayList;
import java.util.List;

import eje4.domain.portsout.Observer;

abstract class Observable {
	private List<Observer> observadores;

	public Observable() {
		this.observadores = new ArrayList<>();
	}

	public void agregarObservador(Observer obs) {
		this.observadores.add(obs);
	}

	protected void notificar(String contacto, String motivo) {
		for (Observer observer : observadores) {
			observer.actualizar(contacto, motivo);
		}
	}
}
