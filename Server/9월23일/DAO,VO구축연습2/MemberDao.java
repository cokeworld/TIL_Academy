package java0923;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java0922.ActorVo;

public class MemberDao {

	public Connection getConnection() throws Exception {
		// DB 접속정보
		String dbUrl = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		Connection con = null;

		// 1단계. DB드라이버 클래스 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계. DB에 연결 시도. 연결 후 Connection객체를 리턴함.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);

		return con;

	}

//	// 전체 회원목록 가져오기
	public List<MemberVo> getMembers() {
		List<MemberVo> list = new ArrayList<>();
		String sql = "";

		// SELECT문 실행에 필요한 JDBC 객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3단계. sql문장객체 준비
			sql = "SELECT * FROM member ORDER BY id DESC";
			pstmt = con.prepareStatement(sql);

			// 실행 후 SELECT 결과를 ResultSet으로 받음
			rs = pstmt.executeQuery(); // SELECT문 수행시 executeQuery() 호출

			// 4단계. ResultSet 데이터 꺼내서 사용 //next: 행을 옮김
			while (rs.next()) {
				MemberVo memberVo = new MemberVo();
				memberVo.setId(rs.getString("id"));
				memberVo.setPasswd(rs.getInt("passwd"));
				memberVo.setName(rs.getString("name"));
				memberVo.setReg_date(rs.getTimestamp("reg_date"));

				list.add(memberVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

//  회원정보 1명 insert하기
//	addMember(...)
	public int addMember(MemberVo memberVo) {
		int count = 0;

		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();

			// sql문 준비
			sql = "INSERT INTO member (id, passwd, name, reg_date) VALUES (?, ?, ?, now())";

			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, memberVo.getId());
			pstmt.setInt(2, memberVo.getPasswd());
			pstmt.setString(3, memberVo.getName());

			// sql문장 실행
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 추가 됨");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

//	// 특정 id에 해당하는 회원 한명 가져오기
	MemberVo getMemberById(String id) {
		MemberVo memberVo = new MemberVo();
		String sql = "";

		// SELECT문 실행에 필요한 JDBC 객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3단계. sql문장객체 준비
			sql = "SELECT * FROM member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			// 실행 후 SELECT 결과를 ResultSet으로 받음
			rs = pstmt.executeQuery(); // SELECT문 수행시 executeQuery() 호출

			// 4단계. ResultSet 데이터 꺼내서 사용 //next: 행을 옮김
			while (rs.next()) {
				memberVo.setId(rs.getString("id"));
				memberVo.setPasswd(rs.getInt("passwd"));
				memberVo.setName(rs.getString("name"));
				memberVo.setReg_date(rs.getTimestamp("reg_date"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberVo;
	}

//	특정 id에 해당하는 회원정보 삭제하기 
	int deleteMemberById(String id) {
		int count = 0;
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql문 준비
			sql = "DELETE FROM member WHERE id = ?";			
			
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, id); // 1번째 ?마크

			// sql문장 실행
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 삭제 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
//	모든 회원 삭제하기
	int deleteAllMembers() {
		int count = 0;
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql문 준비
			sql = "DELETE FROM MEMBER;";			
			
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);

			// sql문장 실행
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 삭제 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
//	특정 id에 해당하는 회원의 이름 수정하기
	public void updateNameById(MemberVo memberVo) {
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql문 준비
			sql = "UPDATE member ";			
			sql += "SET name = ? ";
			sql += "Where id = ?";
					
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, memberVo.getName());
			pstmt.setString(2, memberVo.getId());
			
			// sql문장 실행
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			
			System.out.println(count + "개 행 변경 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
//	Test
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
//		beforeEach flush()
		memberDao.deleteAllMembers();
		
		System.out.println("=====addmember테스트=====");
		MemberVo memberVo1 = new MemberVo("1", 1111, "묵사발");
		MemberVo memberVo2 = new MemberVo("2", 2222, "김치전");
		MemberVo memberVo3 = new MemberVo("3", 3333, "막걸리");
		memberDao.addMember(memberVo1);
		memberDao.addMember(memberVo2);
		memberDao.addMember(memberVo3);
		System.out.println(memberDao.toString());

//		System.out.println("=====getMembers테스트=====");
//		List<MemberVo> list1 = memberDao.getMembers();
//		System.out.println(list1.toString());
//
//		System.out.println("=====getMemberById테스트=====");
//		MemberVo member1 = memberDao.getMemberById("ccc");
//		System.out.println(member1.toString());
//		
//		System.out.println("=====deleteMemberById테스트=====");
//		int deletedRow = memberDao.deleteMemberById("ccc");
//
//		System.out.println("=====deleteMemberById테스트확인=====");
//		List<MemberVo> list2 = memberDao.getMembers();
//		System.out.println(list2.toString());
//	
//		System.out.println("=====deleteAllMembers테스트=====");
//		memberDao.deleteAllMembers();
//		
//		System.out.println("=====deleteMemberById테스트확인=====");
//		List<MemberVo> list3 = memberDao.getMembers();
//		System.out.println(list3.toString());
		
		System.out.println("=====updateNameById테스트=====");
		
		memberVo2.setName("개명한이름1");
		memberVo3.setName("개명한이름2");
		
		memberDao.updateNameById(memberVo2);
		memberDao.updateNameById(memberVo3);
		
		System.out.println("=====updateMemberById테스트확인=====");
		List<MemberVo> list4 = memberDao.getMembers();
		System.out.println(list4.toString());
	
	
	}

}
