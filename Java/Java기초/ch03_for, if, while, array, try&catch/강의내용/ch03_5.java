package 강의내용;
//for continue 활용하여 1~100 까지 짝수의 합
public class ch03_5 {

	public static void main(String[] args) {
		for(int sum = 0, i = 1; i <=100; i++) {
			if(i%2 != 0) {
				continue;
			}
			sum = sum + i;
			System.out.println(sum);
		}
	}

}
