package ar.unrn.eje1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlquilerTest {
	@Test
	public void calcularPago() {
//		 Libro libro = new Libro("Antes del Fin", Libro.REGULARES);
//		 CopiaLibro copiaLibro = new CopiaLibro(libro);
//		 
//		 Alquiler alquilerAntesDelFin = new Alquiler(copiaLibro, 3);
//		 
//		 Cliente cliente = new Cliente("Javier");
//		 
//		 cliente.alquilar(alquilerAntesDelFin);
//		 
//		 Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
		
		LibroRegular libro = new LibroRegular("Antes del Fin");
		CopiaLibro copiaLibro = new CopiaLibro(libro);
		Cliente cliente = new Cliente("Javier");
		
		cliente.alquilar(copiaLibro, 3);
		
		Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
		 
		assertEquals(3.5, resultado[0]);
		assertEquals(1, resultado[1]);
	}
	
}
