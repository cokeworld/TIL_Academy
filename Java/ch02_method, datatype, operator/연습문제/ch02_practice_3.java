package 연습문제;

import java.util.Scanner;

public class ch02_practice_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오");
		int money = sc.nextInt();
		// 50,000
		int bucks = money / 50000;
		money = money % 50000;
		if(bucks > 0)
			System.out.println("오만원권: " + bucks + "매");
		
		bucks = money / 1000;
		money = money % 1000;
		if(bucks > 0)
			System.out.println("천원권: " + bucks + "매");
		
		bucks = money / 500;
		money = money % 500;
		if(bucks > 0)
			System.out.println("오백원: " + bucks + "매");
		
		bucks = money / 100;
		money = money % 100;
		if(bucks > 0)
			System.out.println("백원: " + bucks + "매");
		
		bucks = money / 50;
		money = money % 50;
		if(bucks > 0)
			System.out.println("오십원: " + bucks + "매");
		
		bucks = money / 10;
		money = money % 10;
		if(bucks > 0)
			System.out.println("십원: " + bucks + "매");
		
		
		
		
		
//		int fiftyThousand = money / 50000;
//		int tenThousand = (money % 50000) / 10000;
//		int oneThousand =  (money % 50000 % 10000) / 1000;
//		int fiveHundred = (money % 50000 % 10000 % 1000) / 500;
//		int oneHundred = (money % 50000 % 10000 % 1000 % 500) / 100;
//		
//		System.out.println("오만원권: " + fiftyThousand + "매");
//		System.out.println("만원권: " + tenThousand + "매");
//		System.out.println("천원권: " + oneThousand + "매");
//		System.out.println("오백원: " + fiveHundred + "개");
//		System.out.println("백원: " + oneHundred + "개");

	}

}
