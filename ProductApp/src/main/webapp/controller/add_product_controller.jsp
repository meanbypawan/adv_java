<%@page import="dao.ProductDAO"%>
<jsp:useBean id="product" class="model.Product"></jsp:useBean>
<jsp:setProperty name="product" property="*"></jsp:setProperty>
<%
try{
 if(request.getMethod().equals("POST")){
	if(ProductDAO.create(product)){%>
		 <script>
		   window.alert("Product saved successfully");
		   window.location.href="../add-product.jsp";
		 </script>
	<%}
	else{%>
		 <script>
		   window.alert("Oops! something went wrong");
		   window.location.href="../add-product.jsp";
		 </script>
	<%}
 }
}
catch(Exception e){
	e.printStackTrace();
}
%>