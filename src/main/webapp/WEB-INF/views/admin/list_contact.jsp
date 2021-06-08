<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<div class="content-wrapper" class="col-xl-10 col-sm-9 w-100"
		style="float: right; margin-left: 20px;">
		<div class="container-fluid">
			<div class="breadcrumb row " style="width: 1200px;">
				<div class="col-xl-8 col-sm-12">Danh sách liên hệ</div>
				<button onclick="location.href='listContact?status=notContact'" class="btn btn-outline-danger">Chưa liên
					hệ</button>
				<button onclick="location.href='listContact?status=contacted'" class="btn btn-outline-success"
					style="margin-left: 20px;">Đã liên hệ</button>
			</div>

			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Tên sản phẩm</th>
						<th>Số lượng đã đặt</th>
						<th>Trạng thái</th>
						<th>Chi tiết</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${listContact}" var="contact">
						<tr>
							<td>${contact.id }</td>
							<td>${contact.product.name}</td>
							<td>${contact.numberProduct}</td>
							<td>
							<c:if test="${contact.status == true }">Đã liên hệ</c:if>
							<c:if test="${contact.status == false }">Chưa liên hệ</c:if>
							</td>
							<td><a href="contactDetail?contactID=${contact.id}">Chi Tiết</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>