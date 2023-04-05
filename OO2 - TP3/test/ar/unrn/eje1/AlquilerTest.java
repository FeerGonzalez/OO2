package ar.unrn.eje1;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class AlquilerTest {
	@Test
	public void calcularPago() {
		 Libro libro = new Libro("Antes del Fin", Libro.REGULARES);
		 CopiaLibro copiaLibro = new CopiaLibro(libro);
		 
		 Alquiler alquilerAntesDelFin = new Alquiler(copiaLibro, 3);
		 
		 Cliente cliente = new Cliente("Javier");
		 
		 cliente.alquilar(alquilerAntesDelFin);
		 
		 Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
	}
	
}
