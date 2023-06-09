package eje3.main;

import eje3.modelo.DBDefault;

public class Main {

	public static void main(String[] args) {
		BDFacade bd = new DBDefault("jdbc:mysql://127.0.0.1/tpproxyfachada_oo2", "root", "");

//		String consulta = "SELECT p.nombre Nombre, t.numero Telefono FROM personas p LEFT JOIN telefonos T ON (p.id = t.idPersona) ORDER BY Nombre ASC, Telefono ASC";
//
//		Connection conn = null;
//		try {
//		    conn = DriverManager.getConnection("jdbc:sqlite:./src/main/resources/agenda_db");
//		} catch (SQLException e) {
//		    e.printStackTrace();
//		}
//
//		DBFacade database = new DBManagment(conn);
//
//		database.open();
//		var res1 = database.queryResultAsAsociation(consulta);
//		database.close();
//		Integer i = 0;
//		for (Map<String, String> fila : res1) {
//		    System.out.println("FILA " + i);
//		    var columnas = fila.keySet();
//		    columnas.stream().forEach(x -> System.out.println(" ".repeat(3) + x + " -> " + fila.get(x)));
//		    i++;
//		}
//
//		System.out.println("\n************************************************\n");
//
//		database.open();
//		var res2 = database.queryResultAsArray(consulta);
//		database.close();
//
//		System.out.println("Tabla con Array - FILAS: " + res2.size());
//		for (String[] fila : res2) {
//		    for (int j = 1; j < fila.length; j++) {
//			System.out.print(fila[j] + " ".repeat(2));
//		    }
//		    System.out.println();
//		}
	}

}
