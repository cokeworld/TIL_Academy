import java.util.*;

public class Ex02_Set {

	public static void main(String[] args) {
		
		// 컬렉션: 자료구조 데이터 저장공간
		//		객체만 저장가능(기본자료형 데이터는 저장 불가능함)
		
		// Set(집합): 순서가 없는 자료구조. 중복값 허용 안함.
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set.size());
		System.out.println(set);
		
		Set<String> strSet = new HashSet<>();
		strSet.add("ㄱ");
		strSet.add("ㄴ");
		strSet.add("ㄷ");
		
		for (String name : strSet) {
			System.out.println(name);
		}
		
		// 모두 Object 타입을 기본으로 한다.
		Set<Object> set2 = new HashSet<>();
		set2.add(10);
		set2.add("ㄱ");
		set2.add(new Puppy());
		
		for(Object obj : set2) {
			System.out.println(obj);
		}
		
		set2.remove(1);
		set2.clear();
	}
		
	

}
