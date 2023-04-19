package ar.unrn.tp4.eje2;

import ar.unrn.tp4.eje2.domain.model.DefaultSaludarEmpleado;
import ar.unrn.tp4.eje2.infraestructure.data.ArchivoLectura;
import ar.unrn.tp4.eje2.infraestructure.notification.MailNotificar;

public class Main {

	public static void main(String[] args) {
		
		DefaultSaludarEmpleado saludar = new DefaultSaludarEmpleado(new ArchivoLectura("Empleados"), new MailNotificar());
		
		saludar.enviarSaludo();

	}

}
