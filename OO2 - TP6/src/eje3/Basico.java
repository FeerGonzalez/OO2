package eje3;

public class Basico implements Comida {
	private double precio;
//	private List<Comida> porcionesAgregadas;

	public Basico(double precio, Comida comida) {
		this.precio = precio;
		this.porcionesAgregadas = comida;
//		this.porcionesAgregadas = new ArrayList<>();
	}

//	public void agregarPorcion(Comida comida) {
//		this.porcionesAgregadas.add(comida);
//	}

	@Override
	public void verDetalle() {
		System.out.println("Este es un Combo Basico: $" + this.precio);
		if (this.porcionesAgregadas != null) {
			this.porcionesAgregadas.verDetalle();
		}
		System.out.println("Precio final del combo: $" + this.calcularMontoFinal());

	}

	private double calcularMontoFinal() {
		double costo = 0;
		if (this.porcionesAgregadas != null) {
			costo = this.porcionesAgregadas.calcularCosto();
		}
		return this.precio + costo;
	}

	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public double calcularMontoFinal() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
