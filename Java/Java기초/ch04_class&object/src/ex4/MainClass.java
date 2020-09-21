package ex4;

import ex4.Rectangle;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		int squareR = r.square();
		System.out.println(squareR);
		r.show();
		System.out.println(r.contains(t));
	}

}
