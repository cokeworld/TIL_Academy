package db연결1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("=== ���α׷� ���� ===");
		// DB���� �׽�Ʈ
		
		// DB��������
		String dbUrl = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		Connection con = null;
		try {
			// MySQL�� DB����̹� Ŭ������ ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			// �޸𸮿� �ε��� DB����̹� Ŭ������ �̿��ؼ� DB�� ���� �õ�.
			// ������ �����ϸ� Connection ���� ��ü�� ��������.
			con = DriverManager.getConnection(dbUrl, dbId, dbPwd);
			System.out.println("DB���� ����!");
		} catch (Exception e) {
			System.out.println("DB���� ����...");
			e.printStackTrace();
		}
		System.out.println("=== ���α׷� ���� ===");
	} // main

}
