<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList" %>    
<%@ page import="model.vo.MemberVO" %>    
<%
	List<MemberVO> memList = 
					new ArrayList<MemberVO>();
	MemberVO mvo = new MemberVO();
	mvo.setMem_id("test");
	mvo.setMem_name("홍길동");
	memList.add(mvo);
	mvo = new MemberVO();
	mvo.setMem_id("haha");
	mvo.setMem_name("이순신");
	memList.add(mvo);
	request.setAttribute("rmemList", memList);
	session.setAttribute("smemList", memList);
	session.setAttribute("sname","이성계");
	RequestDispatcher view = 
			request.getRequestDispatcher("b1.jsp?mem_post=123&mem_name=유재석");
	view.forward(request,response);
%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request와 session에 담기</title>
</head>
<body>

</body>
</html>