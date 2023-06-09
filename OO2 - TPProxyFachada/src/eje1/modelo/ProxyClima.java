package eje1.modelo;

import java.time.LocalDateTime;

public class ProxyClima implements Clima {
	private WeatherChannelService servicio;
	private String clima;
	private LocalDateTime tiempo;

	public ProxyClima(WeatherChannelService servicio) {
		this.servicio = servicio;
		this.tiempo = LocalDateTime.now();
	}

	@Override
	public String verClima() {
		if (clima != null && tiempo.isBefore(LocalDateTime.now().plusHours(1))) {
			return this.clima;
		}
		this.clima = servicio.verClima();

		return this.clima;
	}

}
