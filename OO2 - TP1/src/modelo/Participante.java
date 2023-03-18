package modelo;

import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String contacto;
	private int puntos;
	private ArrayList<Concurso> listaConcursosInscriptos;
	
	public Participante(String unNombre, String unContacto) {
		if(unNombre == null || unContacto == null) {
			throw new RuntimeException("Faltan datos en uno de los campos para crear un participante\n");
		}
		if(unNombre.isEmpty() || unContacto.isEmpty()) {
			throw new RuntimeException("Faltan datos en uno de los campos para crear un participante\n");
		}
		
		this.nombre = unNombre;
		this.contacto = unContacto;
		this.puntos = 0;
		this.listaConcursosInscriptos = new ArrayList<>();
	}

	public Boolean inscribirseAConcurso(Concurso unConcurso) {
		if(unConcurso.verificarInscripcionParticipante(this)) {
			listaConcursosInscriptos.add(unConcurso);
			unConcurso.agregarParticipante(this);
			return true;
		}else {
			return false;
		}
	}
	
	public void sumarPuntos(int puntos) {
		this.puntos = this.puntos + puntos;
	}
}
