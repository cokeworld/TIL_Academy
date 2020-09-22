package 연습문제;

public class assignment03_10 {
	public static void main(String[] args) {
		int array[][] = new int[4][4];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}

		for (int count = 0; count < 10; count++) {
			int row = (int) (Math.random() * 4);
			int col = (int) (Math.random() * 4);
			
			if(array[row][col] == 0) 
				array[row][col] = (int)(Math.random() * 10 + 1);
			else
				count--;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
