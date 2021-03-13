package fileClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex4 {
	
	public static void listDirectory(File dir) {
		
		System.out.println("\n---" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�. ---\n");
		
		File[] files = dir.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for (File file : files) {
			System.out.print(file.getName());
			System.out.print(file.isDirectory() ? "\t<DIR>" : "\t");
			System.out.print("\t����ũ��: " + file.length());
			
			long milis = file.lastModified();
			Date date = new Date(milis);
			String str = sdf.format(date);
			System.out.println("\t������ �ð�: " + str);
		} // for
	} // listDirectory

	public static void main(String[] args) {
		// File Ŭ����
		File file1 = new File("E:/����/��������/�����α׷���_�н�.txt");
		System.out.println(file1.getPath());
		System.out.println(file1.getParent());
		System.out.println(file1.getName());
		
		if (file1.isFile()) {
			System.out.println("�����Դϴ�.");
		} else if (file1.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
		
		File file2 = new File("E:/����/��������/sample"); // ���� ������� �ϴ� ���丮
		if (!file2.exists()) { // ���丮 ���� �˻�
			file2.mkdir(); // ���丮�� �������� ������ ����
		}
		
		
		listDirectory(new File("E:\\����\\��������"));

	} // main

}
