package eje2;

import java.io.File;

public class NoSobrescribir implements Registro {
	private Registro registro;

	public NoSobrescribir(Registro registro) {
		this.registro = registro;
	}

	@Override
	public void export(File file) {
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		this.registro.export(file);
	}

}
