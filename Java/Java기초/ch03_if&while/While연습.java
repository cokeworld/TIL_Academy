public class While���� {

	public static void main(String[] args) {
		
		// for
		int sum = 0;
		for(int i = 1; i<10; i++) {
			sum = i + sum; 
			System.out.println("[for] i = " + i + " / sum = " +  sum);
		}
		
		// while(true or false)
		int j = 0;
		int sum1 = 0;
		while(j < 10) {
			sum1 = j + sum1;
			j++;
			System.out.println("[while] sum1 = " + sum1);
		}
		
		// do while(true or false)
		// ���ǰ���� ������� ������ �����ѹ��� do������ �����Ѵ�.
		int k = 0;
		int sum2 = 0;
		do {
			System.out.println("������ 1���� �����մϴ�.");
			sum2 = k + sum2;
			k++;
			System.out.println("[while] sum1 = " + sum2);
		} while(k < 10); {
			System.out.println("��");
		}
	}

}
