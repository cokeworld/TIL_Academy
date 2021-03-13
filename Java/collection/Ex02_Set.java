import java.util.*;

public class Ex02_Set {

	public static void main(String[] args) {
		
		// �÷���: �ڷᱸ�� ������ �������
		//		��ü�� ���尡��(�⺻�ڷ��� �����ʹ� ���� �Ұ�����)
		
		// Set(����): ������ ���� �ڷᱸ��. �ߺ��� ��� ����.
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set.size());
		System.out.println(set);
		
		Set<String> strSet = new HashSet<>();
		strSet.add("��");
		strSet.add("��");
		strSet.add("��");
		
		for (String name : strSet) {
			System.out.println(name);
		}
		
		// ��� Object Ÿ���� �⺻���� �Ѵ�.
		Set<Object> set2 = new HashSet<>();
		set2.add(10);
		set2.add("��");
		set2.add(new Puppy());
		
		for(Object obj : set2) {
			System.out.println(obj);
		}
		
		set2.remove(1);
		set2.clear();
	}
		
	

}
