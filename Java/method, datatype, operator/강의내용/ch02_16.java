package 강의내용;
public class ch02_16 {

	public static void main(String[] args) {
		String grade = null;
		double num = 12.22;
		
		switch((int)num) {
		case 12:
			grade = "a";
			break;
		case 13:
			grade = "b";
			break;
		case 14:
			grade = "c";
			break;
		default:
			grade = "not valid num";
		}
		
		System.out.println(grade);

	}

}
