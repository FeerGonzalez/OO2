package modelo;

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

	public int calcularDescuento(int precioBebidas, int precioPlatos) {
		return precioBebidas + precioPlatos;
	}
}
