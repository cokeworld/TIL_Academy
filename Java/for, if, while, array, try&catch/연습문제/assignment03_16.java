package ��������;

import java.util.Scanner;

public class assignment03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
//		System.out.println(str[0]);
//		String user = sc.next();
		String result = "";
		
		// ��ǻ���� ���������� ���
		int n = (int)(Math.random()*3);
		if(str[n].equals("����")) {
			result = "����";
		}
		if(str[n].equals("����")) {
			result = "����";
		}
		if(str[n].equals("��")) {
			result = "��";
		}
		System.out.println(result);
	}
	}
