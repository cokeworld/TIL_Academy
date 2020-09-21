package ex9;

public class MainClass {

	public static void main(String[] args) {

		int [] array1 = { 1, 5, 3, 2 };
		int [] array2 = { 12, 4, -3, 442 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		
		ArrayUtil.print(array3);
	}

}
