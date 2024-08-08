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
		 
		 admin = AdminDAO.authenticate(admin);
		 if(admin!=null)
			 out.print("Sign in success");
		 else
			 out.print("Sign in failed...");
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
%>