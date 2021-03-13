package 연습문제;

import java.util.Scanner;

public class assignment03_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 소문자(a~z)를 입력하세요>>");
//		int n = sc.nextInt();
		String str = sc.next();
		
		if(str.length() != 1)
		{
			System.out.println("1글자만 입력하세요!");
			sc.close();
			return;
		}		
		
		char c = str.charAt(0);
		
		if(c < 'a' || c > 'z')
		{
			System.out.println("알파벳 소문자가 아닙니다");
			sc.close();
			return;
		}
		
		for(char i=c; i>='a'; --i)
		{
			for(char j='a'; j<=i; j++)
			{
				//System.out.print("*");
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
