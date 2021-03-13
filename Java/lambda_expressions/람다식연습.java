@FunctionalInterface
interface TestInterface {
	public int plusAandB(int a, int b);
}

public class 람다식연습 {

	public static void main(String[] args) {
		
//		�������̽��� ���� Ŭ������ �����ؼ� �޼��� ȣ��
//		TestInterface ti = new TestInterfaceImpl();
//		System.out.println(ti.plusAandB(1, 2));
		
//		Ŭ������ �͸� ������ü�� �����ؼ� �޼ҵ� ����
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
