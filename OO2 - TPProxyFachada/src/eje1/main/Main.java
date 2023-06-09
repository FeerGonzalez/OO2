package eje1.main;

import eje1.modelo.ProxyClima;
import eje1.modelo.WeatherChannelService;

public class Main {

	public static void main(String[] args) {
		ProxyClima proxy = new ProxyClima(new WeatherChannelService("fad636e8abb86c32bebb29ff722c4771"));
		System.out.println(proxy.verClima());
	}

}
