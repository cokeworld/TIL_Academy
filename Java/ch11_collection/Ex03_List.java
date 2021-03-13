import java.util.ArrayList;
import java.util.List;

public class Ex03_List {

	public static void main(String[] args) {
		
		// List(목록): 순서가 있는 자료구조. 중복값 허용. 가변크기 배열.
		List<Integer> numList = new ArrayList<>();
		numList.add(1); // index: 0
		numList.add(2); // index: 1
		numList.add(3); // index: 2
		
		System.out.println(numList);
		
		// 특정위치에 요소 삽입
		numList.add(2, 300);

		for (int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i)); 
		}
		
		System.out.println("==========");
		
		// for-each문
		for (int num : numList) {
			System.out.println(num);
		}
	}

}
