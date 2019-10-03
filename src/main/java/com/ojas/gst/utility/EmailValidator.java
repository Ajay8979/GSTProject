package com.ojas.gst.utility;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import org.springframework.mail.SimpleMailMessage;

import com.ojas.gst.entity.User;



public class EmailValidator {

	private static Pattern pattern;

	private static Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static boolean validateEmail(final String email) {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	
	public static SimpleMailMessage constructEmail(String subject, String body, User user) {
		final SimpleMailMessage email = new SimpleMailMessage();
		email.setSubject(subject);
		email.setText(body);
		email.setTo(user.getEamilAddress());
		return email;
	}

}

