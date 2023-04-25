package ar.unrn.tp4.eje3.domain.portsout;

import java.util.List;

public interface Lectura {
	public List<ConcursoRecord> leer();
	public List<ConcursoRecord> devolverConcursosVigentes();
}
