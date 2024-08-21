<!DOCTYPE html>
<html lang="en">
<head>
  <title>Eshop</title>
  <%@include file="__bootstrap.jsp" %>
  <style>
    .container-size{
      height:100vh;
    }
  </style>
</head>
<body>
  
<div class="container container-size d-flex justify-content-center align-items-center">
   <div class="form" style="width:30%;height:250px;box-shadow: 5px 5px 5px grey">
     <h6 class="bg-danger text-white text-center p-1">Sign in</h6>
     <form class="p-2" action="controller/signin_controller.jsp" method="post">
       
       <div class="form-group">
         <input name="email" type="email" placeholder="Enter email id" class="form-control"/>
       </div>
       <div class="form-group">
         <input name="password" type="password" placeholder="Enter password" class="form-control"/>
       </div>
       <div class="form-group">
         <button class="btn btn-secondary" style="width:100%" type="submit">Submit</button>
       </div>
       <div class="form-group">
         <p class="text-center"><a href="signup.jsp">Create a new account ?</a></p>
       </div>
     </form>
   </div>
</div>

</body>
</html>
