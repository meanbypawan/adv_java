package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import service.GetConnection;

public class UserDAO {
  public static User authenticate(User user) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from user where email = ? and password = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, user.getEmail());
		  ps.setString(2, user.getPassword());
		  ResultSet rs = ps.executeQuery();
		  if(rs.next()) {
			  user.setId(rs.getInt(1));
		  }	
		  else
		   return null;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	      return null;
	  }
	  return user;
  }
  public static boolean create(User user) {
	  boolean status = false;
	  try(Connection con = GetConnection.getConnection();){
		  String sq1 = "insert into user(username,email,password) values(?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sq1);
		  ps.setString(1, user.getUsername());
		  ps.setString(2,user.getEmail());
		  ps.setString(3, user.getPassword());
		  if(ps.executeUpdate()!=0)
			  status = true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return status;
  }
}
