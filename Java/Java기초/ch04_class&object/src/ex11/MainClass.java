package ex11;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operator = sc.next();
		
		int count = 0;
		
			switch(operator) {
			case "+": 
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
				
			case "-": 
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
				
			case "*": 
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
				
			case "/": 
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
				
			default:
				System.out.println("잘 못 입력했어요.");
				return;
			}
		
	}

}
