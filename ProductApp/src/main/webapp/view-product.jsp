<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<jsp:useBean id="product" class="model.Product"></jsp:useBean>
<jsp:setProperty name="product" property="id"></jsp:setProperty>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="__bootstrap.jsp" %>
</head>
<body>
  <%@include file="__header.jsp" %>
  <% 
    Product p = ProductDAO.get(product.getId());
    if(p!=null){
  %>
  <div class="container mt-5 p-2">
    <p class="bg-primary p-1">Update product details</p>
    <form method="POST" action="controller/add_product_controller.jsp">
      <div class="form-group">
        <input value="<%=p.getTitle() %>" name="title" type="text" class="form-control" placeholder="Enter product title"/>
      </div>
      <div class="form-group">
        <input value="<%=p.getBrand() %>" name="brand" type="text" class="form-control" placeholder="Enter product brand"/>
      </div>
      <div class="form-group">
        <input value="<%=p.getPrice() %>" name="price" type="text" class="form-control" placeholder="Enter product price"/>
      </div>
      <div class="form-group">
         <button class="btn btn-success">Update</button>
      </div>
    </form>
  </div>
  <%} %>
</body>
</html>