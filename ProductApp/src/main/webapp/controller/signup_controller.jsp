<%@page import="dao.AdminDAO"%>
<%@page import="model.Admin"%>
<% 
 if(request.getMethod().equals("POST")){
  try{
	 String username = request.getParameter("username");
	 String password = request.getParameter("password");
	 
	 Admin admin = new Admin();
	 admin.setUsername(username);
	 admin.setPassword(password);
	 
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