<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="status" scope="session" value="true" />

<c:if test="${status == true}">

	<!-- Footer -->
	<footer class="py-5 bg-dark" style="margin-top: 10px;">
		<div class="container">
			<p class="m-0 text-center text-white">Liên hệ trực tiếp: 0123456789</p>
		</div>
		<!-- /.container -->
	</footer>

</c:if>
