package fileClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Ű���� �Է��� ���Ϸ� �����ϱ�
		
		// �Է½�Ʈ�� �غ�
		Scanner scanner = new Scanner(System.in);

		// ��½�Ʈ�� �غ�
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("E:/����/��������/test.txt", true);
			
			System.out.println("Ű����� ���ڸ� �Է��ϼ���.");
			
			String line = "";
			while (true) {
				line = scanner.nextLine(); // �ٹٲ޹��ڴ� �����ϰ� ������ ������
				if (line.length() == 0) { // ����Ű�� �Է��Ѱ�� ���ڿ�
					break;
				}
				
				writer.write(line + "\n"); //��½�Ʈ�� ��ü�� �⺻������ ���۸� ����.
			} // while
			
			writer.flush(); // ���� �����ؼ� ���Ͽ� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			try {
				writer.close(); // close()�� ������ ���������� flush() ȣ���ؼ� ���� ���� ����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // main

}
