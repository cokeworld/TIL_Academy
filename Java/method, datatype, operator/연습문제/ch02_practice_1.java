package ��������;

import java.util.Scanner;

public class ch02_practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rate = 1216;
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)");
		int won = sc.nextInt();
		double dollar = won / rate;
		System.out.println(won + "���� $" + dollar + " �Դϴ�.");
	}

}
