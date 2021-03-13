package db연결1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex5 {

	public static void main(String[] args) {
		// DELETE�� �����ϱ�

		// DB��������
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		// delete �� ���� actorId
		int actorId = 202; // ���� ���� (where����)
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
			con = DriverManager.getConnection(dbUrl, dbId, dbPwd);
			
			// sql�� �غ�
			sql  = "DELETE FROM actor ";
			sql += "WHERE actor_id = ? ";
			
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setInt(1, actorId);
			
			// sql���� ����
			int count = pstmt.executeUpdate(); // INSERT,UPDATE,DELETE���� ����� ȣ��
			
			System.out.println(count + "�� ���� ������.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main

}
