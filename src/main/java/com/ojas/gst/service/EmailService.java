
package com.ojas.gst.service;

import com.ojas.gst.entity.EmailUser;
import com.ojas.gst.entity.Response;

public interface EmailService {
	Response sendEmail(EmailUser mail);

	public int randomNumerber();
	
	/*
	 * public EmailUser saveOTPDetails(EmailUser user);
	 */
}
