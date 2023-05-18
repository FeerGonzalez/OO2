package main;

import java.awt.EventQueue;
import java.sql.SQLException;

import eje4.domain.model.DefaultRegistroParticipante;
import eje4.infraestructure.data.JdbcRegistro;
import eje4.infraestructure.ui.AgregarParticipante;

public class MainEje4 {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante(new DefaultRegistroParticipante(
							new JdbcRegistro("jdbc:mysql://127.0.0.1/participantes", "root", "")));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}