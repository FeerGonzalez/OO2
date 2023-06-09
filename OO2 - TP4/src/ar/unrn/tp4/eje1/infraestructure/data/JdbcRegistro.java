package ar.unrn.tp4.eje1.infraestructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import ar.unrn.tp4.eje1.domain.portsout.InfraestructureException;
import ar.unrn.tp4.eje1.domain.portsout.Registro;

public class JdbcRegistro implements Registro{
	private String url;
	private String user;
	private String password;
	
	public JdbcRegistro(String url, String user, String password) {
		Objects.requireNonNull(url);
		Objects.requireNonNull(user);
		Objects.requireNonNull(password);
		
		this.url = url;
		this.user = user;
		this.password = password;
	}

	@Override
	public void registrar(String nombre, String numeroTelefono, String region) throws InfraestructureException {
		try {
			Connection dbConn = DriverManager.getConnection(url, user, password);
		
			PreparedStatement st = 
					dbConn.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
			st.setString(1, nombre);
			st.setString(2, numeroTelefono);
			st.setString(3, region);
			st.executeUpdate();
			st.close();
		} catch(SQLException e) {
			throw new InfraestructureException("El participante no se pudo inscribir");
		}
	}

}
