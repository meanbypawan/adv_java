<%@page import="dao.AdminDAO"%>
<%@page import="model.Admin"%>
<jsp:useBean id="admin" class="model.Admin"></jsp:useBean>
<jsp:setProperty name="admin" property="*"></jsp:setProperty>
<% 
 if(request.getMethod().equals("POST")){
  try{
	 if(AdminDAO.create(admin)){%>
		<script>
		  window.alert("Sign up successfully...");
		  window.location.href = "../signin.jsp"
		</script> 
	 <%}else{%>
		<script>
		  window.alert("Sign up failed...");
		</script>  
	 <%}
		 
  }
  catch(Exception e){
	  e.printStackTrace();
  }
 }
%>