<%@page import="java.util.HashMap"%>
<%@page import="dao.ProductDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<%
  if(request.getMethod().equals("POST")){
	  Gson gson = new Gson();
	  try{
		 JsonArray jsonArray =  gson.fromJson(request.getReader(), JsonArray.class);
	     Type listType =  new TypeToken<ArrayList<Product>>(){}.getType();
	     ArrayList<Product> al =  gson.fromJson(jsonArray, listType);
	     
	     response.setContentType("application/json");
	     HashMap<String,String> hm = new HashMap<String,String>();
	     if(ProductDAO.saveInBulk(al)){
	    	 response.setStatus(HttpServletResponse.SC_OK);
	    	 hm.put("message","All product saved");
	     }
	    else{
	    	 response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	    	 hm.put("error","Oops! something went wrong");
	    }
	    String json = gson.toJson(hm);
	    response.getWriter().write(json);
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
%>