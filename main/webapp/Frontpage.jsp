<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FrontPage</title>
<link href="Frontstyle.css" rel="stylesheet"></link>
</head>
<body>
  <div class="container">
    <input type="checkbox" id="check">
    <div class="login form">
      <header>Login</header>
      <form action="login" method="post">
        <input type="text" placeholder="Enter your Username" name="email" required autofocus>
        <span></span>
        <input type="password" placeholder="Enter your password" name="password" required autofocus>
        <span></span>
        <a href="#">Forgot password?</a>
        <input type="submit" class="button" value="Login">
      </form>
      <div>
        <a href="SignUp.jsp">Don't have an account?</a>
      </div>
      
    </div>
    
  </div>
</body>

</html>