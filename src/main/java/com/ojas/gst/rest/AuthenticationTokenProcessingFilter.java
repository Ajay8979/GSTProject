package com.ojas.gst.rest;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.ojas.gst.entity.User;
import com.ojas.gst.service.UserService;



/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class AuthenticationTokenProcessingFilter extends GenericFilterBean {
	private final UserService userService;

	public AuthenticationTokenProcessingFilter(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = this.getAsHttpRequest(request);

		String accessToken = this.extractAccessTokenFromRequest(httpRequest);
		((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "*");
		((HttpServletResponse) response).addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST");

		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setStatus(HttpServletResponse.SC_ACCEPTED);

		if (null != accessToken) {
			User user = this.userService.findUserByAccessToken(accessToken);
			if (null != user) {
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null
						/*user.getAuthorities()*/);
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		chain.doFilter(request, resp);
	}

	private HttpServletRequest getAsHttpRequest(ServletRequest request) {
		if (!(request instanceof HttpServletRequest)) {
			throw new RuntimeException("Expecting an HTTP request");
		}

		return (HttpServletRequest) request;
	}

	private String extractAccessTokenFromRequest(HttpServletRequest httpRequest) {
		/* Get token from header */
		String authToken = httpRequest.getHeader("X-Access-Token");

		/* If token not found get it from request parameter */
		if (authToken == null) {
			authToken = httpRequest.getParameter("token");
		}

		return authToken;
	}
}
