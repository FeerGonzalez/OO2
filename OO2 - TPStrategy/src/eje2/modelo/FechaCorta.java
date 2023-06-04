package eje2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements MostrarFecha {

	@Override
	public String mostrar(LocalDate fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return fecha.format(formato);
	}

}
