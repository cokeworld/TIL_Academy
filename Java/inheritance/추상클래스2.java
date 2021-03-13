package abstractClass_interface;

class Parent {
	private int num;
	
//	Parent() {
//	}
	
	Parent(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Child extends Parent {
	String str;
	
	Child() {
		// �����Ϸ��� ������ ��� �ȿ���
		// ������ ù���ο� �θ�Ŭ������ �⺻������ ȣ�⹮�� ������.
		super(10);
		
		str = "���ڿ�";
		
		
//		setNum(10);
	}
}


class A {
	A() {
		super();
		System.out.println("A");
	}
}
class B extends A {
	B() {
		super();
		System.out.println("B");
	}
}
class C extends B {
	C() {
		super();
		System.out.println("C");
	}
}



public class 추상클래스2 {

	public static void main(String[] args) {
		new C();
		
		//Child child = new Child();
	}

}
