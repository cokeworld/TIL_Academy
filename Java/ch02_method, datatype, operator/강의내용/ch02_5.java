package 강의내용;
import java.util.Scanner;
public class ch02_5 {

	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;
		
		System.out.println(time + "초는 ");
		System.out.println(hour + "시간 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초 입니다.");
	}

}
