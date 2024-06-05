package com.otpdata;


import java.util.Properties;
import java.util.Random;

//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.mail.search.RecipientStringTerm;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class OTPGenerater {
	static int OTP ;
	
	public static int sendMain(String recepient) {
		System.out.println("mail initiated...");
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		String username = "azsxa652@gmail.com";
		String password = "xjuv ktyf tbgg qony";
		System.out.println("crossed step 1");
		
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		System.out.println("step 2");
		
		Message message = prepareMessage(session, username, recepient);
		try {
			Transport.send(message);
			System.out.println("mail sent");
			System.out.println("mail poi parra elai....");
		}
		catch(Exception e){
			System.out.println("error at send");
			e.printStackTrace();
		}
		
		return OTP;
	}
	
	private static Message prepareMessage(Session session, String username, String recepient) {
		System.out.println("strp 3");
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recepient));
			message.setSubject("Signing Into JRLearning");
			OTP = generateOTP();
			System.out.println("otp - "+OTP);
			message.setText("Hi Champ,\n\nYou Tried To Sign in for the JRLearning Platform\n________________________________________________________________________________\n\n\nYour OTP for sign up into JRLearning Platform is "+OTP+"\nEnjoy Learning\n\n\nThis is computer generated\nDon't Reply to this mail");
			
		}catch(Exception e) {
			System.out.println("error at preparemessage");
			e.printStackTrace();
		}
		
		return message;
	}

	private static int generateOTP() {
		Random r = new Random();
		return r.nextInt(9876-1234) + 1234;
	}
}

/*
*Subject: Signing Into JRLearning
*
*Hi Champ, 
*You Tried To Sign in for the JRLearning Platform
*________________________________________________________________________________
*Your OTP for sign up into JRLearning Platform is 
*Enjoy Learning
*
*/