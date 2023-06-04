package eje2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaLarga implements MostrarFecha {

	@Override
	public String mostrar(LocalDate fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
		return fecha.format(formato);
	}

}
