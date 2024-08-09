package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Product;
import service.GetConnection;

public class ProductDAO {
   public static ArrayList<Product> list(){
	   ArrayList<Product> al = new ArrayList<Product>();
	   try(Connection con = GetConnection.getConnection();) {
		   String sql = "select * from product";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt(1);
			   String title = rs.getString(2);
			   String brand = rs.getString(3);
			   int price = rs.getInt(4);
		       Product p = new Product(id, title, brand, price);
		       al.add(p);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return al;
   }
   public static boolean create(Product p) {
	   boolean status = false;
	   try(Connection con = GetConnection.getConnection();){
		   String sql = "insert into product(title,brand,price) values(?,?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, p.getTitle());
		   ps.setString(2, p.getBrand());
		   ps.setInt(3, p.getPrice());
		   if(ps.executeUpdate()!=0)
			   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
