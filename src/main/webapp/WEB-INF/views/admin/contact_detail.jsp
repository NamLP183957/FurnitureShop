fa<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<div class="col-xl-10 col-sm-9" style="float: right;">
		<div class="container-fluid">
			<div class="breadcrumb">Chi tiết liên hệ</div>

			<div class="card col-sm-12 col-lg-7">
				<div class="card-header border border-light row">
					<div class="col-sm-6 col-lg-4">
						<h5>ID: ${contact.id }</h5>
					</div>
					<div class="col-sm-6 col-lg-8">
						<h5>Tên sản phẩm: ${contact.product.name }</h5>
					</div>
				</div>

				<div class="card-body">
					<div class="form-group form-check-inline w-100 row">
						<label class="col-sm-6 col-xl-4 text-dark">Tên khách hàng:</label>
						<div class="col-sm-6 col-xl-8">${contact.userName }</div>
					</div>

					<div class="form-group form-check-inline w-100 row">
						<label class="col-sm-6 col-xl-4 text-dark">Số lượng: </label>
						<div class="col-sm-6 col-xl-8">${contact.numberProduct }</div>
					</div>

					<div class="form-group form-check-inline w-100 row">
						<label class="col-sm-6 col-xl-4 text-dark">Số điện thoại:
						</label>
						<div class="col-sm-6 col-xl-8">${contact.phoneNumber }</div>
					</div>

					<div class="form-group form-check-inline w-100 row">
						<label class="col-sm-6 col-xl-4 text-dark">Địa chỉ: </label>
						<div class="col-sm-6 col-xl-8">${contact.address }</div>
					</div>

					<div class="form-group form-check-inline w-100 row">
						<label class="col-sm-6 col-xl-4 text-dark">Ngày đặt hàng:
						</label>
						<div class="col-sm-6 col-xl-8">${startDate }</div>
					</div>

				</div>
			</div>
			
			<c:if test="${contact.status == true}">
				<button class="btn btn-warning mt-4">Đã liên hệ</button>
			</c:if>
			
			<c:if test="${contact.status == false}">
				<button class="btn btn-outline-success mt-4">Liên hệ</button>
			</c:if>
		</div>
	</div>
</body>
</html>