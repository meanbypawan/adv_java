<%@page import="java.util.HashMap"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%
  ArrayList<Product>al =  ProductDAO.list();
  Gson gson = new Gson();
  HashMap<String,ArrayList<Product>>hm = new HashMap<String,ArrayList<Product>>();
  hm.put("products",al);
  String data = gson.toJson(hm);
  out.print(data);
%>