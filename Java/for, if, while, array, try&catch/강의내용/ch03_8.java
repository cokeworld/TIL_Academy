package ���ǳ���;
import java.util.Scanner;

public class ch03_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arrayLength = 3;
		double doubleArray[] = new double[arrayLength];
		
		System.out.println("������ " + doubleArray.length + " �� �Է����ּ���.");
		
		double sum = 0;
		int i = 0;
		
		for(i=0; i<doubleArray.length; i++) {
			doubleArray[i] = sc.nextDouble();
			sum = sum + doubleArray[i];
		}
		
		double average = sum / doubleArray.length;
		
		System.out.println(average);
	}

}
