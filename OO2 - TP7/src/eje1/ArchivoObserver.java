package eje1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class ArchivoObserver implements Observer {
	private File archivo;
	private FileWriter escritura;
	private PrintWriter linea;

	public ArchivoObserver(String nombreArchivo) {
		this.archivo = new File(nombreArchivo);
	}

	@Override
	public void actualizar(String valor) {
		try {
			if (!this.archivo.exists()) {
				this.archivo.createNewFile();
			}
			this.escritura = new FileWriter(archivo, true);
			this.linea = new PrintWriter(this.escritura);
			this.linea.println(valor + " " + LocalDate.now());
			this.escritura.close();
			this.linea.close();
		} catch (IOException e) {
		}

	}

}
