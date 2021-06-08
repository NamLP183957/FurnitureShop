
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>

	<script src="https://www.gstatic.com/charts/loader.js"></script>
    <script type='text/javascript'>
        google.charts.load('current', { 'packages': ['line'] });
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {

            var data = new google.visualization.DataTable();
            data.addColumn('number', 'Day');
            data.addColumn('number', 'Guardians');

            data.addRows([
                [1, 37800 ],
                [2, 309000],
                [3, 25400]
            ]);

            data.addRow([
				<c:forEach items="${listProductDecorator}" var="product">
					[${product.month}, ${product.totalSell}],
				</c:forEach>
					[8, 400]
                ]
            );

            var options = {
                chart: {
                    title: 'Box Office Earnings in First Two Weeks of Opening',
                    subtitle: 'in millions of dollars (USD)'
                },
                width: 900,
                height: 500
            };

            var chart = new google.charts.Line(document.getElementById('linechart_material'));

            chart.draw(data, google.charts.Line.convertOptions(options));
        }

    </script>

	<div id='linechart_material' class="ml-5" style="width: 900px; height: 500px; float: left;"></div>
	
</body>