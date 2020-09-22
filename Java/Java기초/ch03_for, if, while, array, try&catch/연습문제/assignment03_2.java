package 연습문제;

public class assignment03_2 {

	public static void main(String[] args) {
		int n[][] = new int[5][];
		n[0] = new int[1];
		n[1] = new int[3];
		n[2] = new int[1];
		n[3] = new int[4];
		n[4] = new int[2];
	
		for (int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++) {
				n[i][j] = j+1;
				System.out.print(n[i][j] + "\t");
		}
		System.out.println();
		}
	}

}
