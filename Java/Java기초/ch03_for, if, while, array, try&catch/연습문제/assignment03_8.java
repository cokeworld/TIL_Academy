package 연습문제;

import java.util.Scanner;

public class assignment03_8 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("100보다 작은 정수 입력");
		int size = sc.nextInt();
		if(size <=0 || size > 100) {
			System.out.println("1과 100사이 입력");
			sc.close();
			return;
		}
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; ++i) {			
			int randomNum = (int)(Math.random()*100+1);
			
			if(check(arr, i, randomNum)) {
				i--;
				continue;
			}
			arr[i] = randomNum;		
			
			if(i%10 == 9) {
				System.out.print(arr[i] + "\n");
			}
			else {
				System.out.print(arr[i] + " ");
			}
			
		}
		System.out.println();
		sc.close();
		}

	public static boolean check(int arr[], int i, int randomNum) {
		for (int j = 0; j < i; j++) {
			if (arr[j] == randomNum)
				return true;
		}
		return false;
	}
}