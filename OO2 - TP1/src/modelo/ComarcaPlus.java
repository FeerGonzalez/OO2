package modelo;

import java.util.ArrayList;

public class ComarcaPlus extends Tarjeta{

	public ComarcaPlus(String dueño, int numTarjeta) {
		super(dueño, numTarjeta);
		this.descuento = 2;
	}

	public int calcularCosto(ArrayList<BebidaRecord> listaBebidas, ArrayList<PlatoRecord> listaPlatos) {
		int costoFinal, costoBebidas = 0, costoPlatos = 0;
		
		for (PlatoRecord platoRecord : listaPlatos) {
			costoPlatos = costoPlatos + platoRecord.precio();
		}
		for (BebidaRecord bebidaRecord : listaBebidas) {
			costoBebidas = costoBebidas + bebidaRecord.precio();
		}
		
		costoFinal = costoPlatos + costoBebidas;
		costoFinal =(int) (costoFinal - (costoFinal * this.descuento/100));
		
		return sumarPropina(costoFinal);
	}

}
