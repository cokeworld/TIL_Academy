<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<hr>
	<form action="">
		아이디: <input type="text" name="id" value=""><br>
		패스워드: <input type="password" name="passwd"><br>
		이름: <input type="text" name="name"><br>
		나이: <input type="number" name="age" min="0" max="200"><br>
		성별: <input type="radio" name="gender" value="남">남성
			  <input type="radio" name="gender" value="여">여성<br>
		이메일: <input type="email" name="email"><br>
		<input type="submit" value="회원수정">
	</form>
	
</body>
</html>




