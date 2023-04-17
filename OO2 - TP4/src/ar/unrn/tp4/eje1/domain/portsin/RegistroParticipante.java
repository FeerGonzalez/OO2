package ar.unrn.tp4.eje1.domain.portsin;

import ar.unrn.tp4.eje1.domain.portsout.InfraestructureException;

public interface RegistroParticipante {
	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException;
}
