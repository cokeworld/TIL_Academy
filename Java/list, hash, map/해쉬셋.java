package list_hash_map;

import java.util.HashSet;
import java.util.Set;

public class 해쉬셋 {

	public static void main(String[] args) {
		// �÷��� : �ڷᱸ��. ����ũ�� ������ �������
		//          ��ü�� ���� ����(�⺻�ڷ��� �����ʹ� ���� �Ұ���)
		
		// Set(����) : ������ ���� �ڷᱸ��. �ߺ��� ��� ����.
		// List(���) : ������ �ִ� �ڷᱸ��. �ߺ��� �����. ����ũ�� �迭.
		// Map(����) : ������ ���� (Ű,��) ���� �ڷᱸ��.
		//             Ű�� �ߺ��Ұ��� -> Ű�� Set���� ������.
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set.size());
		System.out.println(set); // set.toString() ȣ��
		
		Set<String> strSet = new HashSet<>();
		strSet.add("ȫ�浿");
		strSet.add("������");
		strSet.add("�̸���");
		strSet.add("�Ż��Ӵ�");
		
		// for-each��
		for (String name : strSet) {
			System.out.println(name);
		}
		
		System.out.println("=====================");
		
		Set<Object> set2 = new HashSet<>();
		set2.add(10); // int�� -> Integer�� ��ü�� ��ȯ�Ǽ� �����
		set2.add("���ڿ�");
		set2.add(new Puppy());
		
		for (Object obj : set2) {
			System.out.println(obj.toString());
		}
		
		
		

	} // main

}
