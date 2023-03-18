package modelo;

public class Mastercard extends Tarjeta {

	public Mastercard(String dueño, int numTarjeta) {
		super(dueño, numTarjeta);
		this.descuento = 2;
	}
	
	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		int precio = (int) (precioPlatos - (precioPlatos * this.descuento/100));
		
		return precio + precioBebidas;
	}

}
