
package com.ojas.gst.serviceimpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ojas.gst.dao.EmailDao;
import com.ojas.gst.entity.EmailUser;
import com.ojas.gst.entity.Response;
import com.ojas.gst.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	/*
	 * @Autowired private EmailDao emailDao;
	 */

	@Autowired
	public JavaMailSender emailSender;

	@Override
	public Response sendEmail(EmailUser mail) {

		Response response = new Response();
		try {
			SimpleMailMessage message = new SimpleMailMessage();

			message.setTo(mail.getTo());

			String text = mail.getText();

			int otp = randomNumerber();

			text = "Your OTP is:" + otp;
			//message.setSubject(mail.getSubject());
			message.setText(text);

			emailSender.send(message);

			response.setCode(0);
			response.setMessage("Email send ok!");
		} catch (Exception ex) {
			response.setCode(1);
			response.setMessage("Error sending email: " + ex.getMessage());
		}

		return response;
	}

	public int randomNumerber() {
		Random rnd = new Random();
		int n = 1000 + rnd.nextInt(10000 - 1000);
		return n;
	}

	/*
	 * @Override public EmailUser saveOTPDetails(EmailUser user) { Response r =
	 * sendEmail(user); // emailDao.save(user);
	 * 
	 * return emailDao.save(r); }
	 */

	
}
