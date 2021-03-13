package fileClass;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) {
		// �ѱ� �ؽ�Ʈ ���� �����ϱ� - InputStreamReader "utf-8"����
		File src = new File("E:/����/��������", "hobbang.jpg");
		File dest = new File("E:/����/��������", "hobbang - ���纻.jpg");
		
		if (!src.exists()) {
			System.out.println("������ ���� " + src.getName() + " �� �������� �ʽ��ϴ�.");
			return;
		}
		
		// �Է½�Ʈ�� �غ�
		BufferedInputStream bis = null;
		// ��½�Ʈ�� �غ�
		FileOutputStream fos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(src));
			fos = new FileOutputStream(dest);
			
			int data;
			while ((data = bis.read()) != -1) { // ���ϳ��� ������ -1 �� ������
				fos.write(data);
			}
			
			System.out.println("���� ���� �Ϸ��!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // main

}
