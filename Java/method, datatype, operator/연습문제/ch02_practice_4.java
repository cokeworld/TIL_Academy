package 연습문제;

import java.util.Scanner;

public class ch02_practice_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		//checking num1 is a middle number or not
	    if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
	        System.out.print(num1+"is a middle number");
	    }
	    //checking num2 is a middle number or not
	    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
	        System.out.print(num2+"is a middle number");
	    }
	    //checking num3 is a middle number or not
	    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
	        System.out.print(num3+"is a middle number");
	    }

	}

}
