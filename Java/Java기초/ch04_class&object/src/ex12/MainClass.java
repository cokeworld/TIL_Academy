package ex12;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Reservation res = new Reservation();
		
		int choice;
		
		while(true) {
			System.out.println("����:1, ��ȸ:2, ���:3, ������:4>>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				res.reserve();
				break;
			case 2:
				res.search();
				break;
			case 3:
				res.cancle();
				break;
			case 4:
				res.finish();
				break;
			default:
				System.out.println("���Է�");
			}
		}
	}
}


//������: 
//1. �̹� ���ŵ� �ڸ��� ���Ÿ� �õ��� ��� ó��
//2. ���ڸ� �߸� �Է����� ��� ó��
//3. ������ ó�� ����
