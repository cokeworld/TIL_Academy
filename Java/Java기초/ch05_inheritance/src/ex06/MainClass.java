package ex06;

public class MainClass {

	public static void main(String[] args) {
		Weapon wp = new Weapon();
		int damage = wp.fire();
		System.out.println("Weapon damage: " + damage);
		
		Cannon cn = new Cannon();
		damage = cn.fire();
		System.out.println("Cannon damage: " + damage);
	}

}
