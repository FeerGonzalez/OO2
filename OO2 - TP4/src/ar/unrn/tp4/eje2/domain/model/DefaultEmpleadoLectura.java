package ar.unrn.tp4.eje2.domain.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ar.unrn.tp4.eje2.domain.portsout.Lectura;
import ar.unrn.tp4.eje2.domain.portsout.Notificar;

public class DefaultEmpleadoLectura implements Lectura{
	private String archivo;
	private Notificar medioDeNotificacion;
	private List<Empleado> listaEmpleados;
	
	public DefaultEmpleadoLectura(Notificar notificar, String archivo) {
		Objects.requireNonNull(notificar);
		Objects.requireNonNull(archivo);
		
		if(archivo.isEmpty() || archivo.isBlank()) {
			throw new RuntimeException("El campo archivo esta vacio");
		}
		
		this.archivo = archivo;
		this.medioDeNotificacion = notificar;
		this.listaEmpleados = new ArrayList<>();
	}
	
	public void EnviarSaludos() {
//		if() {
//			
//		}
	}

	@Override
	public void Leer() {
		try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(this.archivo));

            String cadena;
            while ((cadena = bufferReader.readLine()) != null) {
                String[] atributos = cadena.split(",");

                String apellido = atributos[0];
                String nombre = atributos[1];
                String fechaNacimiento = atributos[2];
                String correo = atributos[3];
                
                Empleado empleado = new Empleado(apellido, nombre, fechaNacimiento, correo);
                listaEmpleados.add(empleado);
            }
            
            bufferReader.close();

        } catch (IOException e) {
        	
        }
	}
	
	private boolean cumpleAniosHoy(LocalDate fecha){
		boolean cumpleAnios = false;
		LocalDate fechaDeHoy = LocalDate.now();
		
		cumpleAnios = fechaDeHoy.getMonth().equals(fecha.getMonth());

		cumpleAnios &= Integer.valueOf(fechaDeHoy.getDayOfMonth()).equals(Integer.valueOf(fecha.getDayOfMonth()));
		
		return cumpleAnios;
	}
}
