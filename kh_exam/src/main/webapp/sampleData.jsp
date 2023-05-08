<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
</head>
<body>
	<div id="root"></div>
	<script type="text/javascript">
		$.ajax({
			url : './apiExplorer/data.xml', 
			type : 'GET', 
			dataType : 'xml', 
			error : function() { 
				alert('Error loading XML document');
			},
			success : function(item) {
				let template = '<table border="1"><tr><th>ID</th><th>시도</th><th>시군구</th><th>비고</th><th>대피소명</th><th>주소</th><th>경도</th><th>위도</th><th>수용가능인원</th><th>길이</th><th>대피소구분</th><th>지진영향</th><th>높이</th></tr>';
				$(item).find('row').each(function() { 
					const id = $(this).find("id").text();
					const sido_name = $(this).find("sido_name").text();
					const sigungu_name = $(this).find("sigungu_name").text();
					const remarks = $(this).find("remarks").text();
					const shel_nm = $(this).find("shel_nm").text();
					const address = $(this).find("address").text();
					const lon = $(this).find("lon").text();
					const lat = $(this).find("lat").text();
					const shel_av = $(this).find("shel_av").text();
					const lenth = $(this).find("lenth").text();
					const shel_div_type = $(this).find("shel_div_type").text();
					const seismic = $(this).find("seismic").text();
					const height = $(this).find("height").text();
					
					template += '<tr><td>'+id+'</td><td>'+sido_name+'</td><td>'+sigungu_name+'</td><td>'+remarks+'</td><td>'+shel_nm+'</td><td>'+address+'</td><td>'+lon+'</td><td>'+lat+'</td><td>'+shel_av+'</td><td>'+lenth+'</td><td>'+shel_div_type+'</td><td>'+seismic+'</td><td>'+height+'</td></tr>';
				});
				template += '</table>';
				$("#root").html(template); 
			}
		});
</script>
</body>
</html>