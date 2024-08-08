<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <%@include file="__bootstrap.jsp" %>
</head>
<body>
  
<div class="container-fluid bg-danger d-flex justify-content-center align-items-center" style="height:100vh;">
   <div style="width:30%;height:auto;" class="bg-light">
    <h5 class="bg-secondary text-center p-2">Welcome user</h5>
    <form action="controller/signin_controller.jsp" method="POST" class="p-2">
      <%@include file="__admin_form.jsp" %>
      <div class="form-group">
        <button class="btn btn-secondary" style="width:100%;">Sign in</button>
      </div>
    </form>
    <p class="text-center"><a href="signup.jsp">Create new account ?</a></p>
   </div>
</div>

</body>
</html>
