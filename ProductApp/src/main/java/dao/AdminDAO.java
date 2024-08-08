package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Admin;
import service.GetConnection;

public class AdminDAO {
   
   public static Admin authenticate(Admin admin) {
	   try (Connection con = GetConnection.getConnection();){
		   String sql = "select * from admin where username = ? and password = ?";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, admin.getUsername());
		   ps.setString(2, admin.getPassword());
		   ResultSet rs = ps.executeQuery();
		   if(rs.next())
			   return admin;
	       return null;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return null;
	   
   }
   public static boolean create(Admin admin) {
	   boolean status = false;
	   try (Connection con = GetConnection.getConnection();){
		   String sql = "insert into admin(username,password) values(?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, admin.getUsername());
		   ps.setString(2, admin.getPassword());
		   if(ps.executeUpdate()!=0)
			   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
