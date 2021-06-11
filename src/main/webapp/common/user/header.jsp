<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="status" scope="session" value="${true}" />
<c:if test="${status == true}">
	<nav class="col-sm-12 sol-lg-12 bg-dark">
		<div class="container"
			style="padding-top: 10px; padding-bottom: 10px;">
			<a class="navbar-brand col-sm-5 col-lg-5" href="trangChu"><i class="fas fa-home"></i> Trang chu </a>

			<div class="btn-group col-sm-6 col-lg-6">
				<div class="dropdown col-lg-3">
					<button type="button"
						class="btn btn-secondary col-lg-12 dropdown-toggle"
						data-toggle="dropdown">Thiết kế</button>

					<div class="dropdown-menu">
						<a class="dropdown-item" href="sanPham?style=Thiet ke biet thu">Thiết kế biệt thự</a> <a
							class="dropdown-item" href="sanPham?style=Thiet ke chung cu">Thiết kế chung cư</a> <a
							class="dropdown-item" href="sanPham?style=Thiet ke khach san">Thiết kế khách sạn</a> <a
							class="dropdown-item" href="sanPham?style=Thiet ke phong khach">Thiết kế phòng khách</a> <a
							class="dropdown-item" href="sanPham?style=Thiet ke phong ngu">Thiết kế phòng ngủ</a> <a
							class="dropdown-item" href="sanPham?style=Thiet ke phong bep">Thiết kế phòng bếp</a>
					</div>
				</div>
				<div class="dropdown col-lg-3">
					<button type="button"
						class="btn btn-secondary col-lg-12 dropdown-toggle"
						data-toggle="dropdown">Trang trí</button>

					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">Bàn ghế gỗ</a> 
						<a class="dropdown-item" href="sanPham?style=Dong ho">Đồng hồ</a> 
						<a class="dropdown-item" href="sanPham?style=Tham trai nha">Thảm trải nhà</a>
					</div>
				</div>
				<div class="col-lg-3">
					<button type="button" onclick="location.href='lienHe'" class="btn btn-secondary col-lg-12" >Contact</button>
				</div>

				<div class="col-lg-3">
					<button type="button" class="btn btn-secondary col-lg-12">Logout</button>
				</div>

			</div>

		</div>
	</nav>
</c:if>
