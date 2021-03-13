package 연습문제;

import java.util.Scanner;

public class ch02_practice_8 {

	public static boolean inRect(int x, int y, int rect_x1, 
			int rect_y1, int rect_x2, int rect_y2) {
		if((x >= rect_x1 && x <= rect_x2) && 
				(y >= rect_y1 && y <= rect_y2))
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두점 입력하시오");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if(inRect(100, 100, x1, y1, x2, y2) ||
				inRect(100, 200, x1, y1, x2, y2) ||
				inRect(200, 100, x1, y1, x2, y2) ||
				inRect(200, 200, x1, y1, x2, y2))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else
		{
			System.out.println("사각형이 겹치지 않습니다.");
		}

	}

}
