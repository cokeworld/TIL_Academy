package ���ǳ���;
//for continue Ȱ���Ͽ� 1~100 ���� ¦���� ��
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
