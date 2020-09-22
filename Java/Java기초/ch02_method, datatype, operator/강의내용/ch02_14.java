package 강의내용;
import java.util.Scanner;

public class ch02_14 {

	public static void main(String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) {
			int score = a.nextInt();
			switch (score/10) {
			case 10:
			case 9:
				grade = 'a';
				break;
			case 8:
			case 7:
				grade = 'b';
				break;
			case 6:
			case 5:
				grade = 'c';
				break;
			case 4:
				grade = 'd';
				break;
			default:
				grade = 'f';
			}
			System.out.println("학점은 " + grade +"입니다.");
		}

	}

}
