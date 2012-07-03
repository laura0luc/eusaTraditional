package com.eusa.service;

import com.eusa.dao.ServicioDao;
import com.eusa.domain.Equipo;
import com.eusa.domain.Servicio;

import java.util.Calendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class UnidadNotificationService {
	

	final String MAIL_TO = "laura_luc@hotmail.com";
	//final String MAIL_TO = "eusconstrucciones@gmail.com";
	final String MAIL_FROM="laura0luc@gmail.com";
	final String password="";



	public void validaDia(Servicio serv){
		Calendar c= Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Hoy es: "+dia);
		if(dia==1){
			String maq=obtenerEquipo(serv);
			enviaCorreo(serv,maq.toString());
		}else{
			System.out.println("Hoy no se enviaran correos para maquinaria");
		}
	}

	public String obtenerEquipo(Servicio serv){
		//Equipo equipo=Equipo.findById(serv.getId());		
		return "weeee";

	}
	public void enviaCorreo(Servicio serv, String eq){
		System.out.println("Nombre "+serv.getNombre());
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(MAIL_FROM,"0/Lucrecia");
					}
				});
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(MAIL_FROM));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(MAIL_TO));
			message.setSubject("Recordatorio Registro de horas trabajadas");
			message.setText("Estimado," +
					"\n\n Favor de capturar el numero de horas laboradas para el equipo: \n\n"+eq+"!"+
					"\n\n Ingresa a la liga para capturarla \n\n eusa.notification.mx:8080/captura/"+serv.getId()+"");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
