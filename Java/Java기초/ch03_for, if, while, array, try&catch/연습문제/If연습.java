public class If���� {
	public static void main(String[] args) {
		int n = 30;
		int m = 20;
		
		// if(���ǽ�)
		if (n<m) {
			System.out.println("m�� n���� �۴�");
		}
		
		// if(���ǽ�) else
		if (n<m) {
			System.out.println("m�� n���� �۴�");
		}
		else {
			System.out.println("else�� ���!");
		}
		
		// if(���ǽ�) else if(���ǽ�) else
		if (n<m) {
			System.out.println("m�� n���� �۴�");
		}
		else if(n>m) {
			System.out.println("m�� n���� ũ��");
		}
		else {
			System.out.println("else�� ���");
		}
	}
}

