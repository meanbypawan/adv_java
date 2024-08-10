<%@page import="dao.ProductDAO"%>
<jsp:useBean id="product" class="model.Product"></jsp:useBean>
<jsp:setProperty name="product" property="id"></jsp:setProperty>
<%
  try{
   if(ProductDAO.delete(product.getId()))
	   response.sendRedirect("../product-list.jsp");
   else{%>
	   <script>
	     window.alert("Request resource is not found");
	     window.location.href = "../product-list.jsp";
	   </script>   
   <%}
  }
  catch(Exception e){
	  e.printStackTrace();
  }
	   
%>