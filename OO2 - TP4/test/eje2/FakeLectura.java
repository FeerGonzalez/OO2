package eje2;

import java.util.List;

import ar.unrn.tp4.eje2.domain.portsout.EmpleadoRecord;
import ar.unrn.tp4.eje2.domain.portsout.Lectura;

public class FakeLectura implements Lectura{
	private List<EmpleadoRecord> lista;
	
	public FakeLectura(List<EmpleadoRecord> listaEmpleados) {
		this.lista = listaEmpleados;
	}

	@Override
	public List<EmpleadoRecord> Leer() {
		return this.lista;
	}
}
