package ��������;

import java.util.Scanner;

public class assignment03_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String resultCom = "";
		// ������ ���������� ���
		System.out.println("����������!");
		String resultUser = sc.next();
		
		// ��ǻ���� ���������� ���
		int n = (int)(Math.random()*3);
		if(str[n].equals("����")) {
			resultCom = "����";
		}
		if(str[n].equals("����")) {
			resultCom = "����";
		}
		if(str[n].equals("��")) {
			resultCom = "��";
		}
		
		// ���� ��ǻ�� ���������� ��
		if((resultUser == str[0] && resultCom == str[0]) ||
			(resultUser == str[1] && resultCom == str[1]) ||
			(resultUser == str[2] && resultCom == str[2])) {
			System.out.println("�����ϴ�.");
		}
		if((resultUser == str[0] && resultCom == str[2]) ||
				(resultUser == str[1] && resultCom == str[0]) ||
				(resultUser == str[2] && resultCom == str[1])) {
			System.out.println("�̰���ϴ�.");
		}
		if((resultUser == str[2] && resultCom == str[0]) ||
				(resultUser == str[0] && resultCom == str[1]) ||
				(resultUser == str[1] && resultCom == str[2])) {
			System.out.println("�����ϴ�.");
	}
	}
	}
