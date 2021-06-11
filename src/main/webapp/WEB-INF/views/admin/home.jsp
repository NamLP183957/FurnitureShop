<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
        
        <div id="content-wrapper" class="col-xl-10 xol-sm-9" style="float: right;">
            <div class="container-fluid">

                <div class="breadcrumb">
                    admin homepage
                </div>

                <div class="row text-white">
                    <div class="col-xl-3 col-sm-6 mb-3">
                        <div class="card bg-warning">
                            <div class="card-body">
                                <p>${numberProduct} sản phẩm mới</p> 
                            </div>
                            <div class="card-footer"><a href="listNewProduct" class="text-white">Chi tiết ></a></div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-sm-6 mb-3">
                        <div class="card bg-info">
                            <div class="card-body">
                                <div class="mr-5"><p>${numberContact} liên hệ mới</p></div>
                            </div>
                            <div class="card-footer"><a href="listNewContact" class="text-white">Chi tiết ></a></div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-sm-6 mb-3">
                        <div class="card bg-success">
                            <div class="card-body">
                                <div class="mr-5"><p>Thống kê thàng</p></div>
                            </div>
                            <div class="card-footer"><a href="#" class="text-white">Chi tiết ></a></div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-sm-6 mb-3">
                        <div class="card bg-danger">
                            <div class="card-body">
                                <div class="mr-5"><p>30 Tin nhắn mới</p></div>
                            </div>
                            <div class="card-footer"><a href="#" class="text-white">Chi tiết ></a></div>
                        </div>
                    </div>
                </div>

                <div class="breadcrumb row">
                    <p class="col-xl-10 col-sm-8">data table</p>
                    
                    <input class="col-xl-2 col-sm-4" type="text" placeholder="Search product">
                </div>

                <div>
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                               <th>Sản phẩm</th> 
                               <th>Số lượng</th>
                               <th>Ngày nhập</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${listProduct}" var="product"> 
                        	<tr>
                                <td>${product.name }</td>
                                <td>${product.numberInWare }</td>
                                <td>${product.dateInWare }</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
</body>