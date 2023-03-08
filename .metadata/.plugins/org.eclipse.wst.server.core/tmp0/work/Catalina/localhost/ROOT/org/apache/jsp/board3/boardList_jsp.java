/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-03-08 07:54:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/board3/../common/easyUI_common.jsp", Long.valueOf(1676345271053L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

/* 게시판 화면 */
// jsp에서 자바코드(스크립틀릿)와 html코드의 작성 위치는 문제가 되지 않는다.
// 왜냐하면 어차피 jsp는 서버에서 실행되고 그 결과가 text로 출력되는 것이므로
// html과 처리 시점이 완전 다르니까...
	boolean isOk = false;
	if(request.getParameter("isOk")!=null){
		isOk = Boolean.parseBoolean(request.getParameter("isOk"));
	}
	List<Map<String,Object>> boardList =
			(List<Map<String,Object>>)request.getAttribute("bList");
	int size = 0;
	if(boardList!=null){
		size = boardList.size();
	}		

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- <meta charset=\"UTF-8\"> 이것때문에 한글깨짐.-->\r\n");
      out.write("<title>MVC기반의 계층형 게시판 구현하기[webapp]</title>\r\n");

	StringBuilder path=new StringBuilder(request.getContextPath());//ë¬¼ë¦¬ì ì¸ ìì¹ë¥¼ ì°¾ìì£¼ëì ë¤.
	path.append("/");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("themes/default/easyui.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("themes/icon.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("demo/demo.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path.toString() );
      out.write("js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path.toString() );
      out.write("js/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	let g_no=0;//그리드에서 선택이 바뀔때 마다 변경된 값이 저장됨.\r\n");
      out.write("	let tb_value;//사용자가 입력한 문자열 담기\r\n");
      out.write("	let isOk = false;\r\n");
      out.write("	function dlgIns_save(){\r\n");
      out.write("		//폼 전송 처리함.\r\n");
      out.write("		$(\"#f_boardIns\").submit();\r\n");
      out.write("	}\r\n");
      out.write("	function dlgIns_close(){\r\n");
      out.write("		$(\"#dlg_boardIns\").dialog('close');\r\n");
      out.write("	}\r\n");
      out.write("	function getBoardList(){\r\n");
      out.write("		//alert(\"getBoardList호출\");\r\n");
      out.write("		//사용자가 선택한 콤보박스에 value가 담김 - b_title, or b_content or b_writer\r\n");
      out.write("		cb_value = user_combo;\r\n");
      out.write("		tb_value = $(\"#tb_search\").val();//사용자가 입력한 조건 검색 문자열\r\n");
      out.write("		console.log(\"콤보박스 값: \"+ cb_value+\", 사용자가 입력한 키워드: \"+tb_value);\r\n");
      out.write("		location.href = \"./boardList.sp?cb_search=\"+cb_value+\"&tb_search=\"+tb_value+\"&bm_reg=\"+v_date;\r\n");
      out.write("	}	\r\n");
      out.write("	function boardDetail(bm_no){\r\n");
      out.write("		location.href = \"./boardDetail.sp?bm_no=\"+bm_no;\r\n");
      out.write("	}\r\n");
      out.write("    function fileDown(fname){\r\n");
      out.write("		location.href=\"downLoad.jsp?bs_file=\"+fname;\r\n");
      out.write("    }	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	let user_combo=\"bm_title\";//제목|내용|작성자\r\n");
      out.write("	//전변 - javascript에서는 선언만 하고 선택을 하지 않았거나 값이 할당되지 않으면\r\n");
      out.write("	//그냥 null비교만 해서는 안된다.\r\n");
      out.write("	let v_date;//사용자가 선택한 날짜 정보 담기\r\n");
      out.write("//기본 날짜포맷을 재정의\r\n");
      out.write("	$.fn.datebox.defaults.formatter = function(date){\r\n");
      out.write("		var y = date.getFullYear();\r\n");
      out.write("		var m = date.getMonth()+1;\r\n");
      out.write("		var d = date.getDate();\r\n");
      out.write("		return y+'-'+(m<10? \"0\"+m:m)+'-'+(d<10? \"0\"+d:d);\r\n");
      out.write("	}\r\n");
      out.write("//날짜 포맷을 적용	\r\n");
      out.write("	$.fn.datebox.defaults.parser = function(s){\r\n");
      out.write("		var t = Date.parse(s);\r\n");
      out.write("		if (!isNaN(t)){\r\n");
      out.write("			return new Date(t);\r\n");
      out.write("		} else {\r\n");
      out.write("			return new Date();\r\n");
      out.write("		}\r\n");
      out.write("	}	\r\n");
      out.write("	$(document).ready(function(){//DOM구성이 완료된 시점-자바스크립트로 태그접근,설정변경,이미지\r\n");
      out.write("		$(\"#dg_board\").datagrid({\r\n");
      out.write("			onSelect:function(index,row){\r\n");
      out.write("				g_no = row.B_NO;\r\n");
      out.write("				console.log(\"g_no:\"+g_no);\r\n");
      out.write("			},\r\n");
      out.write("			onDblClickCell: function(index, field, value){\r\n");
      out.write("				if(\"B_TITLE\" == field){\r\n");
      out.write("					location.href=\"./boardDetail.pj?b_no=\"+g_no;\r\n");
      out.write("					g_no = 0;\r\n");
      out.write("					$(\"#dg_board\").datagrid('clearSelections')\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("		//등록 날짜 정보를 선택했을 때\r\n");
      out.write("		$('#db_date').datebox({\r\n");
      out.write("			//왜? undefinded이었나?\r\n");
      out.write("			onSelect: function(date){\r\n");
      out.write("				//alert(date.getFullYear()+\":\"+(date.getMonth()+1)+\":\"+date.getDate());\r\n");
      out.write("				const y = date.getFullYear();\r\n");
      out.write("				const m = date.getMonth()+1;\r\n");
      out.write("				const d = date.getDate();\r\n");
      out.write("				v_date = y+\"-\"+(m<10? \"0\"+m:m)+\"-\"+(d<10? \"0\"+d:d);\r\n");
      out.write("				//console.log(\"사용자가 선택한 날짜 ==> \"+v_date);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//검색 조건 콤보에 변경이 일어났을 때\r\n");
      out.write("		$('#cb_search').combobox({\r\n");
      out.write("			onChange:function(){\r\n");
      out.write("				user_combo = $(\"#cb_search\").combobox('getValue');//b_title or b_content or b_writer\r\n");
      out.write("				console.log(user_combo)\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		$('#tb_search').textbox({\r\n");
      out.write("			icons: [{\r\n");
      out.write("				iconCls:'icon-search',\r\n");
      out.write("				handler: function(e){\r\n");
      out.write("					console.log(\"검색\");\r\n");
      out.write("					//$(e.data.target).textbox('setValue', 'Something added!');\r\n");
      out.write("					$(\"#dg_board\").datagrid({\r\n");
      out.write("					});\r\n");
      out.write("				}\r\n");
      out.write("			}]\r\n");
      out.write("		});\r\n");
      out.write("	    /*===================== CRUD버튼 시작 ====================*/	   \r\n");
      out.write("		//조회버튼 클릭했을 때\r\n");
      out.write("	    $('#crudBtnSel').bind('click', function(){\r\n");
      out.write("	    	getBoardList();\r\n");
      out.write("	    });\r\n");
      out.write("		$('#crudBtnIns').bind('click', function(){\r\n");
      out.write("	        //alert('입력 버튼');\r\n");
      out.write("	        $(\"#dlg_boardIns\").dialog('open');\r\n");
      out.write("	    });	\r\n");
      out.write("		$('#crudBtnUpd').bind('click', function(){\r\n");
      out.write("	        alert('수정 버튼');\r\n");
      out.write("	    });	\r\n");
      out.write("		$('#crudBtnDel').bind('click', function(){\r\n");
      out.write("	        alert('삭제 버튼');\r\n");
      out.write("	    });			\r\n");
      out.write("	    /*===================== CRUD버튼 끝 ====================*/	   \r\n");
      out.write("	});///////////////// end of ready\r\n");
      out.write("</script>\r\n");
      out.write("<center>\r\n");
      out.write("    <table id=\"dg_board\" class=\"easyui-datagrid\" title=\"계층형 게시판 목록\" style=\"width:800px;height:550px\"\r\n");
      out.write("            data-options=\"rownumbers:true,singleSelect:true,toolbar:'#tb',footer:'#pn_board'\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th data-options=\"field:'BM_NO',width:60, align:'center', hidden:'true'\">글번호</th>\r\n");
      out.write("                <th data-options=\"field:'BM_TITLE',width:350\">제목</th>\r\n");
      out.write("                <th data-options=\"field:'BM_WRITER',width:80,align:'center'\">작성자</th>\r\n");
      out.write("                <th data-options=\"field:'BM_REG',width:100,align:'center'\">작성일</th>\r\n");
      out.write("                <th data-options=\"field:'BS_FILE',width:170\">첨부파일</th>\r\n");
      out.write("                <th data-options=\"field:'BM_HIT',width:60,align:'center'\">조회수</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");

	if(size==0){

      out.write(" 	\r\n");
      out.write("<script>\r\n");
      out.write("	$.messager.alert('Info','조회결과가 없습니다.');\r\n");
      out.write("</script>\r\n");

	}
	else if(size>0){
		for(int i=0;i<size;i++){
			if(size == i) break;
			Map<String,Object> rMap = boardList.get(i);

      out.write("	     \r\n");
      out.write("        	<tr>\r\n");
      out.write("        		<td>");
      out.print(1);
      out.write("</td>\r\n");
      out.write("        		<td>\r\n");
      out.write("<!-- 너 댓글이니? -->     	\r\n");
      out.write("<a href=\"javascript:boardDetail('");
      out.print(rMap.get("BM_NO") );
      out.write("')\" style=\"text-decoration:none;color:#000000\">        		\r\n");
      out.write("        		");
      out.print(rMap.get("BM_TITLE"));
      out.write("\r\n");
      out.write("</a>        		\r\n");
      out.write("        		</td>\r\n");
      out.write("        		<td>");
      out.print(rMap.get("BM_WRITER"));
      out.write("</td>\r\n");
      out.write("        		<td>");
      out.print(rMap.get("BM_REG"));
      out.write("</td>\r\n");
      out.write("        		<td>\r\n");
      out.write("        		");
      out.print("첨부파일 없음");
      out.write("	\r\n");
      out.write("        		</td>\r\n");
      out.write("        		<td>");
      out.print(rMap.get("BM_HIT"));
      out.write("</td>\r\n");
      out.write("        	</tr>\r\n");

		}// end of for
	}// end of else if

      out.write("        	\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("<!-- 툴바 추가 중 조건검색 화면 시작 -->\r\n");
      out.write("    <div id=\"tb\" style=\"padding:2px 5px;\">\r\n");
      out.write("                                    <!--\r\n");
      out.write("                                    req.getParameter(\"cb_search\"):String\r\n");
      out.write("                                    SELECT * FROM board_master_t\r\n");
      out.write("                                    WHERE ?(컬럼) LIKE %||?||%\r\n");
      out.write("                                     -->\r\n");
      out.write("        <select class=\"easyui-combobox\" id=\"cb_search\" name=\"cb_search\" panelHeight=\"auto\" style=\"width:100px\">\r\n");
      out.write("            <option selected>선택</option>\r\n");
      out.write("            <option value=\"bm_title\">제목</option>\r\n");
      out.write("            <option value=\"bm_content\">내용</option>\r\n");
      out.write("            <option value=\"bm_writer\">작성자</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <input id=\"tb_search\" name=\"tb_search\" class=\"easyui-textbox\" style=\"width:320px\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                작성일: <input id=\"db_date\" class=\"easyui-datebox\" name=\"bm_date\" style=\"width:110px\">\r\n");
      out.write("	<!-- 버튼 추가 화면 시작 -->\r\n");
      out.write("	    <div id=\"ft\" style=\"padding:2px 5px;\">\r\n");
      out.write("	        <a id=\"crudBtnSel\" href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"true\">조회</a>\r\n");
      out.write("	        <a id=\"crudBtnIns\" href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\">입력</a>\r\n");
      out.write("	        <a id=\"crudBtnUpd\" href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-reload\" plain=\"true\">수정</a>\r\n");
      out.write("	        <a id=\"crudBtnDel\" href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cut\" plain=\"true\">삭제</a>\r\n");
      out.write("	    </div>\r\n");
      out.write("	<!-- 버튼 추가 화면 끝 -->\r\n");
      out.write("    </div>\r\n");
      out.write("<!-- 툴바 추가 중 조건검색 화면 끝 -->\r\n");
      out.write("<!-- 페이지 네이션 추가 시작 -->\r\n");
      out.write("	<div style=\"display:table-cell;vertical-align:middle; width:800px; background:#efefef; height:30; border:1px solid #ccc;\">\r\n");
      out.write("		1 2 3 4 5 6 7 8 9 10\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- 페이지 네이션 추가   끝  -->\r\n");

	String gubun = request.getParameter("gubun");
	if("list".equals(gubun)){

      out.write("	\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("		getBoardList();\r\n");
      out.write("</script>	\r\n");
		
	}

      out.write("\r\n");
      out.write("<!-- 글입력 화면 추가 시작 -->\r\n");
      out.write("    <div id=\"dlg_boardIns\" footer=\"#tb_boardIns\" class=\"easyui-dialog\" title=\"글쓰기\" data-options=\"modal:true,closed:true\" style=\"width:600px;height:400px;padding:10px\">\r\n");
      out.write("        <!--  <form id=\"f_boardIns\" method=\"post\" enctype=\"multipart/form-data\" action=\"./boardInsert.pj\"> -->\r\n");
      out.write("        <form id=\"f_boardIns\" method=\"get\" action=\"./boardInsert.sp\">\r\n");
      out.write("        <!--\r\n");
      out.write("        		히든 속성은 화면에 보이지는 않지만 개발자가 필요로하는 값이다\r\n");
      out.write("        		등록부분과 수정 부분이 동시에 발생할 수도 있다 - 트랜잭션 처리가 필요함\r\n");
      out.write("        		트랜잭션 처리가 필요한 경우의 메소드 설계\r\n");
      out.write("        		 -->\r\n");
      out.write("	    <input type=\"hidden\" id=\"bm_no\" name=\"b_no\" value=\"0\">\r\n");
      out.write("	    <input type=\"hidden\" id=\"bm_group\" name=\"b_group\" value=\"0\">\r\n");
      out.write("	    <input type=\"hidden\" id=\"bm_pos\" name=\"b_pos\" value=\"0\">\r\n");
      out.write("	    <input type=\"hidden\" id=\"bm_step\" name=\"b_step\" value=\"0\">\r\n");
      out.write("        	<table>\r\n");
      out.write("        		<tr>\r\n");
      out.write("        			<td width=\"100px\">제&nbsp;&nbsp;&nbsp;목</td>\r\n");
      out.write("        			<td width=\"500px\"><input id=\"bm_title\" name=\"bm_title\" class=\"easyui-textbox\" data-options=\"width:'250px'\" required></td>\r\n");
      out.write("        		</tr>\r\n");
      out.write("        		<tr>\r\n");
      out.write("        			<td width=\"100px\">작&nbsp;성&nbsp;자</td>\r\n");
      out.write("        			<td width=\"500px\"><input id=\"bm_writer\" name=\"bm_writer\" class=\"easyui-textbox\" data-options=\"width:'150px'\" required></td>\r\n");
      out.write("        		</tr>\r\n");
      out.write("        		<tr>\r\n");
      out.write("        			<td width=\"100px\">내&nbsp;&nbsp;&nbsp;용</td>\r\n");
      out.write("        			<td width=\"500px\"><input id=\"bm_content\" name=\"bm_content\" class=\"easyui-textbox\" data-options=\"multiline:'true',width:'350px', height:'90px'\" required></td>\r\n");
      out.write("        		</tr>\r\n");
      out.write("        		<tr>\r\n");
      out.write("        			<td width=\"100px\">비&nbsp;&nbsp;&nbsp;번</td>\r\n");
      out.write("        			<td width=\"500px\"><input id=\"bm_pw\" name=\"bm_pw\" class=\"easyui-textbox\" data-options=\"width:'100px'\" required></td>\r\n");
      out.write("        		</tr>\r\n");
      out.write("        		<tr>\r\n");
      out.write("        			<td width=\"100px\">첨부파일</td>\r\n");
      out.write("        			<td width=\"500px\"><input id=\"bs_file\" name=\"bs_file\" class=\"easyui-filebox\" data-options=\"width:'350px'\"></td>\r\n");
      out.write("        		</tr>\r\n");
      out.write("        	</table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 다이얼로그 화면 버튼 추가 시작 -->\r\n");
      out.write("	<div id=\"tb_boardIns\">\r\n");
      out.write("	<a href=\"javascript:dlgIns_save()\" class=\"easyui-linkbutton\">저장</a>\r\n");
      out.write("	<a href=\"javascript:dlgIns_close()\" class=\"easyui-linkbutton\">닫기</a>\r\n");
      out.write("	</div>\r\n");
      out.write("    <!-- 다이얼로그 화면 버튼 추가  끝   -->\r\n");
      out.write("<!-- 글입력 화면 추가  끝   -->\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
