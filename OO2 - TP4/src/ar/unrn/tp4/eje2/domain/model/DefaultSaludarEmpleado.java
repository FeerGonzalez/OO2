package ar.unrn.tp4.eje2.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ar.unrn.tp4.eje2.domain.portsin.SaludarEmpleado;
import ar.unrn.tp4.eje2.domain.portsout.EmpleadoRecord;
import ar.unrn.tp4.eje2.domain.portsout.Lectura;
import ar.unrn.tp4.eje2.domain.portsout.Notificar;

public class DefaultSaludarEmpleado implements SaludarEmpleado{
	private Lectura medioDeLectura;
	private Notificar medioDeNotificacion;
	private List<Empleado> listaEmpleados;

	public DefaultSaludarEmpleado(Lectura lectura, Notificar notificar) {
		Objects.requireNonNull(lectura);
		Objects.requireNonNull(notificar);
		
		this.medioDeLectura = lectura;
		this.medioDeNotificacion = notificar;
		this.listaEmpleados = new ArrayList<>();
	}
	
	@Override
	public void enviarSaludo() {
		List<EmpleadoRecord> listaObjetos = this.medioDeLectura.Leer();

		for (EmpleadoRecord empleadoRecord : listaObjetos) {
			listaEmpleados.add(new Empleado(empleadoRecord.apellido(), empleadoRecord.nombre(),
					empleadoRecord.fechaNacimiento(), empleadoRecord.email()));
		}
		
		for (Empleado empleado : listaEmpleados) {
			if(cumpleAniosHoy(empleado.getFechaNacimiento())) {
				this.medioDeNotificacion.enviar(empleado.getEmail(), "Feliz Cumple Años", "Se te desea un feliz cumple años");
			}
		}
	}
	
	private boolean cumpleAniosHoy(LocalDate fecha){
		LocalDate fechaDeHoy = LocalDate.now();
		
		if(!fechaDeHoy.getMonth().equals(fecha.getMonth())) {
			return false;
		}
		
		if(!Integer.valueOf(fechaDeHoy.getDayOfMonth()).equals(Integer.valueOf(fecha.getDayOfMonth()))) {
			return false;
		}
		
		return true;
	}

	
}
