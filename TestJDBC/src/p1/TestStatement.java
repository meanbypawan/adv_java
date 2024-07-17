package p1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement {
  public static void main(String args[]) {
	  Connection con = null;
	  try {
		  con = GetConnection.getConnection();
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter product name");
		  String name = sc.next();
		  
		  System.out.println("Enter Brand");
		  String brand = sc.next();
		  
		  System.out.println("Enter price");
		  float price = sc.nextFloat();
		  
		  String sql = "insert into product(name,price,brand) values('"+name+"',"+price+",'"+brand+"')";
	  
	      Statement st = con.createStatement();
	      
	      if(st.executeUpdate(sql)!=0)
	    	  System.out.println("Record Inserted..."); 
	  }
	  catch(Exception e) {
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
