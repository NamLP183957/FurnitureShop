
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<div class="col-xl-9 col-sm-8 ml-5 mt-4 row" style="float: left;">
		<script src="https://www.gstatic.com/charts/loader.js"></script>
		<script type="text/javascript">
			google.charts.load('current', {
				'packages' : [ 'line' ]
			});
			google.charts.setOnLoadCallback(drawChart);

			function drawChart() {

				var data = new google.visualization.DataTable();
				data.addColumn('number', 'Tháng');
				data.addColumn('number', 'Mẫu thiết kế');
				data.addColumn('number', 'Sản phẩm trang trí');

				data.addRows([ [ 1, 37800, 30000 ], [ 2, 30900, 37000 ],
						[ 3, 29400, 29500 ], [ 4, 30005, 24000 ],
						[ 5, 24004, 28000 ], [ 6, 27500, 22500 ] ]);

				var options = {
					chart : {
						title : 'Thống kế sản phẩm trong năm',
						subtitle : 'Đơn vị vnd'
					},
					width : 1000,
					height : 600
				};

				var chart = new google.charts.Line(document
						.getElementById('linechart_material'));

				chart.draw(data, google.charts.Line.convertOptions(options));
			}
		</script>
		<div id='linechart_material' class="col-sm-12 col-sm-12"></div>
		<!-- ------------------------------------------------------------------- -->
		<script type="text/javascript">
			google.charts.load("current", {
				packages : [ "corechart" ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Loai', 'Don hang' ], 
						[ 'Thiết kế phòng khách', 2 ],
						[ 'Thiết kế phòng ngủ', 2 ],
						[ 'Thiết kế phòng bếp', 1 ],
						[ 'Thiết kế biệt thự', 2 ],
						[ 'Thiết kế khách sạn', 4 ],
						[ 'Thiết kế chung cư', 0 ], ]);

				var options = {
					title : 'Thống kê đơn hàng mẫu thiết kế',
					pieHole : 0.2,
				};

				var chart = new google.visualization.PieChart(document
						.getElementById('donutchart'));
				chart.draw(data, options);
			}
		</script>
		<div id="donutchart" class="col-sm-9 col-lg-9"
			style="float: left; height: 400px;"></div>
		<!-- ------------------------------------------------------------------------- -->
		<script type="text/javascript">
			google.charts.load("current", {
				packages : [ "corechart" ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Loai', 'Don hang' ],
						[ 'Dồng hồ', 200 ],
						[ 'Thảm trải nhà', 150 ],
						[ 'Bàn ghế', 20 ]]);

				var options = {
					title : 'Thống kê đơn hàng đồ nội thất',
					pieHole : 0.2,
				};

				var chart = new google.visualization.PieChart(document
						.getElementById('decoratorChart'));
				chart.draw(data, options);
			}
		</script>
		<div id="decoratorChart" class="col-sm-9 col-lg-9"
			style="float: left; height: 400px;"></div>
	</div>

</body>