<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="__bootstrap.jsp" %> 
</head>
<body>
  <%@include file="__header.jsp" %>
  <div class="container mt-5 p-2">
    <form method="POST" action="controller/add_product_controller.jsp">
      <div class="form-group">
        <input name="title" type="text" class="form-control" placeholder="Enter product title"/>
      </div>
      <div class="form-group">
        <input name="brand" type="text" class="form-control" placeholder="Enter product brand"/>
      </div>
      <div class="form-group">
        <input name="price" type="text" class="form-control" placeholder="Enter product price"/>
      </div>
      <div class="form-group">
         <button class="btn btn-success">ADD</button>
      </div>
    </form>
  </div>
</body>
</html>