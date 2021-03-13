package list_hash_map;

import java.util.ArrayList;
import java.util.List;

public class 리스트 {

	public static void main(String[] args) {
		// List : ����ũ�� �迭
		
		List<Integer> numList = new ArrayList<>();
		
		// �������� ��� �߰�
		numList.add(100); // �ε��� 0��°
		numList.add(200); // �ε��� 1��°
		numList.add(300); // �ε��� 2��°
		
		// Ư����ġ�� ��� ����
		numList.add(1, 400); // �ε��� 1��° ��ġ�� 400 �� ����
		
		System.out.println(numList.toString());
		
		for (int i=0; i<numList.size(); i++) {
			int num = numList.get(i);
			System.out.println("num = " + num);
		}
		
		System.out.println("==================");
		
		// int -> Integer : �ڽ�
		// Integer -> int : ��ڽ�
		
		
		// for-each��
		for (int num : numList) {
			System.out.println("num = " + num);
		}
		
		
		numList.set(0, 1000); // �ε��� 0��° ��Ҹ� 1000���� ����
		
		numList.remove(2); // �ε��� 2��° ��� ����
		
		numList.clear(); // ����� ����
		
	} // main

}
