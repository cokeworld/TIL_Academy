package ��������;

import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment03_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϰ��� �ϴ� �μ� �Է�>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m + " = " + (n * m));
				sc.close();
				}
			catch (InputMismatchException e) {
				System.out.println("�Ǽ����Է��� �� �����ϴ�.");
				}
			
//			�ݺ��� ���ϰ���
		}
	}
