package eje3.domain.portsin;

import eje3.domain.portsout.InfraestructureException;

public interface RegistroParticipante {
	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException;
}
