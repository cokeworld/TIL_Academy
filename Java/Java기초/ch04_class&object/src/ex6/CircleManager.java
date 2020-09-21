package ex6;

import java.util.Scanner;

public class CircleManager {

	public void run() {
		Scanner sc = new Scanner(System.in);
		
		Circle arr[] = new Circle[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("x, y, radius >>");
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double radius = sc.nextDouble();
			arr[i] = new Circle(x, y, radius);
		}
		
		int maxIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[maxIndex].getSquare() < arr[i].getSquare()) {
				maxIndex = i;
			}
			
		}
		
		System.out.println("넓이가 최대인 원은");
		arr[maxIndex].show();
		
		sc.close();
	}
	
	
	
}
