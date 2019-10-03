package com.ojas.gst.serviceimpl;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.gst.dao.AccessTokenDao;
import com.ojas.gst.dao.UserDao;
import com.ojas.gst.dto.UserGSPRegistrationDTO;
import com.ojas.gst.dto.UserStatusChangeDTO;
import com.ojas.gst.entity.AccessToken;
import com.ojas.gst.entity.User;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.UserService;
import com.ojas.gst.service.VerificationTokenService;
import com.ojas.gst.utility.EmailValidator;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class DaoUserService implements UserService {
	private UserDao userDao;
	private AccessTokenDao accessTokenDao;

	@Autowired
	private VerificationTokenService verifyTokenService;

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private MessageSource messages;

	private static final String INACTIVESTATUS = "Inactive";
	private static final String ACTIVESTATUS = "Active";

	protected DaoUserService() {
		/* Reflection instantiation */
	}

	public DaoUserService(UserDao userDao, AccessTokenDao accessTokenDao) {
		this.userDao = userDao;
		this.accessTokenDao = accessTokenDao;
	}

	@Override
	@Transactional
	public User findUserByAccessToken(String accessTokenString) {
		AccessToken accessToken = this.accessTokenDao.findByToken(accessTokenString);

		if (null == accessToken) {
			return null;
		}

		if (accessToken.isExpired()) {
			this.accessTokenDao.delete(accessToken);
			return null;
		}

		return accessToken.getUser();
	}

	@Override
	@Transactional
	public AccessToken createAccessToken(User user) {
		AccessToken accessToken = new AccessToken(user, UUID.randomUUID().toString());
		return this.accessTokenDao.save(accessToken);
	}

	@Override
	public Response createUser(UserGSPRegistrationDTO dto, HttpServletRequest request) {
		Response response = new Response();
		User user = new User();
		User saveUser = null;
		user.setClientName(dto.getClientName());
		user.setType(dto.getType());
		user.setAddress(dto.getAddress());
		user.setState(dto.getState());
		user.setCity(dto.getCity());
		user.setPinCode(dto.getPinCode());
		user.setPanNumber(dto.getPanNumber());
		user.setRelationShip(dto.getRelationShip());
		user.setServicesRequired(dto.getServicesRequired());
		user.setEamilAddress(dto.getEamilAddress());
		user.setMobileNumber(dto.getMobileNumber());
		user.setUsername(dto.getClientName());
		user.setPassword(dto.getClientName() + dto.getMobileNumber());
		user.setStatus(dto.getStatus());
		user.setRole(dto.getRole());
		try {
			if (user != null) {
				boolean isPanDuplicated = verifyDuplicationOfPanNumber(user.getPanNumber());
				if (!isPanDuplicated) {
					saveUser = userDao.save(user);
					if (saveUser != null) {
						verifyUser(saveUser.getId(), request);
						response.setStatusCode(HttpStatus.OK.value());
						response.setResponseMessage("Registration Successful. Credentials sent to Mail.");
					}
				} else {
					response.setStatusCode(HttpStatus.IM_USED.value());
					response.setResponseMessage("User already registered with above provided PAN number.");
				}
			}

		} catch (DataIntegrityViolationException e) {
			response.setStatusCode(HttpStatus.IM_USED.value());
			response.setResponseMessage("User Registration Failed. Please Enter the Unique Email,and Mobile Number.");
			e.printStackTrace();
		} catch (Exception e) {
			response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setResponseMessage("User Registration failed due to internal server error.");
			e.printStackTrace();
		}

		return response;
	}

	@Override
	public Response findByPrimaryKey(Long id) {
		Response response = new Response();
		User user = userDao.find(id);
		if (null == user) {
			response.setResponseMessage("User Not Found with given ID : " + id);
			response.setStatusCode(HttpStatus.NOT_FOUND.value());
		} else {
			response.setResponseMessage("User Found");
			response.setResponseData(user);
			response.setStatusCode(HttpStatus.OK.value());
		}

		return response;
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User saveProfile(User user) {

		return userDao.save(user);
	}

	@Override
	public User loadUserByName(String username) {
		Response response = userDao.loadUserByUsername(username);
		if (response.getStatusCode().equals(HttpStatus.NOT_FOUND.value())) {
			return null;
		} else {
			return (User) response.getResponseData();
		}
	}

	@Override
	public User changePwd(User user) {
		return userDao.save(user);
	}

	@Override
	public User saveNewPassword(Long id, String newPassword) {
		User userObj = userDao.find(id);
		if (null != userObj) {
			userObj = userDao.save(userObj);
			return userObj;
		}
		return userObj;
	}

	@Override
	public AccessToken findAccessTokenByUserId(Long id, String token) {
		return userDao.findAccessTokenByUserId(id, token);
	}

	@Override
	public AccessToken updateAccessToken(AccessToken token) {
		return accessTokenDao.save(token);
	}

	@Override
	public Response findAllAdmins() {
		return userDao.findAllAdmins();
	}

	// Verification Token Sending to Mail
	public Response verifyUser(Long userId, HttpServletRequest request) {
		Response response = new Response();
		final User user = userDao.find(userId);
		String token = null;
		if (null != user) {
			token = UUID.randomUUID().toString();
			verifyTokenService.createVerificationTokenForUser(user, token);

			javaMailSender
					.send(constructResendVerificationTokenEmail(getAppUrl(request), request.getLocale(), token, user));
			response.setResponseMessage(messages.getMessage("message.regSucc", null, request.getLocale()));
		}
		return response;
	}

	private SimpleMailMessage constructResendVerificationTokenEmail(String contextPath, Locale locale, String token,
			User user) {
		String url = contextPath + "/rest/user/verifyAccount?token=" + token;
		String regMsg = messages.getMessage("message.regMsg", null, locale);
		String userName = messages.getMessage("message.yourUserName", null, locale);
		String Password = messages.getMessage("message.yourPassword", null, locale);
		String msgLink = messages.getMessage("message.verifyLink", null, locale);
		return EmailValidator.constructEmail(
				"Verification from OJAS GSP Portal", "Hi User" + "\n\n" + regMsg + "\r\n" + msgLink + "\r\n" + url
						+ "\r\n" + userName + ": " + user.getUsername() + "\r\n" + Password + ": " + user.getPassword(),
				user);
	}

	private String getAppUrl(HttpServletRequest request) {
		return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	}

	public Response changeActiveStatus(UserStatusChangeDTO dto) {
		User user = userDao.find(dto.getId());
		Response response = new Response();
		if (null == user) {
			response.setResponseMessage("User Not Found with id = " + dto.getId());
			response.setStatusCode(HttpStatus.NOT_FOUND.value());
		} else {
			if (dto.getStatus().equalsIgnoreCase(ACTIVESTATUS) || dto.getStatus().equalsIgnoreCase(INACTIVESTATUS)) {
				if (dto.getStatus().equalsIgnoreCase(ACTIVESTATUS)) {
					user.setStatus(ACTIVESTATUS);
				}
				if (dto.getStatus().equalsIgnoreCase(INACTIVESTATUS)) {
					user.setStatus(INACTIVESTATUS);
				}

				User updatedUserData = userDao.save(user);
				response.setResponseMessage("Status Updated");
				response.setStatusCode(HttpStatus.OK.value());
				response.setResponseData(updatedUserData);

			} else {
				response.setResponseMessage("The value " + dto.getStatus() + " of the field 'status' is not a valid.");
				response.setStatusCode(HttpStatus.BAD_REQUEST.value());
			}
		}
		return response;
	}

	@Override
	public Response forgotPassword(String email, HttpServletRequest request) {
		Response response = new Response();
		final User user = loadUserByName(email);
		if (null != user) {
			javaMailSender
					.send(constructForgotPasswordVerificationEmail(getAppUrl(request), request.getLocale(), user));
			response.setResponseMessage(messages.getMessage("message.forGotPwdSucc", null, request.getLocale()));
			response.setStatusCode(HttpStatus.OK.value());
		} else {
			response.setStatusCode(HttpStatus.IM_USED.value());
			response.setResponseMessage(messages.getMessage("message.forGotPwdErr", null, request.getLocale()));
		}
		return response;
	}

	@Override
	public Response findAllUsers(Integer pageNumber, Integer pageSize) {
		return userDao.findAllUserByPages(pageNumber, pageSize);
	}

	public boolean verifyDuplicationOfPanNumber(String panNumber) {
		boolean isDuplicateExist = false;
		List<User> usersList = userDao.findAllUsers();
		if (usersList != null) {
			for (User user : usersList) {
				if (panNumber.equals(user.getPanNumber())) {
					isDuplicateExist = true;
				}
			}
		}
		return isDuplicateExist;

	}

	@Override
	public Response gspSignIn(String userName, String Password) {
		Response response = new Response();
		List<User> usersList = userDao.findAllUsers();
		AccessToken accessToken;
		String token = null;
		try {
			if (usersList != null) {
				for (User user : usersList) {
					if (user.getUsername() != null && user.getPassword() != null && user.getStatus() != null) {
						if (userName.equals(user.getUsername()) && Password.equals(user.getPassword())
								&& user.getStatus().equals("Active")) {
							token = UUID.randomUUID().toString();
							accessToken = new AccessToken(user, token);
							response.setResponseData(accessToken);
							response.setStatusCode(HttpStatus.OK.value());
							response.setMessage("Valid User");
						}
					}

				}
			}
		} catch (Exception e) {
			response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setResponseMessage("Login Credentials are Incorrect.");
			e.printStackTrace();
		}

		return response;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response resetPassword(String currentPassword, String newPassword) {
		User user = userDao.findUserByPassword(currentPassword);
		Response response = new Response();
		if (null == user) {
			response.setResponseMessage("User Not Found with Entered Password = " + currentPassword);
			response.setStatusCode(HttpStatus.NOT_FOUND.value());
		} else {
			int passwordUpdated = userDao.updatePassword(currentPassword, newPassword, user);
			if (passwordUpdated != 0) {
				response.setResponseMessage("Password updated successfully");
				response.setStatusCode(HttpStatus.OK.value());
			}
		}
		return response;
	}

	private SimpleMailMessage constructForgotPasswordVerificationEmail(String contextPath, Locale locale, User user) {
		String regMsg = messages.getMessage("message.forgotPasswordMsg", null, locale);
		return EmailValidator.constructEmail("Message from OJAS GSP Portal for Forgot Password",
				"Hi User" + "\n\n" + regMsg + ": " + user.getPassword() + "\r\n", user);
	}

	@Override
	public Response createNewPassword(String newPassword, String email) {
		User user = userDao.findByName(email);
		Response response = new Response();
		int passwordCreation = userDao.createNewPassword(newPassword, email, user);
		if (passwordCreation != 0) {
			response.setResponseMessage("Password updated successfully");
			response.setStatusCode(HttpStatus.OK.value());
		} else {
			response.setResponseMessage("User Not Found with Entered email = " + email);
			response.setStatusCode(HttpStatus.NOT_FOUND.value());
		}

		return response;
	}
}
