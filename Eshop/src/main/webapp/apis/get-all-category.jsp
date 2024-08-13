<%@page import="com.google.gson.Gson"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%
   if(request.getMethod().equals("GET")){
	 try{  
	   ArrayList<Category>al =  CategoryDAO.getCategoryList();
	   Gson gson = new Gson();
	   String jsonResponse =  gson.toJson(al);
	   response.setContentType("application/json");
	   response.setStatus(HttpServletResponse.SC_OK);
	   response.getWriter().write(jsonResponse);
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
   }
%>