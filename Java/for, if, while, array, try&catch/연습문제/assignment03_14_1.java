package ��������;

import java.util.Scanner;

public class assignment03_14_1 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 84, 13, 53, 23 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("�����̸�>>");
			String order = sc.next();

			if (order.equals("�׸�")) {
				System.out.println("����");
				sc.close();
				break;
			}
			int i = 0;
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(order)) {
					System.out.println(order + "�� ������ " + score[i]);
					break;
				}
			}
			if (i == course.length) {
				System.out.println("���� �����");
			}
		}
	}
}
// �׸� ����
