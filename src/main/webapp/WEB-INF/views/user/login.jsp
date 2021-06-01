<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<div class="container">
        <div class="card card-login mt-5 col-lg-6 col-sm-10 border border-primary" style="margin-left: 25%;">
          <div class="card-header border border-primary">Login</div>
          <div class="card-body">
          	<p style="color: red; ">${announcement} </p>
            <form action="authenticate" method="post">  
              <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="Email">Email:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="email" class="form-control" id="Email" onkeyup="isEmail()"
                            placeholder="Email" name="email">
                    </div>
                </div>
              
                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="password">Password:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="password" class="email form-control" id="Password"
                            placeholder="Password" name="password" required>
                    </div>
                </div>
              
              <div class="form-group">
                <div class="checkbox">
                  <label>
                    <input type="checkbox" value="remember-me">
                    Remember Password
                  </label>
                </div>
              </div>
              
              <div style="text-align: center"><a href="register">Register account?</a></div>
              <button class="btn btn-success btn-block" id="Submit" style="color: white;">Login </button>
            </form>
          </div>
        </div>
      </div>
      
      <script type="text/javascript" src="<c:url value='/template/user/js/validate.js' />">
      </script>
</body>
</html>