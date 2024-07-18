package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestResultSetType {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product";
		  //PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY);
		  //PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE);
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs =  ps.executeQuery();
		  //rs.afterLast();
		  //rs.absolute(2);
		  while(rs.next()) {
			 int id =  rs.getInt(1);
			 if(id == 2) {
				rs.updateFloat("price", 60);
				rs.updateRow();
			 }
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
