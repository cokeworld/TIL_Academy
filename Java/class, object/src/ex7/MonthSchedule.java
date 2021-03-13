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
		System.out.println("날짜(1~30)?");
		lastDay = sc.nextInt();
		
		System.out.println("할일(빈칸없이입력)");
		toDo = sc.next();
	}
	
	private void view() {
		System.out.println(lastDay + "일의 할 일은 " + toDo + "입니다.");
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	
	public void run() {
		System.out.println("<스케줄 관리 프로그램>");
		System.out.println("할일(입력:1, 보기:2, 끝내기:3)");
		
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
				System.out.println("잘 못 입력했어요.");
			}
		}
		
	}
}
