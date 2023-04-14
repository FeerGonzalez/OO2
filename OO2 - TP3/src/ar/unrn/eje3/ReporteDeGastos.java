package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//enum TipoDeGasto {
//  CENA, DESAYUNO, ALQUILER_AUTO
//}

//class Gasto {
//  TipoDeGasto tipoGasto;
//  int monto;
//}

public class ReporteDeGastos {
//	private int total;
	private LocalDate fecha;
	private List<Gasto> gastos;
	
	public ReporteDeGastos(LocalDate fecha, List<Gasto> listaGastos) {
		if(fecha == null || listaGastos == null) {
			throw new RuntimeException("Hay valores nulos");
		}
		
//		this.total = 0;
		this.fecha = fecha;
		this.gastos = listaGastos;
	}
	
	public String imprimir() {
		int total = 0;
		int gastosDeComida = 0;
		String cadena = "Expenses " + this.fecha;
//    System.out.println("Expenses " + LocalDate.now());
		
		for (Gasto gasto : gastos) {
			
			gastosDeComida += gasto.devolverMontoSiEsComida();
			
			String marcaExcesoComida = " ";
			
			marcaExcesoComida = gasto.esExcesoDeGasto() ? "X" : " ";
			
			cadena += System.lineSeparator() + gasto.nombre + "\t" + gasto.costo + "\t" + marcaExcesoComida;
			
			total += gasto.costo;
		}
		
		cadena += System.lineSeparator() + "Gasto de la comida \t" + gastosDeComida + System.lineSeparator() + "Gasto total \t" + total;
		
		
		System.out.println(cadena);
		return cadena;
		
		
    
//    for (Gasto gasto : gastos) {
//      if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
//        gastosDeComida += gasto.monto;
//      }
//
//      String nombreGasto = "";
//      switch (gasto.tipoGasto) {
//      case CENA:
//        nombreGasto = "Cena";
//        break;
//      case DESAYUNO:
//        nombreGasto = "Desayuno";
//        break;
//      case ALQUILER_AUTO:
//        nombreGasto = "Alquiler de Autos";
//        break;
//      }

//      String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
//          || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

//      System.out.println(nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas);

//      total += gasto.monto;
//    }

//    System.out.println("Gastos de comida: " + gastosDeComida);
//    System.out.println("Total de gastos: " + total);
  }
}
