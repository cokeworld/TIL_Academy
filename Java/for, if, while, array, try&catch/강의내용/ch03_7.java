package ���ǳ���;
import java.util.Scanner;

//��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ȭ�鿡 ����ϴ� ���α׷�
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
