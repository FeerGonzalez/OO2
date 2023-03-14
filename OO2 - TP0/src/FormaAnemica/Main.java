package FormaAnemica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		// Creacion y Asignacion
		Tiempo test = new Tiempo();
		Date dia = new Date();

		test.setFecha(dia);

		// Tiempo formato Largo
		SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' YYYY", Locale.getDefault());
		System.out.println(formatoLargo.format(test.getFecha()));

		// Tiempo formato Corto
		SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(formatoCorto.format(test.getFecha()));

		// Con Record - Creacion
		TiempoRecord test2 = new TiempoRecord(dia);

		// Formato Largo con Record
		System.out.println(formatoLargo.format(test2.fecha()));

		// Formato Corto con Record
		System.out.println(formatoCorto.format(test2.fecha()));
	}
}
