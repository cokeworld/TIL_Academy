package 강의내용;

public class ch03_13 {

	public static void main(String[] args) {
		double sum = 0;
		
		for(int i=0; i<args.length; i++) {
			sum = sum + Double.parseDouble(args[i]);
		}
		double aver = sum / args.length;
		System.out.println(sum);
		System.out.println(aver);
	}

}
