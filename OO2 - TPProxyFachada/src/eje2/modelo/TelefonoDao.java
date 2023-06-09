package eje2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class TelefonoDao {

	private Connection obtenerConexion() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tpproxyfachada_oo2", "root", "");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public Set<Telefono> buscarPorIdPersona(int id) {

		Set<Telefono> telefonos = new HashSet<>();

		String sql = "select numero from telefono t where t.id_Persona = ?";
		try (Connection conn = obtenerConexion(); PreparedStatement statement = conn.prepareStatement(sql);) {
			statement.setInt(1, id);

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				telefonos.add(new Telefono(result.getString(1)));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return telefonos;
	}

}
