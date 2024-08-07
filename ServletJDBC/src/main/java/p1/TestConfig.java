package p1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TestConfig
 */
public class TestConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TestConfig() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   ServletConfig config =  getServletConfig();
	   System.out.println(config);
	   String message = config.getInitParameter("message");
	   String messageTwo = config.getInitParameter("messageTwo");
       response.getWriter().print(message +"   "+messageTwo);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
