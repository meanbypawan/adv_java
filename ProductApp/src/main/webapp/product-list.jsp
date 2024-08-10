<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="__bootstrap.jsp" %>
</head>
<body>
  <%@include file="__header.jsp" %>
  <div class="container mt-5">
    <table class="table">
      <thead>
        <tr>
          <th>S.no</th>
          <th>Title</th>
          <th>Brand</th>
          <th>Price</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
      </thead>
      <tbody>
       <%
         ArrayList<Product> al = ProductDAO.list();
         int index=1; 
         for(Product p : al){%>
    	   <tr>
    	     <td><%=index%></td>
    	     <td><%= p.getTitle()%></td>
    	     <td><%= p.getBrand()%></td>
    	     <td><%= p.getPrice()%></td>
    	     <td>
    	      <a href="view-product.jsp?id=<%=p.getId() %>">
    	       <button class="btn btn-primary">Edit</button>
    	      </a>
    	     </td>
    	     <td>
    	       <a href="controller/delete_product_controller.jsp?id=<%=p.getId() %>">
    	         <button onclick="return window.confirm('Do you want to delete it ?');" class="btn btn-danger">Delete</button>
    	       </a>
    	     </td>
    	   </tr>
         <% index++;}
       %>
      </tbody>
    </table>
  </div>
  
  
</body>
</html>