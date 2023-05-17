package main;

import java.util.List;

import eje1.ArchivoObserver;
import eje1.ConsolaObserver;
import eje1.Medidor;
import eje1.WeatherChannelService;

public class MainEje1 {

	public static void main(String[] args) {
		ArchivoObserver archivo = new ArchivoObserver("Clima");
		WeatherChannelService Weather = new WeatherChannelService("fad636e8abb86c32bebb29ff722c4771");
		Medidor medidor = new Medidor(Weather, List.of(archivo, new ConsolaObserver()));

		System.out.println(medidor.leerTemperatura());

	}
}
