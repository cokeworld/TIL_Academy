package 연습문제;

import java.util.Scanner;

public class ch02_practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)");		
		int num = sc.nextInt();
		
		if(num < 10 || num>=100) {
			System.out.println("10~99수만 입력");
			sc.close();
			return;
		} else {
			int n10 = num/10;
			int n1 = num%10;
			
			if(n10 == n1) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		}
		
		

}
