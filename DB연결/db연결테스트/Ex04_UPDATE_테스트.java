package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//UPDATE
public class Ex04_UPDATE_�׽�Ʈ {

	public static void main(String[] args) {

		// DB ��������
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		// UPDATE ����
		int actorId = 203; //���� ���� (where����)
		String lastName = "��"; //������ ��
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2�ܰ�. DB�� ���� �õ�. ���� �� Connection��ü�� ������.
			con = DriverManager.getConnection(dbUrl,dbId,dbPwd);
			
			//sql�� �غ�
			sql = "UPDATE actor ";			
			sql += "SET last_name = ? ";
			sql += "Where actor_id = ?";
					
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, lastName);
			pstmt.setInt(2, actorId);
			
			// sql���� ����
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� ���� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
