package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Review;
import service.GetConnection;

public class ReviewDAO {
   public static ArrayList<Review> getReviews(int productId){
	   ArrayList<Review> al = new ArrayList<Review>();
	   try(Connection con = GetConnection.getConnection();){
		   String sql = "select * from review where productId = ?";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setInt(1, productId);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt(1);
			   int rating = rs.getInt(2);
			   String comment = rs.getString(3);
			   String date = rs.getString(4);
			   String reviewerName = rs.getString(5);
			   String reviewerEmail = rs.getString(6);
			   
			   Review r = new Review();
			   r.setId(id);
			   r.setRating(rating);
			   r.setComment(comment);
			   r.setDate(date);
			   r.setReviewerName(reviewerName);
			   r.setReviewerEmail(reviewerEmail);
			   al.add(r);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return al;
   }
}
