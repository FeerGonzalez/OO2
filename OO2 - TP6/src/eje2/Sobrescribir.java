package eje2;

import java.io.File;
import java.io.IOException;

public class Sobrescribir implements Registro {
	private Registro registro;

	public Sobrescribir(Registro registro) {
		this.registro = registro;
	}

	@Override
	public void export(File file) {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {

		}
		this.registro.export(file);
	}
}
