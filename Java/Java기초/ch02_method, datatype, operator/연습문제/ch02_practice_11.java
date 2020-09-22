package 연습문제;

import java.util.Scanner;

public class ch02_practice_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");		
		int month = sc.nextInt();
		
		if(month>=3 && month<=5)
		{
			System.out.println("Spring");
			return;
		}
		
		if(month>=6 && month<=8)
		{
			System.out.println("Summer");
			return;
		}
		
		if(month>=9 && month<=11)
		{
			System.out.println("Autumn");
			return;
		}
		
		if(month==12 || (month > 1 && month<=2))
		{
			System.out.println("Winter");
			return;
		}
		else
			System.out.println("error");
	}

}
