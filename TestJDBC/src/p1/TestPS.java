package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestPS {
  public static void main(String args[]) {
	  Connection con = null;
	  try {
		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter product name");
		  String name = sc.next();

		  System.out.println("Enter Brand");
		  String brand = sc.next();

		  System.out.println("Enter price");
		  float price = sc.nextFloat();

		  con = GetConnection.getConnection();

		  String sql = "insert into product(name,price,brand) values(?,?,?)";

		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, name);
		  ps.setFloat(2, price);
		  ps.setString(3, brand);

		  if(ps.executeUpdate()!=0) {
			System.out.println("Record inserted...");
		}
	  }
	  catch (Exception e) {
		 e.printStackTrace();
	  }
	  finally {
		  try {
			  con.close();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
  }
}
