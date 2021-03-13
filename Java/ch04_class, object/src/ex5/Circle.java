package ex5;

public class Circle {
	
	double x;
	double y;
	double radius;
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("x: " + x + "y: " + y + "radius: " + radius);
	}
	

}
