<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="/kh_exam/js/jquery.min.js"></script>
</head>
<body>
	<h2>지진/해일 대피소 안내</h2>
	<input type="button" value="실행" id="btn" />
	<div id="result"></div>
	<script>
		$("#btn").click(() => {
			$.ajax({
				url:'./data.xml',
				dataType : "xml",
				success: data => {
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
					table.html(header)
					.append(data)
					.appendTo($("#result"));
				},
				error : (xhr, txtStatus, err) => {
					console.log(xhr, textStatus, err);
				}
			})
		})
	</script>
</body>
</html>