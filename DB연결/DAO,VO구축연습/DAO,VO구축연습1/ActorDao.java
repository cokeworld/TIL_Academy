package java0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// select, insert, update, delete sql문 수행 기능
// DAO(Data Access Object) : 데이터를 조회, 추가, 수정, 삭제 가능한 객체
public class ActorDao {

	public Connection getConnection() throws Exception {
		// DB 접속정보
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		Connection con = null;

		// 1단계. DB드라이버 클래스 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계. DB에 연결 시도. 연결 후 Connection객체를 리턴함.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);

		return con;

	}

	public List<ActorVo> getActors() {
		List<ActorVo> list = new ArrayList<>();
		String sql = "";

		// SELECT문 실행에 필요한 JDBC 객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			
			// 3단계. sql문장객체 준비
			sql = "SELECT * FROM actor ORDER BY actor_id DESC";
			pstmt = con.prepareStatement(sql);

			// 실행 후 SELECT 결과를 ResultSet으로 받음
			rs = pstmt.executeQuery(); // SELECT문 수행시 executeQuery() 호출

			// 4단계. ResultSet 데이터 꺼내서 사용 //next: 행을 옮김
			while (rs.next()) {
				ActorVo actorVo = new ActorVo();
				actorVo.setActorId(rs.getInt("actor_id"));
				actorVo.setFirstName(rs.getString("first_name"));
				actorVo.setLastName(rs.getString("last_name"));
				actorVo.setLastUpdate(rs.getTimestamp("last_update"));

				list.add(actorVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	ActorVo getActorById(int actorId) {
		ActorVo actorVo = null;
		String sql = "";

		// SELECT문 실행에 필요한 JDBC 객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3단계. sql문장객체 준비
			sql = "SELECT * FROM actor WHERE actor_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, actorId);

			// 실행 후 SELECT 결과를 ResultSet으로 받음
			rs = pstmt.executeQuery(); // SELECT문 수행시 executeQuery() 호출

			// 4단계. ResultSet 데이터 꺼내서 사용 //next: 행을 옮김
			if (rs.next()) {
				actorVo = new ActorVo();
				actorVo.setActorId(rs.getInt("actor_id"));
				actorVo.setFirstName(rs.getString("first_name"));
				actorVo.setLastName(rs.getString("last_name"));
				actorVo.setLastUpdate(rs.getTimestamp("last_update"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actorVo;
	}

	ActorVo getActorByFirstName(String firstName) {
		ActorVo actorVo = null;
		String sql = "";

		// SELECT문 실행에 필요한 JDBC 객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3단계. sql문장객체 준비
			sql = "SELECT * FROM actor WHERE first_name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);

			// 실행 후 SELECT 결과를 ResultSet으로 받음
			rs = pstmt.executeQuery(); // SELECT문 수행시 executeQuery() 호출

			// 4단계. ResultSet 데이터 꺼내서 사용 //next: 행을 옮김
			if (rs.next()) {
				actorVo = new ActorVo();
				actorVo.setActorId(rs.getInt("actor_id"));
				actorVo.setFirstName(rs.getString("first_name"));
				actorVo.setLastName(rs.getString("last_name"));
				actorVo.setLastUpdate(rs.getTimestamp("last_update"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actorVo;
	}
	
	
	public int addActor(ActorVo actorVo) {
		int count =0;
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql문 준비
			sql = "INSERT INTO actor (first_name, last_name, last_update) VALUES (?, ?, now())";			
			
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, actorVo.getFirstName()); // 1번째 ?마크
			pstmt.setString(2, actorVo.getLastName());
			
			// sql문장 실행
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 추가 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public int deleteActorByFirstName(String firstName) {
		int count =0;
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql문 준비
			sql = "DELETE FROM actor WHERE first_name = ?";			
			
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, firstName); // 1번째 ?마크

			// sql문장 실행
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			System.out.println(count + "개 행 삭제 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public void updateActorByFirstName(ActorVo actorVo) {
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			getConnection();
			
			//sql문 준비
			sql = "UPDATE actor ";			
			sql += "SET last_name = ? ";
			sql += "Where first_name = ?";
					
			// 3단계. sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			// 값 설정
			pstmt.setString(1, actorVo.getLastName());
			pstmt.setString(2, actorVo.getFirstName());
			
			// sql문장 실행
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE 문장 실행시 executeUpdate ()호출
			
			System.out.println(count + "개 행 변경 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// main class
	public static void main(String[] args) {

		System.out.println("=======getActors 테스트=======");
		ActorDao actorDao = new ActorDao();

		List<ActorVo> list = actorDao.getActors();

		for (ActorVo actorVo : list) {
			System.out.println(actorVo.toString());
		}
		System.out.println("요소의갯수: " + list.size());

		System.out.println("=======getActorById 테스트=======");
		ActorVo actorVo1 = actorDao.getActorById(203);
		System.out.println(actorVo1);

		if (actorVo1 == null) {
			System.out.println("해당 id가 없습니다.");
		} else {

		}

		System.out.println("=======addActor() 테스트=======");
		ActorVo actorVo3 = new ActorVo("두한", "김");
		ActorVo actorVo4 = new ActorVo("마적", "구");
		ActorVo actorVo5 = new ActorVo("두한", "강");
		
		actorDao.addActor(actorVo3);
		actorDao.addActor(actorVo4);
		actorDao.addActor(actorVo5);
		
		System.out.println("=======getActorByFirstName=======");
		ActorVo actorVoDB1 = actorDao.getActorByFirstName(actorVo3.getFirstName());
		ActorVo actorVoDB2 = actorDao.getActorByFirstName(actorVo4.getFirstName());
		System.out.println(actorVoDB1);
		System.out.println(actorVoDB2);
		
		System.out.println("========= updateActorByFirstName 테스트 ===============");
		
		actorVo3.setLastName("고"); // 성씨를 수정될 값으로 설정
		actorVo4.setLastName("서");
		
		actorDao.updateActorByFirstName(actorVo3);
		actorDao.updateActorByFirstName(actorVo4);
		
		System.out.println("========= update 결과 확인 ===============");
		
		ActorVo actorVoDb3 = actorDao.getActorByFirstName(actorVo3.getFirstName());
		ActorVo actorVoDb4 = actorDao.getActorByFirstName(actorVo4.getFirstName());
		
		System.out.println(actorVoDb3.toString());
		System.out.println(actorVoDb4.toString());
		
		System.out.println("========= delete 테스트 ===============");
		
		actorDao.deleteActorByFirstName(actorVo3.getFirstName());
		actorDao.deleteActorByFirstName(actorVo4.getFirstName());

	}

}
