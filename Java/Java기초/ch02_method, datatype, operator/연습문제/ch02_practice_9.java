package ��������;

import java.util.Scanner;

public class ch02_practice_9 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� �߽ɰ� ������ �Է�");
	double x1 = sc.nextDouble();
	double y1 = sc.nextDouble();
	double radius = sc.nextDouble();
	
	System.out.println("�ٸ� �� �Է�");
	double x2 = sc.nextDouble();
	double y2 = sc.nextDouble();
	
	double some = Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	
	if(some<=radius) {
		System.out.println("���� �� �ȿ� �ֽ��ϴ�.");
	}
	else
		System.out.println("���� �� �ۿ� �ֽ��ϴ�.");
	}
}