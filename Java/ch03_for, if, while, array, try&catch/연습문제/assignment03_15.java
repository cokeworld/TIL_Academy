package 연습문제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment03_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱하고자 하는 두수 입력>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m + " = " + (n * m));
				sc.close();
				}
			catch (InputMismatchException e) {
				System.out.println("실수를입력할 수 없습니다.");
				}
			
//			반복문 못하겠음
		}
	}
