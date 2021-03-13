package 연습문제;

import java.util.Scanner;

public class ch02_practice_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 원의 중심과 반지름 입력");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius1 = sc.nextDouble();
		
		System.out.println("두번째 원의 중심과 반지름 입력");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
//점과 점사이 거리 <= 각 반지름 합 => 겹친다
		double term = Math.sqrt((x2-x1)*(y2-y1));
		double sum_radius = radius1 + radius2;
		
		if(sum_radius >= term) {
			System.out.println("두 원이 겹칩니다.");			
		}
		else
			System.out.println("두 원이 겹치지 않습니다.");

	}

}
