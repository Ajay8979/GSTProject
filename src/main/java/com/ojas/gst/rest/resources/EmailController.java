
package com.ojas.gst.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.ojas.gst.entity.EmailUser;
import com.ojas.gst.entity.Response;
import com.ojas.gst.service.EmailService;

@Path("/email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@POST
	@Path("/sendMailSimple")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendMailSimple(@RequestBody EmailUser mail) {
		emailService.randomNumerber();
		return emailService.sendEmail(mail);

	}

	/*
	 * @POST
	 * 
	 * @Path("/saveEmail")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public com.ojas.gst.response.Response
	 * createEmail(EmailUser email) { EmailUser cplaceofbusiness =
	 * emailService.saveOTPDetails(email);
	 * 
	 * if (null != cplaceofbusiness) { return new
	 * com.ojas.gst.response.Response(cplaceofbusiness, HttpStatus.OK, "saved"); }
	 * else { return new com.ojas.gst.response.
	 * Response("Unable to create customer Business place Detials",
	 * HttpStatus.CONFLICT); }
	 * 
	 * }
	 */
	/*
	 * @POST
	 * 
	 * @Path("/saveOTP")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response saveOTP(@RequestBody
	 * EmailUser mail) { Response user=emailService.sendEmail(mail);
	 * 
	 * emailDao.save(mail)
	 * 
	 * }
	 */

}
