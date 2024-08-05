package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.Session;
import jakarta.servlet.http.HttpSession;
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try (Connection con = GetConnection.getConnection();){
		  String email = request.getParameter("email");
		  String password = request.getParameter("password");
		  String sql = "select * from user where email = ? and password = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, email);
		  ps.setString(2, password);
		  ResultSet rs = ps.executeQuery();
		  PrintWriter out = response.getWriter();
		  if(rs.next()) {
			  HttpSession session =  request.getSession();
			  session.setAttribute("current-user", email);
			  session.setAttribute("isLoggedIn", true);
			  response.sendRedirect("dashboard.html");
		  }
		  else {
			out.print("Sign in failed....");  
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	}

}
