package com.ojas.gst.rest.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ojas.gst.entity.CustomerOTPSystem;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Path("/otpgenerate")
public class CustomerOTPSystemResource {

	private final static String ACCOUNT_ID = "AC351d65e27c88b93b4fa1736fcfb13be5";
	private final static String AUTH_ID = "150c0ece56605df62f2155a89d56c5a3";
	private Map<String, CustomerOTPSystem> otp_data = new HashMap<>();

	static {
		Twilio.init(ACCOUNT_ID, AUTH_ID);
	}

	@Path("/mobileNumbers/{mobileNo}/otp")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> sendOTP(@PathVariable("mobileNo") String mobileNo) {
		CustomerOTPSystem cotp = new CustomerOTPSystem();
		cotp.setMobileNo(mobileNo);
		cotp.setOtp(String.valueOf(((int) (Math.random() * (10000 * 1000))) + 1000));
		cotp.setExpiryTime(System.currentTimeMillis() * 20000);
		otp_data.put(mobileNo, cotp);
		Message.creator(new PhoneNumber("+919975244168"), new PhoneNumber("+915034279638"),
				"new otp is" + cotp.getOtp()).create();
		return new ResponseEntity<>("OTP is send sucessfully", HttpStatus.OK);
	}

	/*
	 * @PUT
	 * 
	 * @Path("/{mobileNo}/otp")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public ResponseEntity<String>
	 * verifyOTP(@PathVariable("mobileNo") String mobileNo,
	 * 
	 * @RequestBody CustomerOTPSystem customerOTPSystem) { if
	 * (customerOTPSystem.getOtp() == null ||
	 * customerOTPSystem.getOtp().trim().length() <= 0) { return new
	 * ResponseEntity<>("Please provide OTP", HttpStatus.BAD_REQUEST); } if
	 * (otp_data.containsKey(mobileNo)) { CustomerOTPSystem cotp =
	 * otp_data.get(mobileNo); if (cotp != null) { if (cotp.getExpiryTime() ==
	 * System.currentTimeMillis()) { if
	 * (customerOTPSystem.getOtp().equals(customerOTPSystem.getOtp())) {
	 * otp_data.remove(mobileNo); return new
	 * ResponseEntity<>("OTP is verified sucessfully", HttpStatus.OK);
	 * 
	 * } return new ResponseEntity<>("invalid OTP", HttpStatus.BAD_REQUEST); }
	 * return new ResponseEntity<>("OTP is expired", HttpStatus.BAD_REQUEST); }
	 * return new ResponseEntity<>("something went wrong", HttpStatus.BAD_REQUEST);
	 * } return new ResponseEntity<>("mobile number not found",
	 * HttpStatus.NOT_FOUND); }
	 */
}
