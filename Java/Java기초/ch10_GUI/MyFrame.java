

import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame{

	public MyFrame() {
		super("대문");
//		setTitle("500x500 스윙 프레임 만들기");
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
//		
//		Container contentPane = frame.getContentPane();
//		
//		Container c = frame.getContentPane();
//		JButton b = new JButton("Click");
//		c.add(b);
//		
//		JPanel p = new JPanel();
//		frame.setContentPane(p);
	}

}
