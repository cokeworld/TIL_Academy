package 연습문제;

import java.util.Scanner;

public class ch02_practice_12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		double num1 = sc.nextDouble();
		String operator = sc.next();
		double num2 = sc.nextDouble();
		double result = 0;
		
		switch(operator) {
		case "+": 
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0 입력 불가");
				return;
			}
			result = num1 / num2;
			break;
		}
		
		System.out.println(result);
		}

	}
