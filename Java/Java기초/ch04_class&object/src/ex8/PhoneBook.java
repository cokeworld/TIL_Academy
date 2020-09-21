package ex8;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner sc = new Scanner(System.in);
	Phone[] phoneArr;

	public void run() {
		input();
		
		while(true) {
			System.out.println("�˻��� �̸�>>");
			String name = sc.next();
			
			if(name.equals("����"))
				break;
			
			search(name);
		}
	}
	
	public void input() {
		System.out.println("�ο���>>");
		int num = sc.nextInt();
		phoneArr = new Phone[num];
		
		System.out.println("�̸�, ��ȭ��ȣ(��ĭ���� �Է�)");
		for(int i = 0; i < num; i++) {
			String name = sc.next();
			String tel = sc.next();
			phoneArr[i] = new Phone(name, tel);		
		}
		System.out.println("-----����Ǿ����ϴ�-----");
	}
	
	public void search(String name) {
		
		int i;
		for(i = 0; i < phoneArr.length; i++) {
			if(name.equals(phoneArr[i].getName())) {
				System.out.println((phoneArr[i].getName()) + "�� ��ȭ��ȣ�� " + (phoneArr[i].getTel()));
				System.out.println("(����: ���� �Է�)");;
		}
		}
		if (i == phoneArr.length) {
			System.out.println(name + "�� �����ϴ�.");
		}
			
	}

}
