package FormaNoAnemica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tiempo {
	private Date fecha;

	public Tiempo() {
		this.fecha = new Date();
	}

	public void imprimirFechaLarga() {
		SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' YYYY", Locale.getDefault());
		System.out.println(formatoLargo.format(fecha));
	}

	public void imprimirFechaCorta() {
		SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(formatoCorto.format(fecha));
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
