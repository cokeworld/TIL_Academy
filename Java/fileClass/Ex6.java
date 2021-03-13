package fileClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) {
		// �ѱ� �ؽ�Ʈ ���� �����ϱ� - InputStreamReader "utf-8"����
		File src = new File("E:/����/��������", "�����α׷���_�н�.txt");
		File dest = new File("E:/����/��������", "�����α׷���_�н� - ���纻.txt");
		
		if (!src.exists()) {
			System.out.println("������ ���� " + src.getName() + " �� �������� �ʽ��ϴ�.");
			return;
		}
		
		// �Է½�Ʈ�� �غ�
		BufferedReader reader = null;
		// ��½�Ʈ�� �غ�
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(src), "utf-8"));
			writer = new FileWriter(dest);
			
			String line = "";
			while ((line = reader.readLine()) != null) {
				writer.write(line + "\n");
			}
			
			System.out.println("���� ���� �Ϸ��!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // main

}
