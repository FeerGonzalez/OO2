package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private static int auxID=1;
	private final int id;
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
		this.id = auxID;
		this.nombre = nombre;
		this.fechaAperturaInscripcion = LocalDate.parse(fechaApertura);
		this.fechaCierreInscripcion = LocalDate.parse(fechaCierre);
		this.listaDeParticipantes = new ArrayList<>();
		auxID = auxID + 1;
	}
	
	public void agregarParticipante(Participante unParticipante) {
		this.listaDeParticipantes.add(unParticipante);
	}
	
	public void eliminarParticipante(Participante unParticipante) {
		this.listaDeParticipantes.remove(unParticipante);
	}
	
	public boolean verificarInscripcionParticipante(Participante unParticipante) {
		LocalDate fechaDeHoy = LocalDate.now();
		
		if(fechaDeHoy.isBefore(this.fechaAperturaInscripcion) || fechaDeHoy.isAfter(this.fechaCierreInscripcion)) {
			return false;
		}else {
			if(fechaDeHoy.isEqual(this.fechaAperturaInscripcion)) {
				unParticipante.sumarPuntos(10);
			}
			return true;
		}
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
}
