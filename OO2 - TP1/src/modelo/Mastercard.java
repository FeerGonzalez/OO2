package modelo;

public class Mastercard extends Tarjeta {

	public Mastercard(String due�o, int numTarjeta) {
		super(due�o, numTarjeta);
		this.descuento = 2;
	}
	
	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		int precio = (int) (precioPlatos - (precioPlatos * this.descuento/100));
		
		return precio + precioBebidas;
	}

}
