package eje4.infraestructure.ui;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import eje4.domain.portsin.DomainException;
import eje4.domain.portsin.ParticipanteRecord;
import eje4.domain.portsin.RegistroParticipante;
import eje4.domain.portsout.InfraestructureException;

public class AgregarParticipante extends JFrame {

	private RegistroParticipante registro;
	private JTextField nombre;
	private JTextField telefono;
	private JTextField region;
	private JTextField email;

	public AgregarParticipante(RegistroParticipante registro) throws SQLException {
		this.registro = registro;
		setupUIComponents();
	}

	private void setupUIComponents() {
		getContentPane().setLayout(null);
		setTitle("Add Participant");
		setSize(328, 118);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.nombre = new JTextField(10);
		this.telefono = new JTextField(10);
		this.region = new JTextField(10);
		this.nombre.setText("");
		this.telefono.setText("");
		this.region.setText("China");
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel label = new JLabel("Nombre: ");
		contentPane.add(label);
		contentPane.add(nombre);
		JLabel label_1 = new JLabel("Telefono: ");
		contentPane.add(label_1);
		contentPane.add(telefono);

		JLabel emailLabel = new JLabel("Email: ");
		contentPane.add(emailLabel);

		email = new JTextField();
		contentPane.add(email);
		email.setColumns(10);
		JLabel label_2 = new JLabel("Region: ");
		contentPane.add(label_2);
		contentPane.add(region);
		JButton botonCargar = new JButton("Cargar");
		botonCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onBotonCargar();
			}
		});
		contentPane.add(botonCargar);
		setContentPane(contentPane);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pack();
		setVisible(true);
	}

	private void onBotonCargar() {

		try {
			this.registro.registrar(
					new ParticipanteRecord(nombre.getText(), telefono.getText(), email.getText(), region.getText()));
			dispose();
		} catch (DomainException | InfraestructureException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
}
