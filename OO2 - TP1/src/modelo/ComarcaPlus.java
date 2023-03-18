package modelo;

public class ComarcaPlus extends Tarjeta{

	public ComarcaPlus(String dueño, int numTarjeta) {
		super(dueño, numTarjeta);
		this.descuento = 2;
	}

	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		int precio = precioBebidas + precioPlatos;
		
		precio = (int) (precio - (precio * this.descuento/100));
		
		return precio;
	}
}
