package 연습문제;

import java.util.Scanner;

public class assignment03_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String resultCom = "";
		// 유저의 가위바위보 출력
		System.out.println("가위바위보!");
		String resultUser = sc.next();
		
		// 컴퓨터의 가위바위보 출력
		int n = (int)(Math.random()*3);
		if(str[n].equals("가위")) {
			resultCom = "가위";
		}
		if(str[n].equals("바위")) {
			resultCom = "바위";
		}
		if(str[n].equals("보")) {
			resultCom = "보";
		}
		
		// 유저 컴퓨터 가위바위보 비교
		if((resultUser == str[0] && resultCom == str[0]) ||
			(resultUser == str[1] && resultCom == str[1]) ||
			(resultUser == str[2] && resultCom == str[2])) {
			System.out.println("비겼습니다.");
		}
		if((resultUser == str[0] && resultCom == str[2]) ||
				(resultUser == str[1] && resultCom == str[0]) ||
				(resultUser == str[2] && resultCom == str[1])) {
			System.out.println("이겼습니다.");
		}
		if((resultUser == str[2] && resultCom == str[0]) ||
				(resultUser == str[0] && resultCom == str[1]) ||
				(resultUser == str[1] && resultCom == str[2])) {
			System.out.println("졌습니다.");
	}
	}
	}
