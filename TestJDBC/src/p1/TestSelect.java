package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSelect {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ResultSet rs =  ps.executeQuery();
		  while(rs.next()) {
			 int id =  rs.getInt(1);
			 String name = rs.getString(2);
			 float price = rs.getFloat("price");
			 String brand = rs.getString("brand");
		     System.out.println(id+" "+name+" "+price+" "+brand);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
