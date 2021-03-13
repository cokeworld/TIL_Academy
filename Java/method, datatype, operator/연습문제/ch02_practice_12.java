package 연습문제;

import java.util.Scanner;

public class ch02_practice_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연산>>");
		double num1 = sc.nextDouble();
		String operator = sc.next();
		double num2 = sc.nextDouble();
		
		double result = 0.0;
		
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) 
		if(num2 != 0){
			result = num1 / num2;
		}
		else
		{
			System.out.println("0으로 나눌 수 없어");
			return;
		}	
			
		System.out.println(result);
	}

}
