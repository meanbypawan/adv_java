package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestDelete {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter product id");
		 int id = sc.nextInt();
		 
		 String sql = "delete from product where price = ?";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setInt(1, id);
		 if(ps.executeUpdate()!=0)
			 System.out.println("Record removed");
	  }
	  catch (Exception e) {
		e.printStackTrace();
	  }
  }
}
