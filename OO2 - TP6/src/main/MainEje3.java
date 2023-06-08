package main;

import eje3.Basico;
import eje3.Carne;
import eje3.Comida;
import eje3.Especial;
import eje3.Papa;
import eje3.Queso;
import eje3.Tomate;

public class MainEje3 {
	public static void main(String[] args) {
		Comida comboBasico = new Carne(50, new Papa(30, new Queso(20, new Tomate(20, new Basico(400)))));

		System.out.println(comboBasico.obtenerDescripcion());
		System.out.println(comboBasico.calcularPrecio());

		Comida comboEspecial = new Carne(120, new Papa(50, new Queso(30, new Tomate(20, new Especial(600)))));

		System.out.println(comboEspecial.obtenerDescripcion());
		System.out.println(comboEspecial.calcularPrecio());

	}
}
