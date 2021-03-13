package 연습문제;

import java.util.Scanner;

public class ch02_practice_9 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("원의 중심과 반지름 입력");
	double x1 = sc.nextDouble();
	double y1 = sc.nextDouble();
	double radius = sc.nextDouble();
	
	System.out.println("다른 점 입력");
	double x2 = sc.nextDouble();
	double y2 = sc.nextDouble();
	
	double some = Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	
	if(some<=radius) {
		System.out.println("점이 원 안에 있습니다.");
	}
	else
		System.out.println("점이 원 밖에 있습니다.");
	}
}