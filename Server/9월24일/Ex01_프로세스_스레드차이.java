package java0924_���������;


class Go {
	
	void go() {
		while (true) {
			System.out.println("go");
		}
	}
}

class Come {
	
	void come() {
		while (true) {
			System.out.println("come");
		}
	}
}

public class Ex01_���μ���_���������� {

	public static void main(String[] args) {
		// �½�ũ : �۾�
		// ��Ƽ�½�ŷ : �ѹ��� �������� �۾��� �����ϴ°�.
		
		// ���μ��� : �������� ���α׷� �Ѱ�
		// ������ : ���α׷� �Ѱ� �ȿ��� �����帧 �Ѱ� ����.
		
		Go g = new Go();
		Come c = new Come();
		
		g.go();
		c.come();
		
	} // main

}
