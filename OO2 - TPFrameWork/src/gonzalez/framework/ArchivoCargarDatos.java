package gonzalez.framework;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public class ArchivoCargarDatos implements CargarAcciones {
	private Properties properties;
	private String path;

	public ArchivoCargarDatos(String path) {
		Objects.requireNonNull(path);

		if (path.isEmpty() || path.isBlank()) {
			throw new RuntimeException("El nombre del archivo no puede estar vacio");
		}
		this.properties = new Properties();
		this.path = path;
	}

	@Override
	public HashMap<Integer, Accion> cargar() {
		HashMap<Integer, Accion> lista = new HashMap<>();

		try (InputStream config = getClass().getResourceAsStream(this.path);) {

			properties.load(config);

			String archivo = properties.getProperty("acciones");

			String[] clases = archivo.split("; ");

			for (String string : clases) {
				Accion nuevaAccion = (Accion) Class.forName(string).getDeclaredConstructor().newInstance();

				lista.put(Integer.parseInt(nuevaAccion.descripcionItemMenu()), nuevaAccion);
			}

		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException
				| IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			System.out.println("Ocurrio un error inesperado " + e.getMessage());
		}

		return lista;
	}
}
