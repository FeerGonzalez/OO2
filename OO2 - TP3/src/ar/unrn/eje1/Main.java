package ar.unrn.eje1;

public class Main {
  public static void main(String args[]) {
	  
	  LibroRegular libroElTunel = new LibroRegular("El Tunel"); //1
	  LibroRegular libroAntesDelFin = new LibroRegular("Antes del Fin"); //1
	  
	  CopiaLibro copiaLibroElTunel = new CopiaLibro(libroElTunel); //1
	  CopiaLibro copiaLibroAntesDelFin = new CopiaLibro(libroAntesDelFin); //1
	  
//	  Alquiler alquilerElTunel = new Alquiler(copiaLibroElTunel, 5);
//	  Alquiler alquilerAntesDelFin = new Alquiler(copiaLibroAntesDelFin, 3);
	  
	  Cliente cliente1 = new Cliente("Javier"); //1
	  
	  cliente1.alquilar(copiaLibroElTunel, 5);
	  cliente1.alquilar(copiaLibroAntesDelFin, 3);
	  
	  Object[] resultado = cliente1.calcularDeudaYPuntosObtenidos();
	  
	  System.out.println(resultado[0]);
	  System.out.println(resultado[1]);
	  
	  /* Refactorizaciones
	   * 
	   *  1 = Cambio en el nombre de las variables para mas representacion
	   * 
	   * 
	   * 
	   */
  }
}