package ar.unrn.eje1;

public class LibroInfantil extends Libro{

	public LibroInfantil(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularMonto(int diasAlquilado) {
		double monto = 1.5;
		if(diasAlquilado > 3) {
			monto += (diasAlquilado - 3) * 1.5;
		}
		return monto;
	}
	
}
