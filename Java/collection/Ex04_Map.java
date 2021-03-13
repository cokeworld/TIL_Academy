import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04_Map {

	public static void main(String[] args) {
		// Map 컬렉션: 키와 값의 쌍으로 데이터 관리하는 자료구조
		// Map(매핑): 키, 값 쌍의 자료구조. 검색속도빠름. 키가 Set으로 구성됨.
		Map<String, Animal> animalMap = new HashMap<>();
		
		// 등록
		animalMap.put("푸들", new Puppy());
		animalMap.put("고양이", new Cat());
		animalMap.put("오리", new Duck());
		
		// 키를 통해서 값 가져오기
		Animal animal = animalMap.get("푸들");
		animal.speak();
		
		// 맵 컬렉션의 모든 데이터를 가져오기
		Set<String> keySet = animalMap.keySet();
		for (String key : keySet) {
			Animal animalKey = animalMap.get(key);
			animalKey.speak();
		}
		
		// 덮어쓰기
		animalMap.put("푸들", new Duck());
		System.out.println(animalMap);
		
		// 특정 데이터 삭제
		animalMap.remove("푸들");
		System.out.println(animalMap);
		
		// 모든 데이터 삭제
		animalMap.clear();
		System.out.println(animalMap);
	}

}
