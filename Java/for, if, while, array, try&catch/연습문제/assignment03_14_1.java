package 연습문제;

import java.util.Scanner;

public class assignment03_14_1 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 84, 13, 53, 23 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("과목이름>>");
			String order = sc.next();

			if (order.equals("그만")) {
				System.out.println("종료");
				sc.close();
				break;
			}
			int i = 0;
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(order)) {
					System.out.println(order + "의 점수는 " + score[i]);
					break;
				}
			}
			if (i == course.length) {
				System.out.println("과목 없어용");
			}
		}
	}
}
// 그만 구현
