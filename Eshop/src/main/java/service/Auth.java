package service;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class Auth implements Filter{
       @Override
    public void doFilter(jakarta.servlet.ServletRequest arg0, jakarta.servlet.ServletResponse arg1,
    		jakarta.servlet.FilterChain chain) throws IOException, jakarta.servlet.ServletException {
       HttpServletRequest request = (HttpServletRequest)arg0;
       HttpServletResponse response = (HttpServletResponse)arg1;
       
       HttpSession session = request.getSession();
       Object o = session.getAttribute("isLoggedIn");
       if(o!=null)
    	   chain.doFilter(request, response);
       else
    	   response.sendRedirect("signin.jsp");
    }

}
