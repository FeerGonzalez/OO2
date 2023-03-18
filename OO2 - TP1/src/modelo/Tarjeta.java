package modelo;

public class Tarjeta {
	protected String due�oTarjeta;
	protected int numeroTarjeta;
	protected int descuento;

	public Tarjeta(String due�o, int numTarjeta) {
		if(due�o == null || due�o.isEmpty()) {
			throw new RuntimeException("Faltan datos para registrar la tarjeta\n");
		}
		this.due�oTarjeta = due�o;
		this.numeroTarjeta = numTarjeta;
		this.descuento = 0;
	}

	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		return precioBebidas + precioPlatos;
	}
}
