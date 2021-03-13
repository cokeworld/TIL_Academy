import java.util.ArrayList;
import java.util.List;

public class Ex03_List {

	public static void main(String[] args) {
		
		// List(���): ������ �ִ� �ڷᱸ��. �ߺ��� ���. ����ũ�� �迭.
		List<Integer> numList = new ArrayList<>();
		numList.add(1); // index: 0
		numList.add(2); // index: 1
		numList.add(3); // index: 2
		
		System.out.println(numList);
		
		// Ư����ġ�� ��� ����
		numList.add(2, 300);

		for (int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i)); 
		}
		
		System.out.println("==========");
		
		// for-each��
		for (int num : numList) {
			System.out.println(num);
		}
	}

}
