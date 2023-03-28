package modelo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Participante {
	private GuardarInfo guardarInfo;
	private static int auxID=1;
	private final int id;
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
		
		this.id = auxID;
		this.nombre = unNombre;
		this.contacto = unContacto;
		this.puntos = 0;
		this.listaConcursosInscriptos = new ArrayList<>();
		this.guardarInfo = null;
		auxID = auxID + 1;
	}
	
	public Participante(String unNombre, String unContacto, GuardarInfo dondeGuardar) {
		if(unNombre == null || unContacto == null) {
			throw new RuntimeException("Faltan datos en uno de los campos para crear un participante\n");
		}
		if(unNombre.isEmpty() || unContacto.isEmpty()) {
			throw new RuntimeException("Faltan datos en uno de los campos para crear un participante\n");
		}
		
		this.id = auxID;
		this.nombre = unNombre;
		this.contacto = unContacto;
		this.puntos = 0;
		this.listaConcursosInscriptos = new ArrayList<>();
		this.guardarInfo = dondeGuardar;
		auxID = auxID + 1;
	}

	public Boolean inscribirseAConcurso(Concurso unConcurso) throws IOException {
		if(unConcurso.verificarInscripcionParticipante(this)) {
			listaConcursosInscriptos.add(unConcurso);
			unConcurso.agregarParticipante(this);
			String cadena = LocalDate.now().toString() + "," + this.id + "," + unConcurso.getId();
//			this.guardarInfo.registrarInfo(cadena);
//			new EnviarMail(this.contacto, "Inscripcion a " + unConcurso.getNombre(), "Pudo inscribirse al " + unConcurso.getNombre() + " Correctamente");
			this.guardarInfo.registrarInfo(cadena, this.contacto, unConcurso.getNombre());
			return true;
		}else {
			return false;
		}
	}
	
	public void sumarPuntos(int puntos) {
		this.puntos = this.puntos + puntos;
	}

	public GuardarInfo getGuardarInfo() {
		return guardarInfo;
	}

	public void setGuardarInfo(GuardarInfo guardarInfo) {
		this.guardarInfo = guardarInfo;
	}
}
