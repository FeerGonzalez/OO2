package modelo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InformacionEnBD implements GuardarInfo{

	private String url;
	private String user;
	private String password;
	
	public InformacionEnBD(String url, String user, String password) {
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
			
//			int seCreo = state.executeUpdate();

//			if (seCreo > 0) {
//				System.out.println("Se registro\n");
//			} else {
//				System.out.println("No se Registro\n");
//			}
		
		}catch (SQLException e) {
//			System.out.println(e.getMessage());
		}
	}
}
