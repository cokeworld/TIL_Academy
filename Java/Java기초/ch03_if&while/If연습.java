public class If연습 {
	public static void main(String[] args) {
		int n = 30;
		int m = 20;
		
		// if(조건식)
		if (n<m) {
			System.out.println("m이 n보다 작다");
		}
		
		// if(조건식) else
		if (n<m) {
			System.out.println("m이 n보다 작다");
		}
		else {
			System.out.println("else절 출력!");
		}
		
		// if(조건식) else if(조건식) else
		if (n<m) {
			System.out.println("m이 n보다 작다");
		}
		else if(n>m) {
			System.out.println("m이 n보다 크다");
		}
		else {
			System.out.println("else절 출력");
		}
	}
}

