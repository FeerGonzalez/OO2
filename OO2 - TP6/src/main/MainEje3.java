package main;

import eje3.Basico;
import eje3.Carne;
import eje3.Especial;
import eje3.Papa;
import eje3.Queso;
import eje3.Tomate;

public class MainEje3 {
	public static void main(String[] args) {
//		System.out.println("Detalle Carne:");
//		Carne carne = new Carne(50, new Papa(30, new Queso(20, new Tomate(20, null))));
//		carne.verDetalle();
//
//		System.out.println("\nDetalle Papa:");
//		Papa papa = new Papa(50, new Carne(30, new Queso(20, new Tomate(20, null))));
//		papa.verDetalle();

		System.out.println("Detalle del Combo Basico:");
		Basico comboBasico = new Basico(400, new Papa(60, new Carne(100, new Queso(20, null))));
		comboBasico.verDetalle();

		System.out.println("\nDetalle del Combo Especial:");
		Especial comboEspecial = new Especial(600, new Carne(120, new Papa(50, new Queso(30, new Tomate(20, null)))));
		comboEspecial.verDetalle();
	}
}
