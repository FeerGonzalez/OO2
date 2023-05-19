package main;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.List;

import eje4.domain.model.DefaultRegistroParticipante;
import eje4.infraestructure.data.JdbcRegistro;
import eje4.infraestructure.notification.MailNotificar;
import eje4.infraestructure.ui.AgregarParticipante;

public class MainEje4 {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante(new DefaultRegistroParticipante(
							new JdbcRegistro("jdbc:mysql://127.0.0.1/tp7_oo2", "root", ""),
							List.of(new MailNotificar("24fbb3b8d212c5", "eaea5d3863fc14"))));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}