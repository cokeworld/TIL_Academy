package ��������;

import java.util.Scanner;

public class ch02_practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�(10~99)");		
		int num = sc.nextInt();
		
		if(num < 10 || num>=100) {
			System.out.println("10~99���� �Է�");
			sc.close();
			return;
		} else {
			int n10 = num/10;
			int n1 = num%10;
			
			if(n10 == n1) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			} else
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		}
		
		

}
