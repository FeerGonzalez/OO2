package FormaAnemica;

import java.util.Date;

public record TiempoRecord() {
	private static Date fecha;

	public Date getFecha() {
		return fecha;
	}
}
