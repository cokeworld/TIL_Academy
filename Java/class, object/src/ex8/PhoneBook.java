package ex8;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner sc = new Scanner(System.in);
	Phone[] phoneArr;

	public void run() {
		input();
		
		while(true) {
			System.out.println("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("종료"))
				break;
			
			search(name);
		}
	}
	
	public void input() {
		System.out.println("인원수>>");
		int num = sc.nextInt();
		phoneArr = new Phone[num];
		
		System.out.println("이름, 전화번호(빈칸없이 입력)");
		for(int i = 0; i < num; i++) {
			String name = sc.next();
			String tel = sc.next();
			phoneArr[i] = new Phone(name, tel);		
		}
		System.out.println("-----저장되었습니다-----");
	}
	
	public void search(String name) {
		
		int i;
		for(i = 0; i < phoneArr.length; i++) {
			if(name.equals(phoneArr[i].getName())) {
				System.out.println((phoneArr[i].getName()) + "의 전화번호는 " + (phoneArr[i].getTel()));
				System.out.println("(종료: 종료 입력)");;
		}
		}
		if (i == phoneArr.length) {
			System.out.println(name + "이 없습니다.");
		}
			
	}

}
