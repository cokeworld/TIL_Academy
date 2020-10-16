<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String) session.getAttribute("id");
if(id==null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
// request.setCharacterEncoding("utf-8");

String passwd = request.getParameter("passwd");

MemberDao memberDao = new MemberDao();
int userCheck = memberDao.userCheck(id, passwd);
if(userCheck == 1) {
	response.sendRedirect("updateForm.jsp");
	return;
} else {
	%>
<script>
	alert('wrong password!');
	history.back();
</script>	
	<%

}
%>


