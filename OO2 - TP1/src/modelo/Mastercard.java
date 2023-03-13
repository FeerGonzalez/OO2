package modelo;

import java.util.ArrayList;

public class Mastercard extends Tarjeta {

	public Mastercard(String dueño, int numTarjeta) {
		super(dueño, numTarjeta);
		this.descuento = 2;
	}

	public int calcularCosto(ArrayList<BebidaRecord> listaBebidas, ArrayList<PlatoRecord> listaPlatos) {
		int costoBebidas = 0, costoPlatos = 0;
		
		for (PlatoRecord platoRecord : listaPlatos) {
			costoPlatos = costoPlatos + platoRecord.precio();
		}
		for (BebidaRecord bebidaRecord : listaBebidas) {
			costoBebidas = costoBebidas + bebidaRecord.precio();
		}
		
		costoPlatos = (int) (costoPlatos - (costoPlatos * this.descuento/100));
		
		return sumarPropina(costoBebidas+costoPlatos);
	}

}
