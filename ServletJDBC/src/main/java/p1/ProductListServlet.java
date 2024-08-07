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


public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ProductListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try(Connection con = GetConnection.getConnection();) {
       String sql = "select * from product";
       PreparedStatement ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       PrintWriter out = response.getWriter();
       out.print("<html>");
       out.print("<body>");
       out.print("<div class=\"navigation\" style='height: 50px;\n"
       		+ "    background-color: black;\n"
       		+ "    color: white;\n"
       		+ "    display: flex;\n"
       		+ "    align-items: center;\n"
       		+ "    column-gap: 20px;\n"
       		+ "    padding-left: 15px;'>\n"
       		+ "   <small>Home</small>\n"
       		+ "   <small><a href=\"add-product.html\">Add product</a></small>\n"
       		+ "   <small><a href=\"./ProductListServlet\">Product List</a></small>\n"
       		+ "   <small>\n"
       		+ "   <form method=\"POST\" action=\"./SignOutServlet\">\n"
       		+ "     <button type=\"submit\">Sign out</button>\n"
       		+ "   </form></small>\n"
       		+ " </div>");
       out.print("<table width='100%' border='1'>");
       out.print("<tr>");
       out.print("<td>Id</td>");
       out.print("<td>Title</td>");
       out.print("<td>Brand</td>");
       out.print("<td>Price</td>");
       out.print("</tr>");
       while(rs.next()) {
    	   int id = rs.getInt(1);
    	   String title = rs.getString(2);
    	   String brand = rs.getString(3);
    	   int price = rs.getInt(4);
    	   out.print("<tr>");
           out.print("<td>"+id+"</td>");
           out.print("<td>"+title+"</td>");
           out.print("<td>"+brand+"</td>");
           out.print("<td>"+price+"</td>");
           out.print("</tr>");
       }
       out.print("</table>");
       
       out.print("</body>");
       out.print("</html>");
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
