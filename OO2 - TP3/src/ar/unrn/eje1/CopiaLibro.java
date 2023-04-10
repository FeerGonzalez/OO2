package ar.unrn.eje1;

public class CopiaLibro {
	private Libro libro;
	
	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}
	
//	public Libro libro() { Quito el getter
//		return libro;
//	}
	
	public double calcularMonto(int diasAlquilado) {
		return this.libro.calcularMonto(diasAlquilado);
	}
	
	public int calcularPuntos(int diasAlquilado) {
		return this.libro.calcularPuntos(diasAlquilado);
	}
}