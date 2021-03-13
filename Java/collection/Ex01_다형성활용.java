package collection;

public class Ex01_다형성활용 {
	
	public static void main(String[] args) {
	
			// Puppy��ü�� Puppy���������� �����ؼ� �޼ҵ� ȣ��ÿ��� ����(�����Ͻð�) ���ε��� �߻���.
			Puppy puppy = new Puppy();
			puppy.speak();
	
			// Puppy��ü�� Animal���������� �����ؼ� �޼ҵ� ȣ��ÿ��� ���� ���ε� �� ����(����ð�) ���ε����� �߻���.
			Animal animal = new Puppy();
			animal.speak();
	
			// .. ���� ����
			// �������� ������ ���� ������ ���� �츲
			// Puppy ������ Ÿ�� �����ÿ� Puppy��ü�� ���� ���������� Animal ������ Ÿ�� ���� Puppy, Cat �Ѵ� ��밡��.
			animal = new Cat();
			animal.speak();
			
			System.out.println("////////////////");
			
			Vet vet = new Vet();
			Puppy poodle = new Puppy();
			Cat cat = new Cat();
			vet.�ֻ����(poodle);
			vet.�ֻ����(cat);
			Animal duck = new Duck();
			vet.�ֻ����(duck);
			
			// �������̽� ��� ��ü ����
			Robot robotPuppy = new RobotPuppy();
			robotPuppy.secure();
		}
}

class Animal {

	int age;
	String gender;
	
	void speak() {
		System.out.println("���� �Ҹ�����");
	}

}

class Puppy extends Animal implements Robot{
	// ������ - ������� ������ ������ �������� �ڵ� ����
	public Puppy() {

	}

	@Override
	void speak() {
		System.out.println("�۸�");
	}

	@Override
	public void secure() {
		// TODO Auto-generated method stub
		
	}
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println(age + "��" + gender + "����̰� �߿� ���.");
	}
}

class Duck extends Animal {
	@Override
	void speak() {
		System.out.println(age + "��" + gender + "������ �в� ���.");
	}
}

class Vet {
	
	void �ֻ����(Puppy puppy) {
		// ���������� �ֻ� ������ �������� ¢��
		// ����- ����̿��� �ֻ縦 ������ �ϸ� ����̿� method�� �߰� �����ؾ���.
		puppy.speak();
	}
	
	void �ֻ����(Animal animal) {
		// ����Ÿ�� Animal ��������μ� ������ Ȱ��
		animal.speak();
	}
}

// interface
interface Robot {
	
	void secure();
}

class RobotPuppy implements Robot {

	@Override
	public void secure() {
		System.out.println("����Ű�� on");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


