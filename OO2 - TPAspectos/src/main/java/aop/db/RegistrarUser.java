package aop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import aop.domain.Time;

@Component
public class RegistrarUser {
	private String jdbcUrl = "jdbc:mysql://localhost:3306/tpaspectos_oo2"; // Buscar la forma de inyectar dependencia
	private String username = "root";
	private String password = "";

	@Time
	public void registrar(List<String> nombres) {
		try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement statement = conn.prepareStatement("insert into usuario(nombre) values(?)",
						PreparedStatement.RETURN_GENERATED_KEYS)) {

			for (String nombre : nombres) {
				statement.setString(1, nombre);
				statement.executeUpdate();
			}

			System.out.println("Personas agregadas correctamente a la base de datos.");
		} catch (SQLException e) {
			System.err.println("Error al agregar personas a la base de datos: " + e.getMessage());
		}
	}
}
