package ��������;

import java.util.Scanner;

public class assignment03_6 {

	public static void main(String[] args) {
		
		int []unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ� �Է��Ͻÿ�.");
		int money = sc.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			int cnt = money / unit[i];
			System.out.println(unit[i] + "��: " + cnt);
			money = money % unit[i];
		}
		

	}

}
