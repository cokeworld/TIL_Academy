package 연습문제;

import java.util.Scanner;

public class assignment03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
//		System.out.println(str[0]);
//		String user = sc.next();
		String result = "";
		
		// 컴퓨터의 가위바위보 출력
		int n = (int)(Math.random()*3);
		if(str[n].equals("가위")) {
			result = "가위";
		}
		if(str[n].equals("바위")) {
			result = "바위";
		}
		if(str[n].equals("보")) {
			result = "보";
		}
		System.out.println(result);
	}
	}
