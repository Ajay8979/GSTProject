package com.ojas.gst.rest.resources;

import java.util.List;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;

import com.ojas.gst.entity.CustomerRegistration;
import com.ojas.gst.entity.CustomerTRN;
import com.ojas.gst.entity.StatusCode;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerRegistrationService;

@Path("/CustomerRegistration")
public class CustomerRegistrationResource {
	@Autowired
	private CustomerRegistrationService registrationService;

	@Autowired
	private JavaMailSender javaMailSender;

	// private CustomerRegistration c;

	@SuppressWarnings("null")
	@POST
	@Path("/createCustomerReg")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public StatusCode createCustomerRegistration(CustomerRegistration customer) {

		long min = 100000;
		long max = 999999;
		long random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
		long min1 = 100000;
		long max2 = 999999;
		long random2 = (int) (Math.floor(Math.random() * (max2 - min1 + 1)) + min1);
		String s11 = ("" + random);
		String s22 = ("" + random2);
		String trn=s11 + s22 + "TRN";
		CustomerTRN customerTRN = customer.getCustomerTRN();
		customerTRN.setTrnNo(trn);
//		customerTRN.setTrnNo(s11 + s22 + "TRN");
//		CustomerTRN custTrn = customerTRNService.addTRN(customerTRN);

		//custTrn.setTrnNo(s11 + s22 + "TRN");
		// ustomer.setStatus("Active");
		StatusCode statusCode = new StatusCode();
		if (null != customer) {
			customer.setStatus_cd("1");
			int otp = randomNumerber();
			statusCode.setStatus_cd(customer.getStatus_cd());

			int otp2 = customer.getOtp();
			otp2 = otp;
			customer.setOtp(otp2);
			@SuppressWarnings("unused")
			CustomerRegistration addCustome = registrationService.addCustome(customer);
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(customer.getEmail());
			message.setSubject("Received Your OTP ");
			message.setText("Secret opt is : " + customer.getOtp());
			javaMailSender.send(message);

		} else if (customer == null) {
			customer.setStatus_cd("0");

			statusCode.setStatus_cd(customer.getStatus_cd());
			@SuppressWarnings("unused")
			CustomerRegistration addCustome1 = registrationService.addCustome(customer);

		}
		return statusCode;
	}

	@Path("/getAllCustomerRegistration")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerRegistrationDetails() {

		List<CustomerRegistration> customerRegList = registrationService.getAllCustomerRegistrations();

		if (!CollectionUtils.isEmpty(customerRegList)) {
			return new Response(customerRegList, HttpStatus.OK, "customer registration is displayed");
		} else {
			return new Response("Unable to fetch CustomerRegistration details", HttpStatus.CONFLICT);
		}
	}

	@PUT
	@Path("/updateCustomerRegistration")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCutomerRegistration(CustomerRegistration custObject) {

		CustomerRegistration UpdatedCustReg = registrationService.updatecCustomerRegistration(custObject);

		if (UpdatedCustReg != null) {
			return new Response(UpdatedCustReg, HttpStatus.OK, "District Updated Successfuly");
		} else {
			return new Response("CustomerRegistration not updated", HttpStatus.CONFLICT);
		}
	}

	@POST
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String deletedeleteCustomerRegistrationById(@PathParam("id") Long id) {

		registrationService.deleteCustomerRegistrationById(id);

		return "record deleted sucessfully";
	}

	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getCustomerRegistrationBById(@PathParam("id") Long id) {

		CustomerRegistration cregistration = registrationService.getCustomerRegistrationById(id);

		if (null != cregistration) {
			return new Response(cregistration, HttpStatus.OK, "customer founded Successfully");
		} else {
			return new Response("customer not found", HttpStatus.CONFLICT);
		}
	}

	public int randomNumerber() {
		Random rnd = new Random();
		int n = 1000 + rnd.nextInt(10000 - 1000);
		return n;
	}

	@GET
	@Path("verifyOTP/{email}/{otp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String findCustomerRegistrationByEmail(@PathParam("email") String email, @PathParam("otp") int otp) {
		
		String c = registrationService.getCustomerRegistration1(email, otp);
		return c;



	}
}