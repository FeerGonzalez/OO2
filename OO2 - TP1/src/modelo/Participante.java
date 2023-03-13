package modelo;

import java.time.LocalDate;
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
		if(verificarFechaInscripcion(unConcurso)) {
			listaConcursosInscriptos.add(unConcurso);
			unConcurso.agregarParticipante(this);
			System.out.println("El participanse se pudo inscribir correctamente\n");
			return true;
		}else {
			System.out.println("El participante no pudo inscribirse al concurso\n");
			return false;
		}
	}
	
	private boolean verificarFechaInscripcion(Concurso unConcurso) {
		LocalDate fechaDeHoy = LocalDate.now();
		
		if(fechaDeHoy.isBefore(unConcurso.getFechaAperturaInscripcion()) || fechaDeHoy.isAfter(unConcurso.getFechaCierreInscripcion())) {
			return false;
		}else {
			if(fechaDeHoy.isEqual(unConcurso.getFechaAperturaInscripcion())) {
				unConcurso.sumarPuntosParticipanteInscripcion(this);
			}
			return true;
		}
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public ArrayList<Concurso> getListaConcursosInscriptos() {
		return listaConcursosInscriptos;
	}

	public void setListaConcursosInscriptos(ArrayList<Concurso> listaConcursosInscriptos) {
		this.listaConcursosInscriptos = listaConcursosInscriptos;
	}
}
