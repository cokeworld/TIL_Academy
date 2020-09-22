import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04_Map {

	public static void main(String[] args) {
		// Map �÷���: Ű�� ���� ������ ������ �����ϴ� �ڷᱸ��
		// Map(����): Ű, �� ���� �ڷᱸ��. �˻��ӵ�����. Ű�� Set���� ������.
		Map<String, Animal> animalMap = new HashMap<>();
		
		// ���
		animalMap.put("Ǫ��", new Puppy());
		animalMap.put("�����", new Cat());
		animalMap.put("����", new Duck());
		
		// Ű�� ���ؼ� �� ��������
		Animal animal = animalMap.get("Ǫ��");
		animal.speak();
		
		// �� �÷����� ��� �����͸� ��������
		Set<String> keySet = animalMap.keySet();
		for (String key : keySet) {
			Animal animalKey = animalMap.get(key);
			animalKey.speak();
		}
		
		// �����
		animalMap.put("Ǫ��", new Duck());
		System.out.println(animalMap);
		
		// Ư�� ������ ����
		animalMap.remove("Ǫ��");
		System.out.println(animalMap);
		
		// ��� ������ ����
		animalMap.clear();
		System.out.println(animalMap);
	}

}
