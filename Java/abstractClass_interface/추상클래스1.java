package abstractClass_interface;

/*
객체지향 언어에서 객체간의 관계 2가지
1) is-a (~이다) : 상속 관계 -> 최종 만들어지는 객체는 1개
   강아지는 동물이다. -> A는 B이다. -> A는 B를 상속받는다.
   중학생은 학생이다.
   
2) has-a (~를 가진다) : 포함 관계 -> 최종 만들어지는 객체가 여러개.
   자동차는 엔진을 가진다. -> A는 B를 가진다. -> A는 B를 포함한다.
   내캐릭터는 스워드를 가진다.
*/
abstract class Animal /* extends Object */ {
	// �������(�ʵ�)
	int age;
	String gender;
	
	Animal(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
//	Animal puppy = new Puppy(10, "����");
	
	// �޼ҵ�
	abstract void speak(); // �߻�޼ҵ�
}

interface Robot {
	
	void guardAndRecord(); // ����Ű�� ��ȭ�ϱ� �߻�޼ҵ�
}


class Puppy extends Animal implements Robot {
	private String color;
	
	public Puppy() {
		super(3, "����");
		color = "���";
	}
	
	public Puppy(int age, String gender) {
		super(age, gender);
		color = "���";
	}

	@Override // �޼ҵ� ������
	void speak() {
		System.out.println(age + "�� " + gender + " �������� �۸� ¢�´�");
	}

	@Override
	public void guardAndRecord() {
		System.out.println("����Ű�� ��ȭ�ϱ�");
	}

	@Override
	public String toString() {
		return age + "�� " + gender + " ������";
	}
	
}


class Cat extends Animal {

	Cat() {
		super(2, "����");
	}
	
	Cat(int age, String gender) {
		super(age, gender);
	}

	@Override // �޼ҵ� ������
	void speak() {
		System.out.println(age + "�� " + gender + " ����̰� �߿� ���");
	}

	@Override
	public String toString() {
		return age + "�� " + gender + " �����";
	}
	
}


class Duck extends Animal {
	
	Duck() {
		super(1, "����");
	}
	
	Duck(int age, String gender) {
		super(age, gender);
	}

	@Override // �޼ҵ� ������
	void speak() {
		System.out.println(age + "�� " + gender + " ������ �в� ���");
	}
	
	@Override
	public String toString() {
		return age + "�� " + gender + " ����";
	}
	
}


class Vet { // ���ǻ�
	
//	void giveShot(Puppy puppy) { // �ֻ����
//		// ���������� �ֻ������ �������� ¢�´�.
//		puppy.speak();
//	}
//	
//	void giveShot(Cat cat) { // �ֻ����
//		// ��������� �ֻ������ ����̰� ���.
//		cat.speak();
//	}
	
	void giveShot(Animal animal) { // �ֻ����
		// �������� �����ؼ� ����
		animal.speak();
	} // giveShot

	
}



public class 추상클래스1 {

	public static void main(String[] args) {
		
		// Puppy��ü�� Puppy���������� �����ؼ� �޼ҵ� ȣ��ÿ���
		// ����(�����Ͻð�) ���ε��� �߻���.
//		Puppy puppy = new Puppy();
//		puppy.speak(); // �۸�~!
//		
//		// Puppy��ü�� Animal���������� �����ؼ� �޼ҵ� ȣ��ÿ���
//		// �������ε� �� ����(����ð�) ���ε����� �߻���.
//		Animal animal = new Puppy();
//		// ....
//		//animal = new Cat();
//	
//		animal.speak(); // �۸�~!
//		
//		System.out.println("//////////////////////");
//		
//		Vet vet = new Vet();
//		Puppy poodle = new Puppy();
//		
//		vet.giveShot(poodle);
//		
//		Cat cat = new Cat();
//		vet.giveShot(cat);
//		
//		Duck duck = new Duck();
//		vet.giveShot(duck);
//		
//		///////
//		
//		Robot puppyRobot = new Puppy();
//		puppyRobot.guardAndRecord();
//		
//		Animal ani = (Animal) puppyRobot;
//		ani.speak();
		Puppy puppy = new Puppy(10, "����");
		puppy.speak();
		System.out.println(puppy.toString());
		
	} // main

}
