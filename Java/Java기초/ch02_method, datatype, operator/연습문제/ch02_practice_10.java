package ��������;

import java.util.Scanner;

public class ch02_practice_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius1 = sc.nextDouble();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
//���� ������ �Ÿ� <= �� ������ �� => ��ģ��
		double term = Math.sqrt((x2-x1)*(y2-y1));
		double sum_radius = radius1 + radius2;
		
		if(sum_radius >= term) {
			System.out.println("�� ���� ��Ĩ�ϴ�.");			
		}
		else
			System.out.println("�� ���� ��ġ�� �ʽ��ϴ�.");

	}

}
