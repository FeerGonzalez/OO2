package ar.unrn.tp4.eje1;

import java.awt.EventQueue;
import java.sql.SQLException;

import ar.unrn.tp4.eje1.domain.model.DefaultRegistroParticipante;
import ar.unrn.tp4.eje1.infraestructure.data.JdbcRegistro;
import ar.unrn.tp4.eje1.infraestructure.ui.AgregarParticipante;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante(new DefaultRegistroParticipante(new JdbcRegistro("jdbc:mysql://127.0.0.1/participantes", "root", "")));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}