package 강의내용;
import java.util.Scanner;

public class ch02_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = in.nextInt();
		if(score >= 80)
			System.out.println("축 합격!");
	}
}