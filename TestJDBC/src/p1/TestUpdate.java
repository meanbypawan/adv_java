package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestUpdate {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter record/product id to be updated");
		  int id = sc.nextInt();
	  
	      System.out.println("Enter product name");
	      String name = sc.next();
	      
	      System.out.println("Enter price");
	      float price = sc.nextFloat();
	      
	      System.out.println("Enter brand");
	      String brand = sc.next();
	    
	      String sql = "update product set name= ?, price=?, brand=? where id = ?";
	      
	      PreparedStatement ps = con.prepareStatement(sql);
	      ps.setString(1, name);
	      ps.setFloat(2, price);
	      ps.setString(3, brand);
	      ps.setInt(4, id);
	      if(ps.executeUpdate()!=0)
	    	  System.out.println("Record updated..");
	  }
	  catch (Exception e) {
		e.printStackTrace();
	  }
  }
}
