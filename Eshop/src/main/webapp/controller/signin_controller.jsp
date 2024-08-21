<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
  if(request.getMethod().equals("POST")){
   User u = UserDAO.authenticate(user); 
   if(u!=null){
	  session.setAttribute("currentUserId", u.getId());
	  session.setAttribute("isLoggedIn", true);
	  response.sendRedirect("../dashboard.jsp");
  }
  else
	  response.sendRedirect("../signin.jsp");
  }
  else
	 response.sendRedirect("../signin.jsp");  
%>