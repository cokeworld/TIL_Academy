package 강의내용;
import java.util.Scanner;

public class ch03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = 0;
		double sum = 0;
		int n = 0;
		
		while((i=sc.nextDouble()) != 0) {
			sum = sum + i;
			n++;
			double average = sum / n;
			System.out.println(average);			}
	}

}
