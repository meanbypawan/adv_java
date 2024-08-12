<%@page import="dao.ProductDAO"%>
<jsp:useBean id="product" class="model.Product"></jsp:useBean>
<jsp:setProperty name="product" property="*"></jsp:setProperty>
<% 
 if(request.getMethod().equals("POST")){
  if(ProductDAO.update(product)){%>
	<script>
	  window.alert("Product successfully updated...");
	  window.location.href = "../product-list.jsp";
	</script>  
  <%}
 }
%>