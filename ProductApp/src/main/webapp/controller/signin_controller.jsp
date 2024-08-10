<%@page import="dao.AdminDAO"%>
<%@page import="model.Admin"%>
<jsp:useBean id="admin" class="model.Admin"></jsp:useBean>
<jsp:setProperty name="admin" property="*"></jsp:setProperty>
<%
  if(request.getMethod().equals("POST")){
	  try{
		 admin = AdminDAO.authenticate(admin);
		 if(admin!=null){
			 session.setAttribute("isLoggedIn", "true");
			 session.setAttribute("currentUser", admin.getUsername());
			 response.sendRedirect("../dashboard.jsp");
		 }
		 else
		  out.print("Sign in failed...");
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
%>