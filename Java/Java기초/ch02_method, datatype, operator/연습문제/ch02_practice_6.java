package ��������;

import java.util.Scanner;

public class ch02_practice_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�");
		int num = sc.nextInt();
		int n10 = num/10;
		int n1 = num%10;
		
		int count = 0;
		
		if(n10%3 == 0 && n10 != 0) {
			count++;
		}
		if(n1%3 == 0 && n1 != 0) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("�ڼ�¦¦");
		}
		else if(count == 1) {
			System.out.println("�ڼ�¦");
		}
		else {
			System.out.println("�ڼ�����");
		}
	}
}
