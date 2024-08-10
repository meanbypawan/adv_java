package service;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AuthFilter implements Filter {
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
	  HttpServletRequest request = (HttpServletRequest)arg0;
	  HttpServletResponse response = (HttpServletResponse)arg1;
	  HttpSession session = request.getSession();
	  if(session.getAttribute("isLoggedIn")!=null)
		  chain.doFilter(request, response);
	  else
		  response.sendRedirect("signin.jsp");
	}
}
