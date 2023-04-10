package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres;
  	private String name;

  	public Cliente(String nombre) {
	  	if(nombre == null || nombre.isEmpty()) {
	  		throw new RuntimeException("Faltan datos");
		}
	  
	  	this.name = nombre;
	  	this.alquileres = new ArrayList<Alquiler>(); //Inicializo el array en el constructor
  	}

//  public Object[] calcularDeudaYPuntosObtenidos() {
//	  Object[] resultado = new Object[2];
//	  double total = 0;
//	  int puntosAlquilerFrecuente = 0;
//	  for (Alquiler alquiler : alquileres) {
//		  double monto = 0;
////		  determine amounts for each line
//		  switch (alquiler.copia().libro().codigoPrecio()) {
//		    	case Libro.REGULARES:
//		    		monto += 2;
//		    		if (alquiler.diasAlquilados() > 2)
//		    			monto += (alquiler.diasAlquilados() - 2) * 1.5;  //Sacar los numeros magicos
//		    		break;
//		    	case Libro.NUEVO_LANZAMIENTO:
//		    		monto += alquiler.diasAlquilados() * 3;
//		    		break;
//		    	case Libro.INFANTILES:
//		    		monto += 1.5;
//		    		if (alquiler.diasAlquilados() > 3)
//		    			monto += (alquiler.diasAlquilados() - 3) * 1.5;
//		    		break;
//	    	}
//	      total += monto;
//	      // sumo puntos por alquiler
//	      puntosAlquilerFrecuente++;
//	      // bonus por dos días de alquiler de un nuevo lanzamiento
//	      if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO) //Sacar la mayoria de . , que quede 1 nomas
//	          && alquiler.diasAlquilados() > 1) {
//	        puntosAlquilerFrecuente++;
//	      }
//    }
//    resultado[0] = total;
//    resultado[1] = puntosAlquilerFrecuente;
//    return resultado;
//  }
  
  	public Object[] calcularDeudaYPuntosObtenidos() { //Re-hice el metodo para sacar el switch y facilitar la lectura del for
	  	Object[] resultado = new Object[2];
	  	double totalAPagar = 0;
	  	int puntosAlquiler = 0;
	  
	  	for (Alquiler alquiler : alquileres) {
			totalAPagar += alquiler.calcularCosto();
			puntosAlquiler += alquiler.calcularPuntos();
	  	}
	  
	  	resultado[0] = totalAPagar;
	  	resultado[1] = puntosAlquiler;
	  
	  	return resultado;
  	}

  	public void alquilar(CopiaLibro libroRentado, int diasAlquilado) { // Ya no se ingresa un alquiler sino que se ingresa la copia del libro
	  	Alquiler nuevoAlquiler = new Alquiler(libroRentado, diasAlquilado); // y los dias que se alquila
	  	this.alquileres.add(nuevoAlquiler);
  	}
  
//  public void alquilar(Alquiler rental) {
//	  alquileres.add(rental);
//  }
}