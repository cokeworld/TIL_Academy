package ��������;

public class assignment03_12 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		try {
		for(int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);
			sum = sum + n;
		}
		} 
		catch(NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}
		System.out.println(sum);
	}

}
