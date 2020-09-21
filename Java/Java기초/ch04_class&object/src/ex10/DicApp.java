package ex10;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			System.out.print("한글 단어?");
			String word = sc.next();
			
				
			if(word.equals("그만")) {
				System.out.println("종료");
				break;
				}
		String eng = Dictionary.kor2Eng(word);
		
		if(eng == null) {
			System.out.println(word + " 는 사전에 없어요");
		}
		else
			System.out.println(word + " 는 영어로 " + eng);
		}
		sc.close();
}
}
