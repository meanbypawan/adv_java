<%@page import="dao.UserDAO"%>
<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
   if(UserDAO.create(user)){%>
    <script>
	  window.alert("Sign up success");  
	  window.location.href="../signin.jsp"
    </script>
   <%}else{%>
	<script>
	  window.alert("Sign failed");  
    </script>
      
   <%}
%>