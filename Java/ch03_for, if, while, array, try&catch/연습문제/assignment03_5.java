package ��������;

import java.util.Scanner;

public class assignment03_5 {

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է��Ͻÿ�.");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		if(num[i] % 3 == 0) 
				System.out.print(num[i] + "\t");
	
		}
		
	}

}
