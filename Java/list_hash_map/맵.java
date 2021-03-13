package list_hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 맵 {

	public static void main(String[] args) {
		// Map �÷���: Ű�� ���� ������ ������ �����ϴ� �ڷᱸ��
		
		Map<String, Animal> animalMap = new HashMap<>();
		
		// Ű�� ������ �� �߰�
		animalMap.put("Ǫ��", new Puppy());
		animalMap.put("�����", new Cat());
		animalMap.put("����", new Duck());
		
		// Ű�� ���ؼ� �� ��������
		Animal ani = animalMap.get("Ǫ��");
		ani.speak();
		
		// Ű���� ������ ������ �߰��� �ƴϰ� �����۾��� ��
		animalMap.put("Ǫ��", new Puppy(8, "����"));
		ani = animalMap.get("Ǫ��");
		ani.speak();
		
		// �� �÷����� ��� �����͸� ��������
		Set<String> keySet = animalMap.keySet();
		
		for (String key : keySet) {
			Animal animal =  animalMap.get(key);
			System.out.println(animal.toString());
		}
		
		// Ư�� ������ ����
		animalMap.remove("Ǫ��");
		
		// ��� ������ ����
		animalMap.clear();

	} // main

}
