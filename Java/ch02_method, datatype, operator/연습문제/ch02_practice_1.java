package 연습문제;

import java.util.Scanner;

public class ch02_practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rate = 1216;
		System.out.println("원화를 입력하세요(단위 원)");
		int won = sc.nextInt();
		double dollar = won / rate;
		System.out.println(won + "원은 $" + dollar + " 입니다.");
	}

}
