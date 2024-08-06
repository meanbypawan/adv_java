package p1;

import jakarta.servlet.Filter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class AuthFilter
 */
public class AuthFilter implements Filter {

	@Override
	public void doFilter(jakarta.servlet.ServletRequest req, jakarta.servlet.ServletResponse res,
			jakarta.servlet.FilterChain chain) throws IOException, jakarta.servlet.ServletException {
	  HttpServletRequest request = (HttpServletRequest)req;
	  HttpServletResponse response = (HttpServletResponse)res;
	  
	  HttpSession session =  request.getSession();
	  Object status = session.getAttribute("isLoggedIn");
	  System.out.println("Filter Executed...."+status);
	  if(status!=null)
		  chain.doFilter(request, response);
	  else {
		  System.out.println("Else executed.....");
          response.sendRedirect("signin.html");
	  }
	
}
 
}
