package ex09;

import java.util.Scanner;

public class StringStack implements Stack{
	
	Scanner sc = new Scanner(System.in);
	
	int stack = 0;
	String[] array;
	int cnt = 0;
	
	public void run() {
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		cnt = sc.nextInt();
		array = new String[cnt];
		
		int i;
		
		for(i = 0; i < array.length; i++) {
			System.out.print("���ڿ� �Է� >>");
			array[i] = sc.next();
			
			cnt++;
			
			if(array[i].equals("�׸�")) {
				break;
			}
			
			if(array[i].equals("��ȸ")) {
				System.out.println("������ ������ " + capacity() + "�̴�.");
				System.out.println("���� ���ÿ� ����� ������ " + length() + "�̴�.");
			}
		}
		if(i==array.length) {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}
		
	}
	@Override
	public int length() {
		int result = cnt;
		return result;
	}

	@Override
	public int capacity() {
		int result = array.length - cnt;
		return result;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		return false;
	}
}
