package gonzalez.framework;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ArchivoCargarDatos implements CargarAcciones {
	private String path;

	public ArchivoCargarDatos(String path) {
		Objects.requireNonNull(path);

		if (path.isEmpty() || path.isBlank()) {
			throw new RuntimeException("El nombre del archivo no puede estar vacio");
		}
		this.path = path;
	}

	@Override
	public HashMap<Integer, Accion> cargar() {
		if (esJson()) {
			return cargarConFormatoJson();
		}
		return cargarConFormatoNormal();
	}

	@Override
	public boolean esJson() {
		if (this.path.endsWith(".json")) {
			return true;
		}
		return false;
	}

	private HashMap<Integer, Accion> cargarConFormatoJson() {
		HashMap<Integer, Accion> lista = new HashMap<>();
		System.out.println("Entro");
		Gson gson = new GsonBuilder().create();

		int i = 0;
		try (FileReader reader = new FileReader(this.path)) {
			System.out.println("Entro2");
			lista.put(i, gson.fromJson(reader, Accion.class));
			i++;
		} catch (IOException | JsonSyntaxException | JsonIOException e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	private HashMap<Integer, Accion> cargarConFormatoNormal() {
		Properties properties = new Properties();

		HashMap<Integer, Accion> lista = new HashMap<>();

		try (InputStream config = getClass().getResourceAsStream(this.path);) {
			properties.load(config);

			String archivo = properties.getProperty("acciones");

			String[] clases = archivo.split("; ");

			int i = 0;

			for (String string : clases) {
				Accion nuevaAccion = (Accion) Class.forName(string).getDeclaredConstructor().newInstance();
				lista.put(i, nuevaAccion);
				i++;
			}

		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException
				| IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			System.out.println("Ocurrio un error inesperado " + e.getMessage());
		}

		return lista;
	}
}
