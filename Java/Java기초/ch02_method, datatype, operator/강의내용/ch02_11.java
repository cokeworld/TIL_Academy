package 강의내용;
import java.util.Scanner;

public class ch02_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int number = in.nextInt();
		
		if(number % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");

	}

}
