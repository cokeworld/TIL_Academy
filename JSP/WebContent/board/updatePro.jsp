<%@page import="javafx.scene.web.WebHistory"%>
<%@page import="com.exam.vo.BoardVo"%>
<%@page import="com.exam.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

//VO 객체 준비
BoardVo boardVo = new BoardVo();

//파라미터값 찾아서 VO에 저장
boardVo.setNum(Integer.parseInt(request.getParameter("num")));
boardVo.setName(request.getParameter("name"));
boardVo.setPasswd(request.getParameter("passwd")); // 본인확인용.
boardVo.setSubject(request.getParameter("subject"));
boardVo.setContent(request.getParameter("content"));

//DAO 객체 준비
BoardDao boardDao = BoardDao.getInstance();

boolean isPassOk = boardDao.isPasswdOk(boardVo.getNum(), boardVo.getPasswd());
if(isPassOk) {
	boardDao.updateBoard(boardVo);
	response.sendRedirect("content.jsp?num=" + boardVo.getNum());
} else {
%>
	<script>
	alert("비밀번호가 틀렸습니다.");
	history.back();
	</script>
<%
}
%>	
