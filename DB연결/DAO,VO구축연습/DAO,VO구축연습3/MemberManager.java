package db연결2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MemberManager extends JFrame {
	
	private JPanel p1, p2, p3, p4, panelWest, contentPane;
	private JTextField tfId, tfPasswd, tfName;
	private JButton btnTotal, btnAdd, btnDel;
	private JTable table;
	
	private MemberDao memberDao = new MemberDao();
	
	public MemberManager() {
		setTitle("������ ȸ������ ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ġ GridLayout(3,1)
		panelWest = new JPanel(new GridLayout(3, 1));
		// �г� p1   ���̵�  tfId
		p1 = new JPanel();
		p1.add(new JLabel("���̵�"));
		p1.add(tfId = new JTextField(10));
		panelWest.add(p1);
		// �г� p2   �н�����  tfPasswd
		p2 = new JPanel();
		p2.add(new JLabel("�н�����"));
		p2.add(tfPasswd = new JTextField(10));
		panelWest.add(p2);
		// �г� p3   �н�����  tfPasswd
		p3 = new JPanel();
		p3.add(new JLabel("�̸�"));
		p3.add(tfName = new JTextField(10));
		panelWest.add(p3);
		
		// �г� p4 ��ư���� - ��ü����  �߰�  ����
		p4 = new JPanel();
		p4.add(btnTotal = new JButton("��ü����"));
		p4.add(btnAdd = new JButton("�߰�"));
		p4.add(btnDel = new JButton("����"));
		
		contentPane = (JPanel) getContentPane();
		contentPane.add(panelWest, BorderLayout.WEST);
		contentPane.add(p4, BorderLayout.SOUTH);
		
		// ��ư �̺�Ʈ �����ϱ�
		btnTotal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showAllMembers();
			}
		});
		
		
		// �������̽��� ������ �߻�޼ҵ尡 1���� ���
		// ���ٽ����� ����ؼ� ǥ���� ������.
		btnAdd.addActionListener((event) -> {
			// �Է»��ڿ� �Է°��� ������ null�� �ƴϰ� ���ڿ�("")�̴�.
			String id = tfId.getText().trim();
			String passwd = tfPasswd.getText().trim();
			String name = tfName.getText().trim();
			
			if (id.length() == 0 
					|| passwd.length() == 0 
					|| name.length() == 0) {
				JOptionPane.showMessageDialog(MemberManager.this, "�ʼ������� �Է��ϼ���.");
				return;
			}
			
			MemberVo memberVo = new MemberVo(id, passwd, name);
			memberDao.addMember(memberVo);
			
			JOptionPane.showMessageDialog(MemberManager.this, "ȸ������ ����!");
			
			showAllMembers();
			
			tfId.setText("");
			tfPasswd.setText("");
			tfName.setText("");
		});
		
		
		btnDel.addActionListener((e) -> {
			
			//����� �Է� id�� ��������
			String id = tfId.getText().trim();
			
			// �Է� ���̵� ������ "������ ���̵� �Է��ϼ���" ���̾�α� ���
			if (id.length() == 0) { // id.equals("")
				JOptionPane.showMessageDialog(MemberManager.this, "������ ���̵� �Է��ϼ���");
				tfId.requestFocus();
				return;
			}
			
			// �������� �ʴ� ���̵�� "������ ���̵� �������� �ʽ��ϴ�" ���
			MemberVo memberVo = memberDao.getMemberById(id);
			if (memberVo == null) {
				JOptionPane.showMessageDialog(MemberManager.this, "������ ���̵� �������� �ʽ��ϴ�");
				return;
			}
			
			// �Է� ���̵� ������ "���� �����Ͻðڽ��ϱ�?" �����
			int result = JOptionPane.showConfirmDialog(MemberManager.this, 
					"���̵� " + id + " ȸ���� ���� �����Ͻðڽ��ϱ�?",
					"ȸ�� ����",
					JOptionPane.OK_CANCEL_OPTION);
			
			// �����ǵ� Cancel �̸� ����(return)
			if (result == JOptionPane.CANCEL_OPTION) {
				return;
			} 
			
			// �����ǵ� OK�� �ش� ���̵� ���� �����ϱ�
			memberDao.deleteById(id);
			
			// "��������!" ���̾�α� ���
			JOptionPane.showMessageDialog(MemberManager.this, "��������!");
			
			showAllMembers();
			
			// ���̵� �Է»��� ����
			tfId.setText("");
		});
		
		
		setLocationByPlatform(true);
		setSize(700, 300);
		setVisible(true);
	} // MemberManager()
	
	
	void showAllMembers() {
		
		// List ����ü ���� : ArrayList, Vector
		
		// DB�κ��� �����͸� List�� ��ȸ
		List<MemberVo> list = memberDao.getAllMembers();
		
		Vector<Vector<Object>> datas = getVectorFromList(list);
		
		// ������� Vector��ü �غ�
		Vector columnNames = new Vector();
		columnNames.add("���̵�");
		columnNames.add("�н�����");
		columnNames.add("�̸�");
		columnNames.add("���Գ�¥");
		
		table = new JTable(datas, columnNames);
		
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		setVisible(true); // ȭ�鰻���ؼ� ���̱�
		
	} // showAllMembers()
	
	/*
	Vector<Vector>    List<List>    List<String>
	
	[ [10, 20, 30],
	  [40, 50, 60],
	  [70, 80, 90] ]
	
	
	[ 10, 20, 30 ]
	[ 10, 20, 30 ]
	
	*/
	public Vector<Vector<Object>> getVectorFromList(List<MemberVo> list) {
		Vector<Vector<Object>> vector = new Vector<>();
		
		for (MemberVo memberVo : list) {
			Vector<Object> row = new Vector<>();
			row.add(memberVo.getId());
			row.add(memberVo.getPasswd());
			row.add(memberVo.getName());
			row.add(memberVo.getRegDate());
			
			vector.add(row);
		} // for
		return vector;
	} // getVectorFromList()
	

	public static void main(String[] args) {
		new MemberManager();
	} // main

}
