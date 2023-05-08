<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="/kh_exam/js/jquery.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
</head>
<body>
	<h2>지진/해일 대피소 안내</h2>
	<input type="button" value="실행" id="btn" />
	<div id="root"></div>
	<script>
		$("#btn").click(() => {
			$.ajax({
				url:'./data.xml',
				type : 'GET', // 방식
				dataType : "xml",
				error : function() { // 로딩 에러시
					alert('Error loading XML document');
				},
				success:  function(data) {
					//console.log(data);
					$(data)).find('row').each(function(){
						const sido_name = $(this).find('sido_name').text();
						const address = $(this).find('address').text();
						console.log(sido_name+", "+address);
					})
					const table = $("<table border='1'></table>")
					const header = "<tr>"
					+"<th>일련번호</th>"
					+"<th>시도명</th>"
					+"<th>시군구명</th>"
					+"<th>대피지구명</th>"
					+"<th>대피장소명</th>"
					+"<th>주소</th>"
					+"<th>경도</th>"
					+"<th>위도</th>"
					+"<th>수용가능인원(명)</th>"
					+"<th>해변으로부터거리</th>"
					+"<th>대피소분류명</th>"
					+"<th>내진적용여부</th>"
					+"<th>해발높이</th>"
					+"</tr>";
					table.append(header)
					$("#root").html(data);
				},
				error : (xhr, txtStatus, err) => {
					console.log(xhr, textStatus, err);
				}
			})
		})
	</script>
</body>
</html>