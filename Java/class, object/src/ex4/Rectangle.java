package ex4;

public class Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	int garo = width - x;
	int sero = height - y;
	
	public Rectangle(int x,int y,int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public int square() {
		int square = garo * sero;
		return square;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + "��ġ�� �簢���� ���̴� " + (garo * sero) + "�̴�." );
	}
	
	public boolean contains(Rectangle r) {
		if(x+width  > r.x+ r.width
		&& y+height > r.y+ r.height)
		{
			return true;
		}
		else
			return false;
	}

}
