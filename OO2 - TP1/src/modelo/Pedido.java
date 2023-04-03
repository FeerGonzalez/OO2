package modelo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
	private RegistroDatos guardarInfo;
	private ArrayList<Bebida> listaBebidas;
	private ArrayList<Plato> listaPlatos;
	
	public Pedido(RegistroDatos info) {
		if(info == null) {
			new RuntimeException("Hay campos nulos");
		}
		
		this.guardarInfo = info;
		this.listaBebidas = new ArrayList<>();
		this.listaPlatos = new ArrayList<>();
	}
	
	public Pedido(ArrayList<Bebida> listaBebidasCompradas, ArrayList<Plato> listaPlatosComprados) {
		this.guardarInfo = null;
		this.listaBebidas = listaBebidasCompradas;
		this.listaPlatos = listaPlatosComprados;
	}
	
	public Pedido(RegistroDatos info, ArrayList<Bebida> listaBebidasCompradas, ArrayList<Plato> listaPlatosComprados) {
		this.guardarInfo = info;
		this.listaBebidas = listaBebidasCompradas;
		this.listaPlatos = listaPlatosComprados;
	}
	
	public void agregarBebidaAlPedido(Bebida unaBebida) {
		this.listaBebidas.add(unaBebida);
	}
	
	public void agregarPlatoAlPedido(Plato unPlato) {
		this.listaPlatos.add(unPlato);
	}
	
	public int calcularCostoPedido(Tarjeta unaTarjeta) throws IOException {
		int costoPlatos = 0, costoBebidas = 0, costoFinal;
		
		for (Bebida bebida : listaBebidas) {
			costoBebidas = costoBebidas + bebida.getPrecio();
		}
		for (Plato plato : listaPlatos) {
			costoPlatos = costoPlatos + plato.getPrecio();
		}
		
		costoFinal = unaTarjeta.calcularDescuento(costoBebidas, costoPlatos);
		
		costoFinal = sumarPropina(costoFinal);
		
		String cadena = LocalDate.now().toString() + " || " + costoFinal;
		this.guardarInfo.registrarInfo(cadena);
		
		return costoFinal;
	}
	
	private int sumarPropina(int unCosto) {
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
}
