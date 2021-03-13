package ¿¬½À¹®Á¦;

import java.util.Arrays;

public class assignment03_7 {

	public static void main(String[] args) {
		
		int intArray[] = new int[10];
		double sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			int randomNum = (int)(Math.random()*10 + 1);
			intArray[i] = randomNum;
			sum = sum + intArray[i];
		}
		double average = sum / intArray.length;
		
		System.out.println("·£´ý Á¤¼ö: " + Arrays.toString(intArray));
		System.out.println("Æò±Õ: " + average);
	}

}
