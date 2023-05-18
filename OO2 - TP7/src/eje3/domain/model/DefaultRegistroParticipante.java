package eje3.domain.model;

import eje3.domain.portsin.DomainException;
import eje3.domain.portsin.ParticipanteRecord;
import eje3.domain.portsin.RegistroParticipante;
import eje3.domain.portsout.InfraestructureException;
import eje3.domain.portsout.Registro;

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
