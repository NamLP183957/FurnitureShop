<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<div id="content-wrapper" class="col-xl-10 col-sm-9"
			style="float: right;">
			<div class="container-fluid">

				<div class="breadcrumb">
					<a href="#">Product </a> / ${type}
				</div>

				<div class="container-fluid row">
				<c:forEach items="${listStyle}" var="style">
					<button type="button"
						class="btn btn-outline-success col-xl-2 col-sm-6 mb-3 mr-3">${style}</button>
				</c:forEach>
				</div>
				
				<div class="breadcrumb">
					<p>${type}</p>
				</div>

				<div class="container-fluid row">
					<div class="col-sm-10">
						<table class="table table-bordered table-hover">
							<thead>
								<tr>
									<th>ID</th>
									<th>Sản phẩm</th>
									<th>Chi tiết</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listProduct}" var="product">
									<tr> 
										<td>${product.id} </td>
										<td>${product.name} </td>
										<td><a href="productDetail?id=${product.id}">chi tiết </a></td>
									</tr>
								
								 </c:forEach>
							</tbody>
						</table>
					</div>

					<div class="col-sm-2">
						<button class="btn btn-primary col-sm-12 mb-3" onclick="location.href='addProduct?type=${type}'">Thêm</button>
					</div>
				</div>
			</div>

		</div>
</body>
</html>