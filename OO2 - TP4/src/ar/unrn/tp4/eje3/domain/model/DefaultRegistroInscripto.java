package ar.unrn.tp4.eje3.domain.model;

import java.util.Objects;

import ar.unrn.tp4.eje3.domain.portsin.InscriptoRecord;
import ar.unrn.tp4.eje3.domain.portsin.RegistroInscripto;
import ar.unrn.tp4.eje3.domain.portsout.Lectura;
import ar.unrn.tp4.eje3.domain.portsout.Registro;

public class DefaultRegistroInscripto implements RegistroInscripto{
	private Lectura lectura;
	private Registro registro;
	
	public DefaultRegistroInscripto(Lectura lectura, Registro registro){
		Objects.requireNonNull(lectura);
		Objects.requireNonNull(registro);
		
		this.lectura = lectura;
		this.registro = registro;
	}
	
	@Override
	public void registrar(InscriptoRecord inscripto) {
		// TODO Auto-generated method stub
		
	}

}
