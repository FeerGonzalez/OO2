package eje2.main;

import eje2.modelo.Persona;
import eje2.modelo.PersonaDao;
import eje2.modelo.Telefono;

public class Main {

	public static void main(String[] args) {
		PersonaDao dao = new PersonaDao();
		Persona p = dao.personaPorId(1);
		System.out.println(p.nombre());
		for (Telefono telefono : p.telefonos()) {
			System.out.println(telefono);
		}

	}

}
