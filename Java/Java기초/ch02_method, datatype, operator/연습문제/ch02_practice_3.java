package ��������;

import java.util.Scanner;

public class ch02_practice_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		int money = sc.nextInt();
		// 50,000
		int bucks = money / 50000;
		money = money % 50000;
		if(bucks > 0)
			System.out.println("��������: " + bucks + "��");
		
		bucks = money / 1000;
		money = money % 1000;
		if(bucks > 0)
			System.out.println("õ����: " + bucks + "��");
		
		bucks = money / 500;
		money = money % 500;
		if(bucks > 0)
			System.out.println("�����: " + bucks + "��");
		
		bucks = money / 100;
		money = money % 100;
		if(bucks > 0)
			System.out.println("���: " + bucks + "��");
		
		bucks = money / 50;
		money = money % 50;
		if(bucks > 0)
			System.out.println("���ʿ�: " + bucks + "��");
		
		bucks = money / 10;
		money = money % 10;
		if(bucks > 0)
			System.out.println("�ʿ�: " + bucks + "��");
		
		
		
		
		
//		int fiftyThousand = money / 50000;
//		int tenThousand = (money % 50000) / 10000;
//		int oneThousand =  (money % 50000 % 10000) / 1000;
//		int fiveHundred = (money % 50000 % 10000 % 1000) / 500;
//		int oneHundred = (money % 50000 % 10000 % 1000 % 500) / 100;
//		
//		System.out.println("��������: " + fiftyThousand + "��");
//		System.out.println("������: " + tenThousand + "��");
//		System.out.println("õ����: " + oneThousand + "��");
//		System.out.println("�����: " + fiveHundred + "��");
//		System.out.println("���: " + oneHundred + "��");

	}

}
