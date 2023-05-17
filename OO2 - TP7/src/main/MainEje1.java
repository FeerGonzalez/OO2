package main;

import eje1.Medidor;
import eje1.WeatherChannelService;

public class MainEje1 {

	public static void main(String[] args) {
		System.out
				.println(new Medidor(new WeatherChannelService("fad636e8abb86c32bebb29ff722c4771")).leerTemperatura());

	}

}
