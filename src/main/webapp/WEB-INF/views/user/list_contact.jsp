<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<div class="container">
		<div class="breadcrumb row ">
			<div class="col-xl-8 col-sm-12">Danh sách liên hệ</div>
			<button href="#" class="btn btn-outline-danger">Chưa liên hệ</button>
			<button href="#" class="btn btn-outline-success"
				style="margin-left: 20px;">Đã liên hệ</button>
		</div>

		<table class="table table-hover">
			<thead>
				<tr class="row">
					<th class="col-sm-6 col-lg-6">Sản phẩm</th>
					<th class="col-sm-2 col-lg-2">Số lượng đã đặt</th>
					<th class="col-sm-2 col-lg-2">Trạng thái</th>
					<th class="col-sm-2 col-lg-2">Chi tiết</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${listContact}" var="contact">
					<tr class="row">
						<td class="col-sm-6 col-lg-6"><img
							src="data:image/jsp;base64, ${contact.product.images.get(0).base64Image}"
							class="col-am-3 col-lg-3" /> ${contact.product.name }</td>
						<td class="col-sm-2 col-lg-2">${contact.numberProduct }</td>
						<c:if test="${contact.status == true}">
							<td class="col-sm-2 col-lg-2">Đã liên hệ</td>
						</c:if>
						<c:if test="${contact.status == false}">
							<td class="col-sm-2 col-lg-2">Chưa liên hệ</td>
						</c:if>
						<td class="col-sm-2 col-lg-2"><a href="#">Chi Tiết</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>