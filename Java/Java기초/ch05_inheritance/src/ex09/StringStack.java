package ex09;

import java.util.Scanner;

public class StringStack implements Stack{
	
	Scanner sc = new Scanner(System.in);
	
	int stack = 0;
	String[] array;
	int cnt = 0;
	
	public void run() {
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		cnt = sc.nextInt();
		array = new String[cnt];
		
		int i;
		
		for(i = 0; i < array.length; i++) {
			System.out.print("문자열 입력 >>");
			array[i] = sc.next();
			
			cnt++;
			
			if(array[i].equals("그만")) {
				break;
			}
			
			if(array[i].equals("조회")) {
				System.out.println("가용한 스택은 " + capacity() + "이다.");
				System.out.println("현재 스택에 저장된 개수는 " + length() + "이다.");
			}
		}
		if(i==array.length) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
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
