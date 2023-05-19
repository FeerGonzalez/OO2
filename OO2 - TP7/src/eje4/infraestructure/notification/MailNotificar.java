package eje4.infraestructure.notification;

import java.util.Properties;

import eje4.domain.portsout.Observer;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailNotificar implements Observer {
	private String username;
	private String password;

	public MailNotificar(String user, String password) {
		this.username = user;
		this.password = password;
	}

	@Override
	public void actualizar(String contacto, String motivo) {
		String from = "jakartafrom@example.com";

		String host = "smtp.mailtrap.io";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(contacto));
			message.setSubject("Actualizacion de inscripcion"); // Asunto del correo
			message.setText(motivo); // mensaje del correo
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

//	@Override
//	public void enviar(String destinatario, String asunto, String mensaje) {
//		String to = destinatario; // Para
//		
//		String from = "jakartafrom@example.com"; // De
//		
//		final String username = "24fbb3b8d212c5"; // autenticacion en mailtrap
//		final String password = "eaea5d3863fc14";
//		
//		String host = "smtp.mailtrap.io";
//		
//		Properties props = new Properties();
//	    props.put("mail.smtp.auth", "true");
//	    props.put("mail.smtp.starttls.enable", "true");
//	    props.put("mail.smtp.host", host);
//	    props.put("mail.smtp.port", "587");
//	    
//	    Session session = Session.getInstance(props,
//		         new jakarta.mail.Authenticator() {
//		            protected PasswordAuthentication getPasswordAuthentication() {
//		               return new PasswordAuthentication(username, password);
//		    }
//		         });
//		try {
//	    	  Message message = new MimeMessage(session);
//	    	  message.setFrom(new InternetAddress(from));
//	    	  message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
//	    	  message.setSubject(asunto); // Asunto del correo
//	    	  message.setText(mensaje); // mensaje del correo
//	    	  Transport.send(message);
//      }catch (MessagingException e) {
//	         throw new RuntimeException(e);
//      }
//		
//	}

}
