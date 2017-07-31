/**
 * 
 */
package com.refugioanimal.domain.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Administrator
 */
public class MailUtils {

	private static final String PASSWORD_GMAIL_REFUGIO = "refugioanimal1234";
	// Recipient's email ID needs to be mentioned.
	private static final String REFUGIO_ANIMAL_MAIL = "refigio.animal@gmail.com";
	// Assuming you are sending email from localhost
	private static final String LOCALHOST = "smtp.gmail.com";

	public static void sendEmail(String from, String subject, String message) throws MessagingException {

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", LOCALHOST);
		properties.setProperty("mail.smtp.starttls.enable", "true"); 
		properties.setProperty("mail.smtp.port", "587");
		properties.setProperty("mail.smtp.auth", "true");

		// Get the default Session object.
		Session session = Session.getInstance(properties,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(REFUGIO_ANIMAL_MAIL, PASSWORD_GMAIL_REFUGIO);
					}
		});

		try {
			// Create a default MimeMessage object.
			MimeMessage mimeMessage = new MimeMessage(session);

			// Set From: header field of the header.
			mimeMessage.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(REFUGIO_ANIMAL_MAIL));

			// Set Subject: header field
			mimeMessage.setSubject(subject);

			// Now set the actual message
			mimeMessage.setText(message);

			// Send message
			Transport.send(mimeMessage);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
			throw new MessagingException("Error al enviar el mail. Error: " + mex.getStackTrace());
		}
	}
}
