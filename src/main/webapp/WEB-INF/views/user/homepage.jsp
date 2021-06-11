<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<div class="container">

		<!-- Heading Row -->
		<div class="row align-items-center my-5">
			<div class="col-lg-7">
				<img class="img-fluid rounded mb-4 mb-lg-0"
					src="data:image/jsp;base64,${bestProduct.images.get(0).base64Image}" alt=""  style="width: 512px; height: 300px;">
			</div>
			<!-- /.col-lg-8 -->
			<div class="col-lg-5">
				<h1 class="font-weight-light">${bestProduct.name}</h1>
				<p>${bestProduct.description}</p>
				<a class="btn btn-primary" href="ChiTiet?id=${bestProduct.id}">Chi
					tiết</a>
			</div>
			<!-- /.col-md-4 -->
		</div>
		<!-- /.row -->

		<!-- Call to Action Well -->
		<div class="card text-white bg-secondary my-5 py-4 text-center">
			<div class="card-body">
				<p class="text-white m-0">Các sản phẩm bán chạy nhất tháng ${currentMonth}</p>
			</div>
		</div>

		<!-- Content Row -->
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-md-4 mb-5">
					<div class="card h-100">
						<div class="card-body">
							<image class="col-sm-12 col-lg-12" height=200px; src="data:image/jsp;base64, ${product.images.get(0).base64Image }"/>
							<h2 class="card-title mt-2 ml-2">${product.name}</h2>
						</div>
						<div class="card-footer">
							<a href="ChiTiet?id=${product.id}" class="btn btn-primary btn-sm">Chi tiết</a>
						</div>
					</div>
				</div>
			</c:forEach>


		</div>
		<!-- /.row -->

	</div>
</body>