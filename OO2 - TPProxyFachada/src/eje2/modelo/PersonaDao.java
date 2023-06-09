package eje2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaDao {

	private Connection obtenerConexion() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tpproxyfachada_oo2", "root", "");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public Persona personaPorId(int id) {
		String sql = "select * from persona where id=?";
		try (Connection conn = obtenerConexion(); PreparedStatement statement = conn.prepareStatement(sql);) {
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			ProxyTelefono telefonos = new ProxyTelefono(id);
			String nombrePersona = null;
			while (result.next()) {
				nombrePersona = result.getString(2);
			}
			return new Persona(id, nombrePersona, telefonos);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
