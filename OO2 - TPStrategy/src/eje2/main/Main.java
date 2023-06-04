package eje2.main;

import eje2.modelo.FechaCorta;
import eje2.modelo.FechaLarga;
import eje2.modelo.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona(new FechaCorta(), "2023-03-04");
		Persona persona2 = new Persona(new FechaLarga(), "2023-03-04");
		System.out.println(persona1.devolverFechaNacimiento());
		System.out.println(persona2.devolverFechaNacimiento());

	}
}
