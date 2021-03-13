package 연습문제;

import java.util.Scanner;

public class ch02_practice_8_1 {
	public static boolean inRect(int x, int y, int rect_x1, int rect_y1,
			int rect_x2, int rect_y2) {
		if((rect_x1 <= x && rect_x2 >= x) &&(rect_y1 <= y && rect_y2 >= y)) {
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두점(x1,y1)(x2,y2)을 입력하세요");
		int rect_x1 = sc.nextInt();
		int rect_y1 = sc.nextInt();
		int rect_x2 = sc.nextInt();
		int rect_y2 = sc.nextInt();
		if(
			inRect(100, 100, rect_x1, rect_y1, rect_x2, rect_y2) ||
			inRect(100, 200, rect_x1, rect_y1, rect_x2, rect_y2) ||
			inRect(200, 100, rect_x1, rect_y1, rect_x2, rect_y2) ||
			inRect(200, 200, rect_x1, rect_y1, rect_x2, rect_y2)
			)
			System.out.println("직사각형이 충돌합니다.");
		else
			System.out.println("직사각형이 충돌하지 않습니다.");
	}
}
