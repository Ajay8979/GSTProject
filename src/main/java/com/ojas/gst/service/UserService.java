package com.ojas.gst.service;


import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.ojas.gst.dto.UserGSPRegistrationDTO;
import com.ojas.gst.dto.UserStatusChangeDTO;
import com.ojas.gst.entity.AccessToken;
import com.ojas.gst.entity.User;
import com.ojas.gst.response.Response;




/**
 * @author DhanaLakshmi
 */
public interface UserService  extends UserDetailsService  {
	User findUserByAccessToken(String accessToken);

	AccessToken createAccessToken(User user);	
	
	User loadUserByName(String username);
	
	Response createUser(UserGSPRegistrationDTO dto, HttpServletRequest request);

	Response findByPrimaryKey(Long id);

	User updateUser(User user);
	
	User saveProfile(User user);

	User changePwd(User user);

	User saveNewPassword(Long id, String newPassword);
	
	AccessToken findAccessTokenByUserId(Long id,String token);
	
	AccessToken updateAccessToken(AccessToken token);

	Response findAllAdmins();

	Response changeActiveStatus(UserStatusChangeDTO dto);

	Response forgotPassword(String email ,HttpServletRequest request);

	Response findAllUsers(Integer pageNumber, Integer pageSize);
	
	Response gspSignIn(String userName , String Password);
	
	Response resetPassword(String currentPassword , String newPassword);
	
	Response createNewPassword(String currentPassword , String newPassword);
	
	
}

