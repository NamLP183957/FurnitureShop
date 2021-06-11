<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="bg-dark pt-3 pl-5 pr-5"
	style="float: left;">

	<ul class="navbar-nav">
		<li class="nav-item dropdown">
			<h6>
				<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" style="color: white;">
					<i class="fas fa-hospital-alt"></i> Product
				</a>

				<div class="dropdown-menu">
					<a class="dropdown-item" href="product?type=design_pattern">Home Design</a> 
					<a class="dropdown-item" href="product?type=decorator_product">Furniture Product</a>
				</div>
			</h6>
		</li>

		<li class="nav-item"><a href="listContact?status=all" class="nav-link" style="color: white;">
				<h6>
					<i class="fas fa-address-card" ></i> Contact
				</h6>
		</a></li>
		<li class="nav-item"><a href="statistic" class="nav-link" style="color: white;">
				<h6>
					<i class="fas fa-chart-bar"></i> Statistic
				</h6>
		</a></li>
		<li class="nav-item"><a href="#" class="nav-link" style="color: white;">
				<h6>
					<i class="fas fa-comment-alt"></i> Message
				</h6>
		</a></li>

	</ul>
</div>