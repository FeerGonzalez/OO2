package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import modelo.RegistroDatos;

public class EnDiscoRegistroDatos implements RegistroDatos{
	private File archivo;
	private FileWriter escritura;
	private PrintWriter linea;
	
	public EnDiscoRegistroDatos(String nombreArchivo) throws IOException {
		this.archivo = new File(nombreArchivo);
	}
	
	public void registrarInfo(String unString) {
		if(this.archivo.exists()) {
				try {
					this.escritura = new FileWriter(archivo, true);
					this.linea = new PrintWriter(this.escritura);
					this.linea.println(unString);
					this.escritura.close();
					this.linea.close();
				} catch (IOException e) {
				}
		}else {
			try {
				this.archivo.createNewFile();
				this.escritura = new FileWriter(archivo, true);
				this.linea = new PrintWriter(this.escritura);
				this.linea.println(unString);
				this.escritura.close();
				this.linea.close();
			} catch (IOException e) {
			}
		}
	}
}
