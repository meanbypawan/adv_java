<%@page import="java.util.HashMap"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<%
  if(request.getMethod().equals("POST")){
	  try{
		  Gson gson = new Gson();
		  JsonArray jsonArray =  gson.fromJson(request.getReader(), JsonArray.class);
	      Type listType =  new TypeToken<ArrayList<Category>>(){}.getType();
	      ArrayList<Category>al =  gson.fromJson(jsonArray, listType);
	      HashMap<String,String>hm = new HashMap<String,String>();
	      response.setContentType("application/json");
	      String jsonResponse = "";
	      if(CategoryDAO.saveInBulk(al)){
	    	  hm.put("message","All category saved");
	    	  response.setStatus(HttpServletResponse.SC_OK);
	      }
	      else{
	    	  hm.put("error","Oops! something went wrong");
	    	  response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	      }
	      jsonResponse = gson.toJson(hm);  
	      response.getWriter().write(jsonResponse);
	      
	  }
	  catch(Exception e){
		  e.printStackTrace();
		  HashMap<String,String> hm = new HashMap<String,String>();
		  hm.put("error","Internal Server Error");
		  String jsonResponse =new Gson().toJson(hm);
		  response.setContentType("application/json");
		  response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		  response.getWriter().write(jsonResponse);
	  
	  }
  }
  else{
	  HashMap<String,String> hm = new HashMap<String,String>();
	  hm.put("error","Bad request");
	  String jsonResponse =new Gson().toJson(hm);
	  response.setContentType("application/json");
	  response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	  response.getWriter().write(jsonResponse);
  }
%>