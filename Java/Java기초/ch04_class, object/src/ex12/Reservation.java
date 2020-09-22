package ex12;

import java.util.Scanner;

public class Reservation implements InterReservation{
	
	Scanner sc = new Scanner(System.in);

	int seatClass;
	int seatNum;
	String name;
	
	String[] seatS = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	String[] seatA = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	String[] seatB = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	
	@Override
	public void reserve() {
		//좌석 클래스, 이름, 좌석번호 입력 
		System.out.println("좌석구분 S(1), A(2), B(3)>>");
		
		seatClass = sc.nextInt();
		if(seatClass < 1 || seatClass > 3)
			return;
		
		System.out.println("좌석번호(1~10)>>");
		
		seatNum = sc.nextInt();
		if(seatNum < 1 || seatNum > 10)
			return;
				
		System.out.println("이름>>");
		name = sc.next();
		
		switch(seatClass) {
		case 1:
			seatS[seatNum-1] = name;
			break;
		case 2:
			seatA[seatNum-1] = name;
			break;
		case 3:
			seatB[seatNum-1] = name;
			break;
		default:
			System.out.println("오입력");
			return;
		}
		
		search();
		
	}

	@Override
	public void search() {
		System.out.print("S>> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatS[i] + " ");
		}
		System.out.println();
		
		System.out.print("A>> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatA[i] + " ");
		}
		System.out.println();
		
		System.out.print("B>> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatB[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void cancle() {
		
		System.out.println("좌석구분 S(1), A(2), B(3)>>");
		seatClass = sc.nextInt();
		
		System.out.println("좌석번호(1~10)>>");
		seatNum = sc.nextInt();
		
		switch(seatClass) {
		case 1:
			seatS[seatNum-1] = "---";
			break;
		case 2:
			seatA[seatNum-1] = "---";
			break;
		case 3:
			seatB[seatNum-1] = "---";
			break;
		default:
			System.out.println("오입력");
			return;
		}
	}

	@Override
	public void finish() {
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	

}
