<% 
 String s1 = request.getParameter("firstNumber");
 String s2 = request.getParameter("secondNumber");
 
 int a = Integer.parseInt(s1);
 int b = Integer.parseInt(s2);
 
 out.print("Addition : "+(a+b));
%>