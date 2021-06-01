<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
	<div class="container border rounded" style="margin-top: 20px;">
    <form class="form-horizonal" action="saveOrder?productId=${product.id}" method="post"> 
        <div class="form-group form-check-inline w-100" >
            <img class="col-sm-3 col-lg-3" src="data:image/jpg;base64, ${image.base64Image}" style="height: 150px;">
            <h1>${product.name}</h1>
        </div>

        <div class="form-group form-check-inline w-100" style="margin-top: 10px;">
            <label class="col-sm-2 col-xl-2 text-dark" for="Number"><h5>Số lượng:</h5></label>
            <div class="col-sm-10 col-xl-9">
                <input type="text" class="form-control" id="Number" name="number"
                onkeyup="isNumber()"	placeholder="Số lượng">
            </div>
        </div>

        <div class="form-group form-check-inline w-100">
            <label class="col-sm-2 col-xl-2 text-dark" for="Name"><h5>Tên người nhận:</h5></label>
            <div class="col-sm-10 col-xl-9">
                <input type="text" class="form-control" id="Name" placeholder="Tên người nhận" name="userName"
                value="${currentUser.firstName} ${currentUser.lastName}">
            </div>
        </div>

        <div class="form-group form-check-inline w-100">
            <label class="col-sm-2 col-xl-2 text-dark" for="PhoneNumber"><h5>Số điện thoại:</h5></label>
            <div class="col-sm-10 col-xl-9">
                <input type="text" class="form-control" id="PhoneNumber" placeholder="Số điện thoại" name = "phoneNumber"
                onkeyup="isPhoneNumber()"	value="${currentUser.phoneNumber }">
            </div>
        </div>

        <div class="form-group form-check-inline w-100">
            <label class="col-sm-2 col-xl-2 text-dark" for="Address"><h5>Địa chỉ:</h5></label>
            <div class="col-sm-10 col-xl-9">
                <input type="text" class="form-control" id="Address" placeholder="Địa chỉ" name="address"
                value="${currentUser.address}">
            </div>
        </div>
    
        <button class="btn btn-success" id="Submit">Xác nhận</button>
    </form>
	
    <div class="card text-white bg-secondary my-5 py-4 text-center">
        <div class="card-body">
          <p class="text-white m-0">This call to action card is a great place to showcase some important information or display a clever tagline!</p>
        </div>
      </div>

     <!-- Content Row -->
     <div class="row">
        <div class="col-md-4 mb-5">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card One</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary btn-sm">More Info</a>
            </div>
          </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-5">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card Two</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt pariatur voluptatem sunt quam eaque, vel, non in id dolore voluptates quos eligendi labore.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary btn-sm">More Info</a>
            </div>
          </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-5">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card Three</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary btn-sm">More Info</a>
            </div>
          </div>
        </div>
    </div>
    </div>
    <script type="text/javascript" src="<c:url value='/template/user/js/validate.js' />"></script>
</body>