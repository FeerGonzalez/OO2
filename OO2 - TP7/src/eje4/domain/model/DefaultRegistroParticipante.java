package eje4.domain.model;

import eje4.domain.portsin.DomainException;
import eje4.domain.portsin.ParticipanteRecord;
import eje4.domain.portsin.RegistroParticipante;
import eje4.domain.portsout.InfraestructureException;
import eje4.domain.portsout.Registro;

public class DefaultRegistroParticipante implements RegistroParticipante {
	private Registro registro;

	public DefaultRegistroParticipante(Registro registro) {
		this.registro = registro;
	}

	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException {
		Participante nuevoParticipante = new Participante(participante.nombre(), participante.telefono(),
				participante.region());

		registro.registrar(nuevoParticipante.getNombre(), nuevoParticipante.getTelefono(),
				nuevoParticipante.getRegion());

	}

}
