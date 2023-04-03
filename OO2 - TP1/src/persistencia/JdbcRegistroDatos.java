package persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import modelo.RegistroDatos;

public class JdbcRegistroDatos implements RegistroDatos{

	private String url;
	private String user;
	private String password;
	
	public JdbcRegistroDatos(String url, String user, String password) {
		if(url == null || user == null || password == null) {
			throw new RuntimeException("Faltan datos, hay campos nulos");
		}
		
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	@Override
	public void registrarInfo(String unString) throws IOException {
		try (Connection miConexion = DriverManager.getConnection(this.url, this.user, this.password);
				java.sql.PreparedStatement state = miConexion.prepareStatement(
						"INSERT INTO registro (registro) VALUES (?)")) {
			
			state.setString(1, unString);
			
			state.executeUpdate();
		
		}catch (SQLException e) {

		}
	}
}
