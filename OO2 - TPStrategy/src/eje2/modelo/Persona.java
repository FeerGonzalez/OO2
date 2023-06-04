package eje2.modelo;

import java.time.LocalDate;

public class Persona {
	private MostrarFecha formato;
	private LocalDate fechaNacimiento;

	public Persona(MostrarFecha formato, String fechaNacimiento) {
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
		this.formato = formato;
	}

	public String devolverFechaNacimiento() {
		return formato.mostrar(fechaNacimiento);
	}
}
