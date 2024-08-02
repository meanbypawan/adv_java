package p1;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class TestServlet implements Servlet {
	@Override
	public void init(ServletConfig arg0) throws ServletException {
	  System.out.println("Init executed.....");   
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	  System.out.println("Service Method executed....");
	}

	@Override
	public void destroy() {
        System.out.println("Destroy method executed....");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
}
