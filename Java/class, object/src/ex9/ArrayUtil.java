package ex9;

public class ArrayUtil {
	
	public static int [] concat(int[] arrA, int[] arrB) {
		
		int arrC[]  = new int [arrA.length + arrB.length];
		
		for(int i = 0; i < arrA.length; i++) {
			arrC[i] = arrA[i]; 
		}
		
		for(int i = 0; i < arrB.length; i++) {
			arrC[i + arrA.length] = arrB[i]; 
		}
		return arrC;
	}
	
	public static void print(int[] arrC) {
		for(int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + " ");
		}
		System.out.println();
	}

}
