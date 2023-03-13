package modelo;

import java.util.ArrayList;

public class Tarjeta {
	protected String dueñoTarjeta;
	protected int numeroTarjeta;
	protected int descuento;

	public Tarjeta(String dueño, int numTarjeta) {
		if(dueño == null || dueño.isEmpty()) {
			throw new RuntimeException("Faltan datos para registrar la tarjeta\n");
		}
		this.dueñoTarjeta = dueño;
		this.numeroTarjeta = numTarjeta;
		this.descuento = 0;
	}
	
	public int calcularCosto(ArrayList<BebidaRecord> listaBebidas, ArrayList<PlatoRecord> listaPlatos) {
		int costoBebidas = 0, costoPlatos = 0;
		
		for (PlatoRecord platoRecord : listaPlatos) {
			costoPlatos = costoPlatos + platoRecord.precio();
		}
		for (BebidaRecord bebidaRecord : listaBebidas) {
			costoBebidas = costoBebidas + bebidaRecord.precio();
		}
		
		return sumarPropina(costoBebidas+costoPlatos);
	}
	
	public int sumarPropina(int unCosto) {
		if(unCosto < 1000) {
			return (int) (unCosto + (unCosto * 5/100));
		}else {
			if(unCosto < 2000) {
				return (int) (unCosto + (unCosto * 3/100));
			}else {
				return (int) (unCosto + (unCosto * 2/100));
			}
		}
	}
	
	//Getter y setter
	public String getDueñoTarjeta() {
		return dueñoTarjeta;
	}

	public void setDueñoTarjeta(String dueñoTarjeta) {
		this.dueñoTarjeta = dueñoTarjeta;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}
