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

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignUpServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try(Connection con = GetConnection.getConnection();) {	
		String username = request.getParameter("username");
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		String sql = "insert into user(username,email,password) values(?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, email);
		ps.setString(3, password);
		if(ps.executeUpdate()!=0) {
			PrintWriter out = response.getWriter();
			out.print("Sign up success...");
		}
			
	   }
	   catch(Exception e) {
		   e.printStackTrace();
			PrintWriter out = response.getWriter();
			out.print("Sign up failed...");
		
	   }
	}	

}
