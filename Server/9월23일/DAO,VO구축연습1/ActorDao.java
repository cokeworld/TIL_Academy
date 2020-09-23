package java0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// select, insert, update, delete sql�� ���� ���
// DAO(Data Access Object) : �����͸� ��ȸ, �߰�, ����, ���� ������ ��ü
public class ActorDao {

	public Connection getConnection() throws Exception {
		// DB ��������
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		Connection con = null;

		// 1�ܰ�. DB����̹� Ŭ���� �ε�
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2�ܰ�. DB�� ���� �õ�. ���� �� Connection��ü�� ������.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);

		return con;

	}

	public List<ActorVo> getActors() {
		List<ActorVo> list = new ArrayList<>();
		String sql = "";

		// SELECT�� ���࿡ �ʿ��� JDBC ��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			
			// 3�ܰ�. sql���尴ü �غ�
			sql = "SELECT * FROM actor ORDER BY actor_id DESC";
			pstmt = con.prepareStatement(sql);

			// ���� �� SELECT ����� ResultSet���� ����
			rs = pstmt.executeQuery(); // SELECT�� ����� executeQuery() ȣ��

			// 4�ܰ�. ResultSet ������ ������ ��� //next: ���� �ű�
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

		// SELECT�� ���࿡ �ʿ��� JDBC ��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3�ܰ�. sql���尴ü �غ�
			sql = "SELECT * FROM actor WHERE actor_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, actorId);

			// ���� �� SELECT ����� ResultSet���� ����
			rs = pstmt.executeQuery(); // SELECT�� ����� executeQuery() ȣ��

			// 4�ܰ�. ResultSet ������ ������ ��� //next: ���� �ű�
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

		// SELECT�� ���࿡ �ʿ��� JDBC ��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3�ܰ�. sql���尴ü �غ�
			sql = "SELECT * FROM actor WHERE first_name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);

			// ���� �� SELECT ����� ResultSet���� ����
			rs = pstmt.executeQuery(); // SELECT�� ����� executeQuery() ȣ��

			// 4�ܰ�. ResultSet ������ ������ ��� //next: ���� �ű�
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
			
			//sql�� �غ�
			sql = "INSERT INTO actor (first_name, last_name, last_update) VALUES (?, ?, now())";			
			
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, actorVo.getFirstName()); // 1��° ?��ũ
			pstmt.setString(2, actorVo.getLastName());
			
			// sql���� ����
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� �߰� ��");
			
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
			
			//sql�� �غ�
			sql = "DELETE FROM actor WHERE first_name = ?";			
			
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, firstName); // 1��° ?��ũ

			// sql���� ����
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� ���� ��");
			
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
			
			//sql�� �غ�
			sql = "UPDATE actor ";			
			sql += "SET last_name = ? ";
			sql += "Where first_name = ?";
					
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, actorVo.getLastName());
			pstmt.setString(2, actorVo.getFirstName());
			
			// sql���� ����
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			
			System.out.println(count + "�� �� ���� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// main class
	public static void main(String[] args) {

		System.out.println("=======getActors �׽�Ʈ=======");
		ActorDao actorDao = new ActorDao();

		List<ActorVo> list = actorDao.getActors();

		for (ActorVo actorVo : list) {
			System.out.println(actorVo.toString());
		}
		System.out.println("����ǰ���: " + list.size());

		System.out.println("=======getActorById �׽�Ʈ=======");
		ActorVo actorVo1 = actorDao.getActorById(203);
		System.out.println(actorVo1);

		if (actorVo1 == null) {
			System.out.println("�ش� id�� �����ϴ�.");
		} else {

		}

		System.out.println("=======addActor() �׽�Ʈ=======");
		ActorVo actorVo3 = new ActorVo("����", "��");
		ActorVo actorVo4 = new ActorVo("����", "��");
		ActorVo actorVo5 = new ActorVo("����", "��");
		
		actorDao.addActor(actorVo3);
		actorDao.addActor(actorVo4);
		actorDao.addActor(actorVo5);
		
		System.out.println("=======getActorByFirstName=======");
		ActorVo actorVoDB1 = actorDao.getActorByFirstName(actorVo3.getFirstName());
		ActorVo actorVoDB2 = actorDao.getActorByFirstName(actorVo4.getFirstName());
		System.out.println(actorVoDB1);
		System.out.println(actorVoDB2);
		
		System.out.println("========= updateActorByFirstName �׽�Ʈ ===============");
		
		actorVo3.setLastName("��"); // ������ ������ ������ ����
		actorVo4.setLastName("��");
		
		actorDao.updateActorByFirstName(actorVo3);
		actorDao.updateActorByFirstName(actorVo4);
		
		System.out.println("========= update ��� Ȯ�� ===============");
		
		ActorVo actorVoDb3 = actorDao.getActorByFirstName(actorVo3.getFirstName());
		ActorVo actorVoDb4 = actorDao.getActorByFirstName(actorVo4.getFirstName());
		
		System.out.println(actorVoDb3.toString());
		System.out.println(actorVoDb4.toString());
		
		System.out.println("========= delete �׽�Ʈ ===============");
		
		actorDao.deleteActorByFirstName(actorVo3.getFirstName());
		actorDao.deleteActorByFirstName(actorVo4.getFirstName());

	}

}
