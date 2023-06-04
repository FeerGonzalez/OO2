package eje1.main;

import java.util.Map;

import eje1.model.ColectivoSur;
import eje1.model.CorreoArgentino;

public class Main {

	public static void main(String[] args) {
		ColectivoSur colectivoSur = new ColectivoSur(Map.of("Capital Federal", 1000.0, "Gran Buenos Aires", 1500.0));

//		System.out.println(colectivoSur.calcularPrecio("Capital Federal", "Viedma", 2.0));
//		System.out.println(colectivoSur.calcularPrecio("Capital Federal", "Viedma", 6.0));
//		System.out.println(colectivoSur.calcularPrecio("Capital Federal", "Viedma", 31.0));
//		System.out.println();
//		System.out.println(colectivoSur.calcularPrecio("Viedma", "Capital Federal", 31.0));
//		System.out.println(colectivoSur.calcularPrecio("Viedma", "Capital Federal", 6.0));
//		System.out.println(colectivoSur.calcularPrecio("Viedma", "Capital Federal", 2.0));

		CorreoArgentino correo = new CorreoArgentino(Map.of("Capital Federal", 500.0));

		System.out.println(correo.calcularPrecio("Viedma", "Capital Federal", 0));
		System.out.println(correo.calcularPrecio("Viedma", "Bahia Blanca", 0));
	}

}
