package eje4.domain.portsin;

import eje4.domain.portsout.InfraestructureException;

public interface RegistroParticipante {
	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException;
}
