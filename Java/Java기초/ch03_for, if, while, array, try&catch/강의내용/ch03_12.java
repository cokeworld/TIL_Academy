package 강의내용;

public class ch03_12 {
	
	public static int[] makeArray() {
		int temp[] = new int[5];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	public static void main(String[] arga) {
		int array[];
		array = makeArray();
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
