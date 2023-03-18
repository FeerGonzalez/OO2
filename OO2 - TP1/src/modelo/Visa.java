package modelo;

public class Visa extends Tarjeta {

	public Visa(String dueño, int numTarjeta) {
		super(dueño, numTarjeta);
		this.descuento = 3;
	}

	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		int precio = (int) (precioBebidas -(precioBebidas * this.descuento/100));
		
		return precio + precioPlatos;
	}
}
