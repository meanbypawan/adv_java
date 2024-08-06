package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try (Connection con = GetConnection.getConnection();){
    	  String title = request.getParameter("title");
    	  String brand = request.getParameter("brand");
    	  String price = request.getParameter("price");
    	  
    	  String sql = "insert into product(title,brand,price) values(?,?,?)";
    	  
    	  PreparedStatement ps = con.prepareStatement(sql);
    	  ps.setString(1, title);
    	  ps.setString(2, brand);
    	  ps.setInt(3, Integer.parseInt(price));
    	  if(ps.executeUpdate()!=0)
    		  System.out.println("Product Inserted...");
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
	}

}
