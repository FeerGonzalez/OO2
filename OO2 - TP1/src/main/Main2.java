package main;

import java.util.ArrayList;

import modelo.*;

public class Main2 {

	public static void main(String[] args) {
		//Creacion de bebidas
		BebidaRecord bebida1 = new BebidaRecord("Agua", 80);
		BebidaRecord bebida2 = new BebidaRecord("Coca Cola", 120);
		BebidaRecord bebida3 = new BebidaRecord("Fanta", 110);
		BebidaRecord bebida4 = new BebidaRecord("Sprite", 100);
		
		//Creacion de platos
		PlatoRecord plato1 = new PlatoRecord("Fideos con tuco", 320);
		PlatoRecord plato2 = new PlatoRecord("Asado", 700);
		PlatoRecord plato3 = new PlatoRecord("Milanesa con papas fritas", 560);
		PlatoRecord plato4 = new PlatoRecord("Pizza", 380);
		PlatoRecord plato5 = new PlatoRecord("Hamburguesa con papas fritas", 520);
		
		//Creacion de listas
		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		
		//Agregacion a las listas
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);
		listaBebidas.add(bebida3);
		listaBebidas.add(bebida4);
		
		listaPlatos.add(plato1);
		listaPlatos.add(plato2);
		listaPlatos.add(plato3);
		listaPlatos.add(plato4);
		listaPlatos.add(plato5);
		
		//Creacion de tarjetas
		Visa tarjetaVisa = new Visa("Mariano Flores", 0001);
		Mastercard tarjetaMastercard = new Mastercard("Maximiliano Zambrana", 0002);
		ComarcaPlus tarjetaComarca =  new ComarcaPlus("Fernando Gonzalez", 0003);
		Tarjeta tarjetaViedma = new Tarjeta("Carlos Farra", 0004);
		
		//Comprobacion
		System.out.println(tarjetaVisa.calcularCosto(listaBebidas, listaPlatos));
		System.out.println(tarjetaMastercard.calcularCosto(listaBebidas, listaPlatos));
		System.out.println(tarjetaComarca.calcularCosto(listaBebidas, listaPlatos));
		System.out.println(tarjetaViedma.calcularCosto(listaBebidas, listaPlatos));
		
	}

}
