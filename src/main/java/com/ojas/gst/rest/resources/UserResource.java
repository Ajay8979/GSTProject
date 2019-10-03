package com.ojas.gst.rest.resources;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ojas.gst.dto.EmailDTO;
import com.ojas.gst.dto.ResetPasswordDTO;
import com.ojas.gst.dto.SignInRequestDTO;
import com.ojas.gst.dto.UserGSPRegistrationDTO;
import com.ojas.gst.entity.AccessToken;
import com.ojas.gst.entity.User;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.UserService;
import com.ojas.gst.service.VerificationTokenService;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */

@Component
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Path("/user")
public class UserResource {
	@Autowired
	private UserService userService;

	@Autowired
	@Qualifier("authenticationManager")
	private AuthenticationManager authManager;

	@Autowired
	private VerificationTokenService verifyTokenService;

	@Path("/userGSPRegistration")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response gspUserRegistration(UserGSPRegistrationDTO dto, @Context HttpServletRequest request) {
		dto.setRole("User");
		dto.setStatus("InActive");
		return userService.createUser(dto, request);
	}
	
	@Path("/gspSignIn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response gspSignIn(SignInRequestDTO signInRequest) {
		return userService.gspSignIn(signInRequest.getUserName(), signInRequest.getPassword());
	}

	@Path("/getUser/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") Long id) {
		return userService.findByPrimaryKey(id);
	}
	
	@Path("/resetPassword")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response resetPassword(ResetPasswordDTO resetPasswordDto) {
		return userService.resetPassword(resetPasswordDto.getCurrentPassword(), resetPasswordDto.getNewPassword());
	}

	@Path("/logout/{id}/{token}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response logout(@PathParam("id") Long userId, @PathParam("token") String accessToken) {
		Response response = new Response();
		AccessToken token = userService.findAccessTokenByUserId(userId, accessToken);
		if (null != token) {
			Date date = Calendar.getInstance().getTime();
			token.setExpiry(date);
			userService.updateAccessToken(token);
		}
		response.setResponseMessage("Logout Successful");
		response.setStatusCode(HttpStatus.OK.value());
		return response;
	}

	@GET
	@Path("/verifyAccount")
	public void showLoginPage(@QueryParam("token") String token, @Context HttpServletRequest request,
			@Context HttpServletResponse servletResponse) throws IOException {

		String result = verifyTokenService.validateVerificationToken(token);
		if (null != result && !result.isEmpty() && result.equals("enabled")) {
			User user = verifyTokenService.findUserByVerificationToken(token);
			if (user != null) {
				user.setStatus("Active");
				userService.updateUser(user);
			}
			verifyTokenService.deleteVerificationTokenForUser(token);
			servletResponse.sendRedirect(getAppUrl(request) + "/rest/user/accountActivationStatus");
		}
	}

	@GET
	@Path("/accountActivationStatus")
	public javax.ws.rs.core.Response accountActivationStatus() {

		String msg = "Your Account is Activated. Go to Login Page to sign in. ";
		return javax.ws.rs.core.Response.status(200).entity(msg).type(MediaType.TEXT_HTML_TYPE).build();

	}

	private String getAppUrl(HttpServletRequest request) {
		return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	}

	@Path("/forgotPassword")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response forgotPassword(EmailDTO emailDto ,@Context HttpServletRequest request) {
		return userService.forgotPassword(emailDto.getEmailId(),request);
	}
	/*
	 * @SuppressWarnings("static-access")
	 * 
	 * @GET
	 * 
	 * @Path("/forgotPasswordVerificaton/{email}") public javax.ws.rs.core.Response
	 * changePassword(@PathParam("email") String email) throws URISyntaxException {
	 * java.net.URI location = new java.net.URI("../index.jsp");
	 * javax.ws.rs.core.Response response = null;
	 * response.temporaryRedirect(location).build();
	 * response.ok("Verifictaion email is"+email).build(); return response;
	 * 
	 * }
	 * 
	 * @GET
	 * 
	 * @Path("/createNewPassword/{newPassword}/{email}") public Response
	 * createNewPassword(@PathParam("newPassword") String
	 * newPassword,@PathParam("email") String email) throws URISyntaxException {
	 * return userService.createNewPassword(newPassword, email); }
	 */

}
