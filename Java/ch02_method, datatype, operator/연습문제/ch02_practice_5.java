package ��������;

import java.util.Scanner;

public class ch02_practice_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b < c || a+c < b || b+c < a) {
			System.out.println("�ﰢ���� �� �˴ϴ�.");
		} else {
			System.out.println("�ﰢ�� �˴ϴ�.");
		}
	}

}
