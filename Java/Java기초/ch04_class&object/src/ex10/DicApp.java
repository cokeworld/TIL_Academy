package ex10;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = sc.next();
			
				
			if(word.equals("�׸�")) {
				System.out.println("����");
				break;
				}
		String eng = Dictionary.kor2Eng(word);
		
		if(eng == null) {
			System.out.println(word + " �� ������ �����");
		}
		else
			System.out.println(word + " �� ����� " + eng);
		}
		sc.close();
}
}
