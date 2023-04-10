package ar.unrn.eje1;

public class LibroNuevo extends Libro{

	public LibroNuevo(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularMonto(int diasAlquilado) {
		return diasAlquilado * 3;
	}

	@Override
	public int calcularPuntos(int diasAlquilado) {
		if(diasAlquilado > 1) {
			return 2;
		}
		return 1;
	}

}
