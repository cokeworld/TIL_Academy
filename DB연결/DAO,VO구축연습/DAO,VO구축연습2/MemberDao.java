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
		// DB ��������
		String dbUrl = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		Connection con = null;

		// 1�ܰ�. DB����̹� Ŭ���� �ε�
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2�ܰ�. DB�� ���� �õ�. ���� �� Connection��ü�� ������.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);

		return con;

	}

//	// ��ü ȸ����� ��������
	public List<MemberVo> getMembers() {
		List<MemberVo> list = new ArrayList<>();
		String sql = "";

		// SELECT�� ���࿡ �ʿ��� JDBC ��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3�ܰ�. sql���尴ü �غ�
			sql = "SELECT * FROM member ORDER BY id DESC";
			pstmt = con.prepareStatement(sql);

			// ���� �� SELECT ����� ResultSet���� ����
			rs = pstmt.executeQuery(); // SELECT�� ����� executeQuery() ȣ��

			// 4�ܰ�. ResultSet ������ ������ ��� //next: ���� �ű�
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

//  ȸ������ 1�� insert�ϱ�
//	addMember(...)
	public int addMember(MemberVo memberVo) {
		int count = 0;

		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();

			// sql�� �غ�
			sql = "INSERT INTO member (id, passwd, name, reg_date) VALUES (?, ?, ?, now())";

			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, memberVo.getId());
			pstmt.setInt(2, memberVo.getPasswd());
			pstmt.setString(3, memberVo.getName());

			// sql���� ����
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� �߰� ��");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

//	// Ư�� id�� �ش��ϴ� ȸ�� �Ѹ� ��������
	MemberVo getMemberById(String id) {
		MemberVo memberVo = new MemberVo();
		String sql = "";

		// SELECT�� ���࿡ �ʿ��� JDBC ��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();

			// 3�ܰ�. sql���尴ü �غ�
			sql = "SELECT * FROM member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			// ���� �� SELECT ����� ResultSet���� ����
			rs = pstmt.executeQuery(); // SELECT�� ����� executeQuery() ȣ��

			// 4�ܰ�. ResultSet ������ ������ ��� //next: ���� �ű�
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

//	Ư�� id�� �ش��ϴ� ȸ������ �����ϱ� 
	int deleteMemberById(String id) {
		int count = 0;
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql�� �غ�
			sql = "DELETE FROM member WHERE id = ?";			
			
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, id); // 1��° ?��ũ

			// sql���� ����
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� ���� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
//	��� ȸ�� �����ϱ�
	int deleteAllMembers() {
		int count = 0;
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql�� �غ�
			sql = "DELETE FROM MEMBER;";			
			
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);

			// sql���� ����
			count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			System.out.println(count + "�� �� ���� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
//	Ư�� id�� �ش��ϴ� ȸ���� �̸� �����ϱ�
	public void updateNameById(MemberVo memberVo) {
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			//sql�� �غ�
			sql = "UPDATE member ";			
			sql += "SET name = ? ";
			sql += "Where id = ?";
					
			// 3�ܰ�. sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			// �� ����
			pstmt.setString(1, memberVo.getName());
			pstmt.setString(2, memberVo.getId());
			
			// sql���� ����
			int count = pstmt.executeUpdate(); // INSERT, UPADATE, DELETE ���� ����� executeUpdate ()ȣ��
			
			System.out.println(count + "�� �� ���� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
//	Test
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
//		beforeEach flush()
		memberDao.deleteAllMembers();
		
		System.out.println("=====addmember�׽�Ʈ=====");
		MemberVo memberVo1 = new MemberVo("1", 1111, "�����");
		MemberVo memberVo2 = new MemberVo("2", 2222, "��ġ��");
		MemberVo memberVo3 = new MemberVo("3", 3333, "���ɸ�");
		memberDao.addMember(memberVo1);
		memberDao.addMember(memberVo2);
		memberDao.addMember(memberVo3);
		System.out.println(memberDao.toString());

//		System.out.println("=====getMembers�׽�Ʈ=====");
//		List<MemberVo> list1 = memberDao.getMembers();
//		System.out.println(list1.toString());
//
//		System.out.println("=====getMemberById�׽�Ʈ=====");
//		MemberVo member1 = memberDao.getMemberById("ccc");
//		System.out.println(member1.toString());
//		
//		System.out.println("=====deleteMemberById�׽�Ʈ=====");
//		int deletedRow = memberDao.deleteMemberById("ccc");
//
//		System.out.println("=====deleteMemberById�׽�ƮȮ��=====");
//		List<MemberVo> list2 = memberDao.getMembers();
//		System.out.println(list2.toString());
//	
//		System.out.println("=====deleteAllMembers�׽�Ʈ=====");
//		memberDao.deleteAllMembers();
//		
//		System.out.println("=====deleteMemberById�׽�ƮȮ��=====");
//		List<MemberVo> list3 = memberDao.getMembers();
//		System.out.println(list3.toString());
		
		System.out.println("=====updateNameById�׽�Ʈ=====");
		
		memberVo2.setName("�������̸�1");
		memberVo3.setName("�������̸�2");
		
		memberDao.updateNameById(memberVo2);
		memberDao.updateNameById(memberVo3);
		
		System.out.println("=====updateMemberById�׽�ƮȮ��=====");
		List<MemberVo> list4 = memberDao.getMembers();
		System.out.println(list4.toString());
	
	
	}

}
