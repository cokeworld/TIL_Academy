package ex12;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Reservation res = new Reservation();
		
		int choice;
		
		while(true) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				res.reserve();
				break;
			case 2:
				res.search();
				break;
			case 3:
				res.cancle();
				break;
			case 4:
				res.finish();
				break;
			default:
				System.out.println("오입력");
			}
		}
	}
}


//보완점: 
//1. 이미 예매된 자리에 예매를 시도할 경우 처리
//2. 글자를 잘못 입력했을 경우 처리
//3. 끝내기 처리 보완
