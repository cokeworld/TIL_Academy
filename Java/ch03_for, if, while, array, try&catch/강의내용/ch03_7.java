package 강의내용;
import java.util.Scanner;

//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 프로그램
public class ch03_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int newArray[] = new int[5];
		int max = 0;
		
		for(int i = 0; i<5; i++) {
			newArray[i]	= sc.nextInt();
			if(newArray[i] > max) {
				max = newArray[i];
			}
		}
		System.out.println(max);
	}

}
