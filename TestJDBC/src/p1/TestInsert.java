package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
  public static void main(String args[]) {
	try {  
	  // 1. Load the Driver class	
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  // 2. Get a connection
	  Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb?useSSL=false","root","root");
	 
	  String sql = "insert into product(name,price,brand) values('Watch',5000,'Titan')";
	  
	  // 3. Get Statement 
	  Statement st =  con.createStatement();
	  int x  = st.executeUpdate(sql);
	  if(x!=0)
		  System.out.println("Record Inserted..");
	  
	  // 4. close the connection
	  con.close();
	  /*
	   DML - > executeUpdate(sql) : int
	   Select -> executeQuery(sql) : ResultSet
	   DDL - > execute(sql) : boolean 
	    */
	}
	catch(Exception e) {
		e.printStackTrace();
	}
  }
}
