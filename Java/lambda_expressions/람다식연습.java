@FunctionalInterface
interface TestInterface {
	public int plusAandB(int a, int b);
}

public class 람다식연습 {

	public static void main(String[] args) {
		
//		인터페이스를 직접 클래스로 구현해서 메서드 호출
//		TestInterface ti = new TestInterfaceImpl();
//		System.out.println(ti.plusAandB(1, 2));
		
//		클래스를 익명 구현객체로 구현해서 메소드 실행
//		TestInterface ti2 = new TestInterface() {
//
//			@Override
//			public int plusAandB(int a, int b) {
//				return a + b;
//			}
//		};
//		
//		System.out.println(ti2.plusAandB(1, 2));
		
		TestInterface ti3 = (a, b) -> {
			return a+b;	
		};
		System.out.println(ti3.plusAandB(1,2));
	}

}
