package ¿¬½À¹®Á¦;

public class assignment03_13 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			
			int num10 = i % 10;
			int num01 = i / 10;
			int count = 0;
			
			if(num10 == 3 || num10 == 6 || num10 == 9) {
				count++;
			}
			if(num01 == 3 || num01 == 6 || num01 == 9) {
				count++;
			}
			
			if(count == 2) {
				System.out.println(i + ": Â¦Â¦");
			}
			else if(count == 1) {
				System.out.println(i + ": Â¦");
			}
		}
		
		
	}
}
