package 강의내용;
import java.util.Scanner;

public class ch03_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
		while(true) {
			if(sc.nextInt() == -1)
				break;
			n++;
			System.out.println(n);
		}
		System.out.println("입력된 숫자의 개수는" + n);
	}

}
