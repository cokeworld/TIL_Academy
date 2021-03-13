package db연결2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	private Connection getConnection() throws Exception {
		// ����� MySQL DB
		// mysql://bec477009e8b36:112f7808@us-cdbr-east-02.cleardb.com/heroku_2a9d67c8b09e7af?reconnect=true&useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul
		
		// �����DB id : bec477009e8b36
		// �����DB pw : 112f7808
		// �����DB hostname : us-cdbr-east-02.cleardb.com
		// �����DB ��Ű���̸� : heroku_2a9d67c8b09e7af
		
		
		
		// DB��������
		String dbUrl = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		Connection con = null;
		
		// 1�ܰ�. DB����̹� Ŭ���� �ε�
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);
		return con;
	} // getConnection()
	
	private void close(Connection con, PreparedStatement pstmt) {
		close(con, pstmt, null);
	}
	
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // close()
	

	// ȸ������ 1�� insert�ϱ�
	public void addMember(MemberVo memberVo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "";
			sql += "INSERT INTO member (id, passwd, name, reg_date) ";
			sql += "VALUES (?, ?, ?, now()) ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPasswd());
			pstmt.setString(3, memberVo.getName());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ���� �߻����ο� ������� ������ �����۾� ������.
			// try��Ͽ��� ���� ��ü�� �����ϴ� �۾��� �ַ� ��
			close(con, pstmt);
		}
	} // addMember()
	
	
	// ��ü ȸ����� ��������
	public List<MemberVo> getAllMembers() {
		List<MemberVo> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MemberVo memberVo = new MemberVo();
				memberVo.setId(rs.getString("id"));
				memberVo.setPasswd(rs.getString("passwd"));
				memberVo.setName(rs.getString("name"));
				memberVo.setRegDate(rs.getTimestamp("reg_date"));
				
				list.add(memberVo);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	} // getAllMembers()
	
	
	// Ư��id�� �ش��ϴ� ȸ�� 1�� ��������
	public MemberVo getMemberById(String id) {
		MemberVo memberVo = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				memberVo = new MemberVo();
				memberVo.setId(rs.getString("id"));
				memberVo.setPasswd(rs.getString("passwd"));
				memberVo.setName(rs.getString("name"));
				memberVo.setRegDate(rs.getTimestamp("reg_date"));
			} // if
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return memberVo;
	} // getMemberById()
	
	// Ư��id�� �ش��ϴ� ȸ���� �̸� �����ϱ�
	public void update(MemberVo memberVo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "";
			sql += "UPDATE member ";
			sql += "SET name = ? ";
			sql += "WHERE id = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVo.getName());
			pstmt.setString(2, memberVo.getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ���� �߻����ο� ������� ������ �����۾� ������.
			// try��Ͽ��� ���� ��ü�� �����ϴ� �۾��� �ַ� ��
			close(con, pstmt);
		}
	} // addMember()
	
	// Ư��id�� �ش��ϴ� ȸ�� 1�� �����ϱ�
	public void deleteById(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "";
			sql += "DELETE FROM member WHERE id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
	} // deleteById()
	
	
	// ��� ȸ�� �����ϱ�
	public void deleteAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "";
			sql += "DELETE FROM member ";
			pstmt = con.prepareStatement(sql);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
	} // deleteAll()
	
	
	public static void main(String[] args) {
		
		// MemberDao ��ü �غ�
		MemberDao memberDao = new MemberDao();
		
		memberDao.deleteAll();
		
		System.out.println("======== insert �׽�Ʈ =========");
		
		for (int i=0; i<5; i++) {
			MemberVo memberVo = new MemberVo("aaa"+i, "1234", "ȫ�浿"+i);
			memberDao.addMember(memberVo);
		}
		
		List<MemberVo> list = memberDao.getAllMembers();
		for (MemberVo memberVo : list) {
			System.out.println(memberVo);
		}
		
		System.out.println("======== getMemberById �׽�Ʈ =========");
		
		MemberVo memberVo = memberDao.getMemberById("aaa0");
		System.out.println(memberVo);
		
		System.out.println("======== update �׽�Ʈ =========");
		
		memberVo.setName("�̼���"); // ������ �̸��� ����
		memberDao.update(memberVo);
		
		MemberVo getMemberVo = memberDao.getMemberById("aaa0");
		System.out.println(getMemberVo);
		
		System.out.println("======== deleteById �׽�Ʈ =========");
		
		memberDao.deleteById("aaa0");
		
		MemberVo getMemberVo2 = memberDao.getMemberById("aaa0");
		System.out.println(getMemberVo2);
		
	} // main
	
}






