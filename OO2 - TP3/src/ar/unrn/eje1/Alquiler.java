package ar.unrn.eje1;

public class Alquiler {
  private CopiaLibro copia;
  private int diasAlquilados;

  public Alquiler(CopiaLibro copia, int diasAlquilados) {
    this.copia = copia;
    this.diasAlquilados = diasAlquilados;
  }

//  public int diasAlquilados() { //Elimine los getters
//    return this.diasAlquilados;
//  }

//  public CopiaLibro copia() {
//    return this.copia;
//  }
  
  public double calcularCosto() {
	 return this.copia.calcularMonto(this.diasAlquilados);
  }
  
  public int calcularPuntos() {
	  return this.copia.calcularPuntos(diasAlquilados);
  }
  
}
