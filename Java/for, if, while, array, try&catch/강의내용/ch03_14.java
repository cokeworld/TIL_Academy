package ���ǳ���;
import java.util.Scanner;

public class ch03_14 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("�и� �Է�");
		dividend = rd.nextInt();
		System.out.println("���� �Է�");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend/divisor);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		} finally {
			System.out.println("�޷�");
		}
	}

}
