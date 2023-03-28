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
		
		}catch (SQLException e) {

		}
	}
	
	
	//Idea para el objeto de mentira
	public void registrarInfo(String unString, String contactoParticipante, String nombreConcurso) throws IOException {
		try (Connection miConexion = DriverManager.getConnection(this.url, this.user, this.password);
				java.sql.PreparedStatement state = miConexion.prepareStatement(
						"INSERT INTO registro (registro) VALUES (?)")) {
			
			state.setString(1, unString);
			
			state.executeUpdate();
			
			int seCreo = state.executeUpdate();

			if (seCreo > 0) {
				new EnviarMail(contactoParticipante, "Inscripcion a " + nombreConcurso, "Pudo inscribirse al " + nombreConcurso + " Correctamente");
			}
		
		}catch (SQLException e) {
			
		}
	}
}
