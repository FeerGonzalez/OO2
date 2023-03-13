package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private String nombre;
	private LocalDate fechaAperturaInscripcion;
	private LocalDate fechaCierreInscripcion;
	private ArrayList<Participante> listaDeParticipantes;
	
	public Concurso(String nombre, String fechaApertura, String fechaCierre) {
		if(nombre == null || fechaApertura == null || fechaCierre == null) {
			throw new RuntimeException("Faltan datos en uno de los campos para crear un concurso\n");
		}
		if(nombre.isEmpty() || fechaApertura.isEmpty() || fechaCierre.isEmpty()) {
			throw new RuntimeException("Hay campos vacios para crear un concurso\n");
		}
		
		this.nombre = nombre;
		this.fechaAperturaInscripcion = LocalDate.parse(fechaApertura);
		this.fechaCierreInscripcion = LocalDate.parse(fechaCierre);
		this.listaDeParticipantes = new ArrayList<>();
	}
	
	public void agregarParticipante(Participante unParticipante) {
		this.listaDeParticipantes.add(unParticipante);
	}
	
	public void eliminarParticipante(Participante unParticipante) {
		this.listaDeParticipantes.remove(unParticipante);
	}

	public void sumarPuntosParticipanteInscripcion(Participante unParticipante) {
		unParticipante.setPuntos(unParticipante.getPuntos() + 10);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaAperturaInscripcion() {
		return fechaAperturaInscripcion;
	}

	public void setFechaAperturaInscripcion(LocalDate fechaAperturaInscripcion) {
		this.fechaAperturaInscripcion = fechaAperturaInscripcion;
	}

	public LocalDate getFechaCierreInscripcion() {
		return fechaCierreInscripcion;
	}

	public void setFechaCierreInscripcion(LocalDate fechaCierreInscripcion) {
		this.fechaCierreInscripcion = fechaCierreInscripcion;
	}

	public ArrayList<Participante> getListaDeParticipantes() {
		return listaDeParticipantes;
	}

	public void setListaDeParticipantes(ArrayList<Participante> listaDeParticipantes) {
		this.listaDeParticipantes = listaDeParticipantes;
	}
}
