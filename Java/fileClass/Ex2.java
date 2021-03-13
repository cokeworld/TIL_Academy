package fileClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) {
		// InputStreamReader�� �ѱ� �ؽ�Ʈ ���� �б�
		
		InputStreamReader reader = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("E:/����/��������/�����α׷���_�н�.txt");
			reader = new InputStreamReader(fis, "utf-8");
			
			int c;
			
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // ���������� ����� ����� ��ü�� �ݾ��ָ�
				                // �� �ȿ� �����ִ� ����� ��ü�� �ڵ� ����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	} // main

}
