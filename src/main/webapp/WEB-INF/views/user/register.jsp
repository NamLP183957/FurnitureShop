<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<div class="container">
        <div class="card card-login mt-5 col-lg-8 col-sm-10 border border-primary" style="margin-left: 16%;">
          <div class="card-header border border-primary" style="text-align: center; text"><h4>Information</h4></div>
          <div class="card-body">
            <form action="saveUser" method="post">
                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="Firstname">First name:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="text" class="form-control" id="Firstname"
                            placeholder="First name" name="firstName">
                    </div>
                </div>

                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="Lastname">Last name:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="text" class="form-control" id="Lastname"
                            placeholder="Last name" name="lastName">
                    </div>
                </div>

                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="Address">Address:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="text" class="form-control" id="Address"
                            placeholder="Address" name="address">
                    </div>
                </div>
                
                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="PhoneNumber">PhoneNumber:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="text" class="form-control" id="PhoneNumber" onkeyup="isPhoneNumber()"
                            placeholder="PhoneNumber" name="phoneNumber">
                    </div>
                </div>

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
                        <input type="password" class="email form-control" id="Password" onkeyup="check()"
                            placeholder="Password" name="password" required>
                    </div>
                </div>

                <div class="form-group form-check-inline w-100">
                    <label class="col-sm-2 col-xl-2 text-dark" for="Confirmpassword" >Confirm password:</label>
                    <div class="col-sm-10 col-xl-9">
                        <input type="password" class="form-control" id="Confirmpassword"
                            placeholder="Confirm password" name="confirmPassword" onkeyup="check()">
                    </div>
                </div>

              <button id="Submit" class="btn btn-success btn-block" style="color: white;">Register </button>
            </form>
          </div>
        </div>
      </div>

      <script src="<c:url value='/template/user/js/validate.js' />">
      </script>
</body>