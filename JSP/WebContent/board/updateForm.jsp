<%@page import="com.exam.vo.BoardVo"%>
<%@page import="com.exam.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int num = Integer.parseInt(request.getParameter("num"));
String pageNum = request.getParameter("pageNum");

BoardDao boardDao = BoardDao.getInstance();

BoardVo boardVo = boardDao.getBoardByNum(num);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 수정</h1>
	<hr>
	<form action="updatePro.jsp" method="post">
		<input type="hidden" name="num" value="<%=num %>">
		<table border="1">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="name" value="<%=boardVo.getName() %>" readonly></td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><input type="password" name="passwd" value="" required></td>
				
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="subject" value="<%=boardVo.getSubject() %>" required></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="13" cols="40" name="content" required><%=boardVo.getContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>