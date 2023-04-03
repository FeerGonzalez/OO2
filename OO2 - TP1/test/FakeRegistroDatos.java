import java.io.IOException;

import modelo.RegistroDatos;

public class FakeRegistroDatos implements RegistroDatos{
	private String cadena;
	
	@Override
	public void registrarInfo(String unString) throws IOException {
		this.cadena = unString;
	}

	String devolverString() {
		return this.cadena;
	}
}
