package com.careem.engine.web.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.
logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class RestLogoutSuccessHandler implements LogoutSuccessHandler {

	@Override
	public void onLogoutSuccess(HttpServletRequest request,
			HttpServletResponse response, 
			Authentication authentication) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().flush();
	}

}
