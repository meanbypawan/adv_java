<%
 if(request.getMethod().equals("POST")){
  session.setAttribute("isLoggedIn", null);
  session.setAttribute("currentUser", null);
  session.invalidate();
  response.sendRedirect("../signin.jsp");
 }
%>