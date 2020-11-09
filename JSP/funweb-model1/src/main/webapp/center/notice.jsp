<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.exam.vo.NoticeVo"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.NoticeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- head 컨텐트 영역 --%>
<jsp:include page="/include/headContent.jsp" />

<link href="/css/subpage.css" rel="stylesheet" type="text/css"  media="all">
<style>
a.active {
	font-weight: bold;
}
</style>
</head>
<%
// DAO 객체 준비
NoticeDao noticeDao = NoticeDao.getInstance();

// 전체 글갯수 가져오기
int count = noticeDao.getCountAll();

// 한페이지당 보여줄 글갯수 설정
int pageSize = 10;

// 사용자가 요청하는 페이지번호 파라미터값 가져오기
String strPageNum = request.getParameter("pageNum");
// 사용자 요청 페이지번호 정보가 없을때(null 일때)
// 기본 요청 페이지번호를 1페이지로 설정하기
strPageNum = (strPageNum == null) ? "1" : strPageNum;
// 사용자 요청 페이지를 정수로 변환
int pageNum = Integer.parseInt(strPageNum);

// 가져올 첫행번호 구하기
int startRow = (pageNum - 1) * pageSize;

// 글목록 가져오기
List<NoticeVo> noticeList = null;
if (count > 0) {
	noticeList = noticeDao.getNotices(startRow, pageSize);
}
%>
<body>
<div id="wrap">
	<%-- header 영역 --%>
	<jsp:include page="/include/topHeader.jsp" />

	<div class="clear"></div>
	<div id="sub_img_center"></div>
	
	<div class="clear"></div>
	<%-- nav 영역 --%>
	<jsp:include page="/include/submenuBoard.jsp" />
	
	<article>
		
	<h1>텍스트 게시판 [글갯수: <%=count %>]</h1>
		
	<table id="notice">
		<tr>
			<th scope="col" class="tno">글번호</th>
			<th scope="col" class="ttitle">글제목</th>
			<th scope="col" class="twrite">작성자</th>
			<th scope="col" class="tdate">작성일자</th>
			<th scope="col" class="tread">조회수</th>
		</tr>
		<%
		if (count > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			
			for (NoticeVo noticeVo : noticeList) {
		%>
				<tr>
					<td><%=noticeVo.getNum() %></td>
					<td class="left">
						<%
						if (noticeVo.getReLev() > 0) { // 답글이면
							%>
							<img src="../images/level.gif" width="<%=noticeVo.getReLev() * 15 %>" height="13">
							<img src="../images/re.gif">
							<%
						}
						%>
						<a href="content.jsp?num=<%=noticeVo.getNum() %>&pageNum=<%=pageNum %>"><%=noticeVo.getSubject() %></a>
					</td>
					<td><%=noticeVo.getId() %></td>
					<td><%=sdf.format(noticeVo.getRegDate()) %></td>
					<td><%=noticeVo.getReadcount() %></td>
				</tr>
				<%
			}
		} else { // count == 0
			%>
			<tr>
				<td colspan="5">게시판 글 없음</td>
			</tr>
			<%
		}
		%>
	</table>

	<div id="table_search">
		<form action="">
			<select name="category">
				<option value="subject">글제목</option>
				<option value="content">글내용</option>
				<option value="id">작성자ID</option>
			</select>
			<input type="text" class="input_box" name="search"> 
			<input type="submit" value="검색" class="btn">
			
			<%
			// 로그인 했을때만 [글쓰기] 버튼 보이기
			String id = (String) session.getAttribute("id");
			if (id != null) {
				%>
				<input type="button" value="글쓰기" class="btn" onclick="location.href='writeForm.jsp?pageNum=<%=pageNum %>'">
				<%
			}
			%>
		</form>
	</div>
	
	<div class="clear"></div>
	<div id="page_control">
	<%
	// 글갯수가 0보다 크면 페이지블록 계산해서 출력하기
	if (count > 0) {
		// 총 필요한 페이지 갯수 구하기
		// 글50개. 한화면에보여줄글 10개 => 50/10 = 5 
		// 글55개. 한화면에보여줄글 10개 => 55/10 = 5 + 1페이지(나머지존재) => 6
		int pageCount = (count / pageSize) + (count % pageSize == 0 ? 0 : 1);
		//int pageCount = (int) Math.ceil((double) count / pageSize);
		
		// 한 화면에 보여줄 페이지갯수 설정
		int pageBlock = 5;
		
		// 화면에 보여줄 시작페이지번호 구하기
		// 1~5          6~10          11~15          16~20       ...
		// 1~5 => 1     6~10 => 6     11~15 => 11    16~20 => 16
		int startPage = ((pageNum / pageBlock) - (pageNum % pageBlock == 0 ? 1 : 0)) * pageBlock + 1;
		
		// 화면에 보여줄 끝페이지번호 구하기
		int endPage = startPage + pageBlock - 1;
		if (endPage > pageCount) {
			endPage = pageCount;
		}
		
		// [이전]
		if (startPage > pageBlock) {
			%>
			<a href="notice.jsp?pageNum=<%=startPage - pageBlock %>">[이전]</a>
			<%
		}
		
		// 1 ~ 5
		for (int i=startPage; i<=endPage; i++) {
			if (i == pageNum) {
				%>
				<a href="notice.jsp?pageNum=<%=i %>" class="active">[<%=i %>]</a>
				<%
			} else {
				%>
				<a href="notice.jsp?pageNum=<%=i %>">[<%=i %>]</a>
				<%
			}
		} // for
		
		
		// [다음]
		if (endPage < pageCount) {
			%>
			<a href="notice.jsp?pageNum=<%=startPage + pageBlock %>">[다음]</a>
			<%
		}
	}
	%>
	</div>
		
	</article>
    
	<div class="clear"></div>
	<%-- footer 영역 --%>
	<jsp:include page="/include/bottomFooter.jsp" />
</div>

</body>
</html>   

    