package gonzalez.main;

import gonzalez.framework.ArchivoCargarDatos;
import gonzalez.framework.FrameWork;

public class Main {

	public static void main(String[] args) {
//		FrameWork frame = new FrameWork(new ArchivoCargarDatos("/acciones.properties"));
		FrameWork frame = new FrameWork(
				new ArchivoCargarDatos("C:\\Users\\Familia\\git\\OO2\\OO2 - TPFrameWork\\resources\\acciones.json"));
		frame.start();
	}

}
