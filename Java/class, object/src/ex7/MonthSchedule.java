package ex7;

import java.util.Scanner;

public class MonthSchedule {
	
	int lastDay;
	String toDo;
	Day dayArr[];
	
	Scanner sc = new Scanner(System.in);
	
	public MonthSchedule(int lastDay) {
		
		Day dayArr[] = new Day[lastDay];
		 
		this.lastDay = lastDay;
	}
	
	private void input() {
		System.out.println("��¥(1~30)?");
		lastDay = sc.nextInt();
		
		System.out.println("����(��ĭ�����Է�)");
		toDo = sc.next();
	}
	
	private void view() {
		System.out.println(lastDay + "���� �� ���� " + toDo + "�Դϴ�.");
	}
	
	private void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
	
	public void run() {
		System.out.println("<������ ���� ���α׷�>");
		System.out.println("����(�Է�:1, ����:2, ������:3)");
		
		while(true) {			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: input();
					break;
			case 2: view();
					break;
			case 3: finish();
					return;
			default: 
				System.out.println("�� �� �Է��߾��.");
			}
		}
		
	}
}
