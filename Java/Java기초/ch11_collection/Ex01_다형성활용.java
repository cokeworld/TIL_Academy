public class Ex01_다형성활용 {

	public static void main(String[] args) {

		// Puppy객체를 Puppy참조변수로 저장해서 메소드 호출시에는 정적(컴파일시간) 바인딩만 발생함.
		Puppy puppy = new Puppy();
		puppy.speak();

		// Puppy객체를 Animal참조변수로 저장해서 메소드 호출시에는 정적 바인딩 후 동적(실행시간) 바인딩까지 발생함.
		Animal animal = new Puppy();
		animal.speak();

		// .. 변수 변경
		// 다형성의 강점인 수정 용이한 점을 살림
		// Puppy 데이터 타입 설정시에 Puppy객체만 수정 가능하지만 Animal 데이터 타입 사용시 Puppy, Cat 둘다 사용가능.
		animal = new Cat();
		animal.speak();
		
		System.out.println("////////////////");
		
		Vet vet = new Vet();
		Puppy poodle = new Puppy();
		Cat cat = new Cat();
		vet.주사놓기(poodle);
		vet.주사놓기(cat);
		Animal duck = new Duck();
		vet.주사놓기(duck);
		
		// 인터페이스 상속 객체 구현
		Robot robotPuppy = new RobotPuppy();
		robotPuppy.secure();
	}
}

class Animal {

	int age;
	String gender;
	
	void speak() {
		System.out.println("동물 소리내기");
	}

}

class Puppy extends Animal implements Robot{
	// 생성자 - 선언되지 않으면 컴파일 과정에서 자동 생성
	public Puppy() {

	}

	@Override
	void speak() {
		System.out.println("멍멍");
	}

	@Override
	public void secure() {
		// TODO Auto-generated method stub
		
	}
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println(age + "살" + gender + "고양이가 야옹 운다.");
	}
}

class Duck extends Animal {
	@Override
	void speak() {
		System.out.println(age + "살" + gender + "오리가 꽥꽥 운다.");
	}
}

class Vet {
	
	void 주사놓기(Puppy puppy) {
		// 강아지한테 주사 놓으면 강아지가 짖음
		// 단점- 고양이에게 주사를 놓으려 하면 고양이용 method를 추가 생성해야함.
		puppy.speak();
	}
	
	void 주사놓기(Animal animal) {
		// 상위타입 Animal 사용함으로서 다형성 활용
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
		System.out.println("집지키기 on");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


