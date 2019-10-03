package com.ojas.gst.serviceimpl;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.ojas.gst.dao.VerificationTokenDao;
import com.ojas.gst.entity.User;
import com.ojas.gst.entity.VerificationToken;
import com.ojas.gst.service.VerificationTokenService;



@Service
public class VerificationTokenServiceImpl implements VerificationTokenService {

	@Autowired
	private VerificationTokenDao verifyTokenDao;

	@Override
	public void createVerificationTokenForUser(User user, String token) {
		VerificationToken verifytoken = new VerificationToken(token, user);
		verifyTokenDao.save(verifytoken);
	}

	@Override
	public void deleteVerificationTokenForUser(String token) {
		VerificationToken verificationToken = verifyTokenDao.findByToken(token);
		verifyTokenDao.delete(verificationToken.getId());
	}

	@Override
	public String validateVerificationToken(String token) {

		final VerificationToken verifyToken = verifyTokenDao.findByToken(token);

		if (null == verifyToken) {
			return "invalidToken";
		}
		final Calendar cal = Calendar.getInstance();
		if ((verifyToken.getExpiry().getTime() - cal.getTime().getTime()) <= 0) {
			return "expired";
		}

		final User user = verifyToken.getUser();
		final Authentication auth = new UsernamePasswordAuthenticationToken(user, null,
				Arrays.asList(new SimpleGrantedAuthority("VERIFIED_PRIVILEGE")));
		SecurityContextHolder.getContext().setAuthentication(auth);
		return "enabled";
	}

	@Override
	public User findUserByVerificationToken(String token) {
		VerificationToken verificationToken = verifyTokenDao.findByToken(token);
		User user = verificationToken.getUser();
		return user;
	}

}

