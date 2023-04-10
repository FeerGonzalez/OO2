package ar.unrn.eje1;

public abstract class Libro {
	
//  public static final int INFANTILES = 2;   Realizo herencia para los distintos tipos
//  public static final int REGULARES = 0;
//  public static final int NUEVO_LANZAMIENTO = 1;
	protected String nombre;
//	private int codigoPrecio;  Al hacer herencia ya no necesito el codigoPrecio
	
	public Libro(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("Faltan datos");
		}
		
		this.nombre = nombre;
	}
	
//	public Libro(String nombre, int priceCode) {
//		this.nombre = nombre;
//		this.codigoPrecio = priceCode;
//	}

	public abstract double calcularMonto(int diasAlquilado);
	
	public int calcularPuntos(int diasAlquilado) {
		return 1;
	}
  
//  public int codigoPrecio() { Quito los gettersw
//	  return codigoPrecio;
//  }

//  public String nombre() {
//	  return nombre;
//  }
}