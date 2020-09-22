package 강의내용;
public class ch02_13 {

	public static void main(String[] args) {
		char grade = 'F';
		switch(grade) {
		case 'A':
		case 'B': 
			System.out.println("good");
			break;
		case 'C':
		case 'D':
			System.out.println("enough");
			break;
		case 'F':
			System.out.println("fail");
			break;
		}
	}

}
