package eje2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Report implements Registro {
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
//		if (file.exists()) {
//			throw new IllegalArgumentException("El archivo ya existe...");
//		}

		try {
			FileWriter escritura;
			escritura = new FileWriter(file, true);
			PrintWriter linea = new PrintWriter(escritura);
			linea.println(this.reporte);
			escritura.close();
			linea.close();
			throw new IllegalArgumentException("Se registro el reporte...");
		} catch (IOException e) {

		}

	}
}
