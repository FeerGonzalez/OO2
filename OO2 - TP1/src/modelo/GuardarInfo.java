package modelo;

import java.io.IOException;

public interface GuardarInfo {
	public void registrarInfo(String unString) throws IOException;
	public void registrarInfo(String unString, String contactoParticipante, String nombreConcurso) throws IOException;
}
