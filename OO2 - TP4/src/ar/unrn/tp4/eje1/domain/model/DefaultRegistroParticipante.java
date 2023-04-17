package ar.unrn.tp4.eje1.domain.model;

import ar.unrn.tp4.eje1.domain.portsin.DomainException;
import ar.unrn.tp4.eje1.domain.portsin.ParticipanteRecord;
import ar.unrn.tp4.eje1.domain.portsin.RegistroParticipante;
import ar.unrn.tp4.eje1.domain.portsout.InfraestructureException;
import ar.unrn.tp4.eje1.domain.portsout.Registro;

public class DefaultRegistroParticipante implements RegistroParticipante{
	private Registro registro;
	
	public DefaultRegistroParticipante(Registro registro) {
		this.registro = registro;
	}
	
	public void registrar(ParticipanteRecord participante) throws DomainException, InfraestructureException {
		Participante nuevoParticipante = 
				new Participante(participante.nombre(), participante.telefono(), participante.region());
		
		registro.registrar(nuevoParticipante.getNombre(), nuevoParticipante.getTelefono(), nuevoParticipante.getRegion());
		
	}

}
