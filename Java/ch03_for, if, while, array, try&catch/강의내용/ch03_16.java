package 강의내용;

public class ch03_16 {

	public static void main(String[] args) {
		String[] stringNumber = {"2314", "31", "23.1"};
		try {
			for(int i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println(j);
			}
		} catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
	}

}
