package ex11;

public class Div {
	int a;
	int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		int result = a / b;
		return result;
	}

}
