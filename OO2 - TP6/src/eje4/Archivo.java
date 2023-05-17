package eje4;

import java.io.File;

public class Archivo {
	private File archivo;
	private Registrar registro;

	public Archivo(String archivo, Registrar registro) {
		this.archivo = new File(archivo);
		this.registro = registro;
	}

}
