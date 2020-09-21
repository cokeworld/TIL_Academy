package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex05_DELETE_테스트 {

	public static void main(String[] args) {

		// DB 접속정보
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		// DELETE 할 행의 actor_Id
		int actorId = 202; //삭제 기준 (where조건)
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계. DB드라이버 클래스 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계. DB에 연결 시도. 연결 후 Connection객체를 리턴함.
			con = DriverManager.getConnection(dbUrl,dbId,dbPwd);
			
			//sql문 준비
			sql = "DELETE FROM actor ";			
			sql += "WHERE actor_id = ?";
					
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setInt(1, actorId);
			
			// sql문장 실행
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 삭제 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
