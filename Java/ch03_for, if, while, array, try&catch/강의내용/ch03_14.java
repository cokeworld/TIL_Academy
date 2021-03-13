package 강의내용;
import java.util.Scanner;

public class ch03_14 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("분모 입력");
		dividend = rd.nextInt();
		System.out.println("분자 입력");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend/divisor);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} finally {
			System.out.println("메롱");
		}
	}

}
