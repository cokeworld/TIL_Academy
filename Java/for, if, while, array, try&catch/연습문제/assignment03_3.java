package ��������;

import java.util.Scanner;

public class assignment03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>");
		int n = sc.nextInt();
		for (int i = n; i > 0; --i) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
