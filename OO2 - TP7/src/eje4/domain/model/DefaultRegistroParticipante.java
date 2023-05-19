package eje4.domain.model;

import java.util.List;

import eje4.domain.portsin.DomainException;
import eje4.domain.portsin.ParticipanteRecord;
import eje4.domain.portsin.RegistroParticipante;
import eje4.domain.portsout.InfraestructureException;
import eje4.domain.portsout.Observer;
import eje4.domain.portsout.Registro;

public class DefaultRegistroParticipante extends Observable implements RegistroParticipante {
	private Registro registro;

	public DefaultRegistroParticipante(Registro registro, List<Observer> observadores) {
		this.registro = registro;
		for (Observer observer : observadores) {
			this.agregarObservador(observer);
		}
	}

	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException {
		Participante nuevoParticipante = new Participante(participante.nombre(), participante.telefono(),
				participante.email(), participante.region());

		registro.registrar(nuevoParticipante.getNombre(), nuevoParticipante.getTelefono(), nuevoParticipante.getEmail(),
				nuevoParticipante.getRegion());

		this.notificar(nuevoParticipante.getEmail(), "Usted se ha registrado correctamente");
	}

}
