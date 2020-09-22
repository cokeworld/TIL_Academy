package 강의내용;

public class ch03_01 {

	public static void main(String[] args) {
		for(int i = 1, sum = 0; i <= 10; i++) {
//			System.out.println(i);
			sum = sum + i;
			System.out.println(sum + "=" + (sum-i) + "+" + i);
		}
	}

}
