

import javax.swing.*;
import java.awt.*;

public class NullContainerEx2 extends JFrame{
	
	public NullContainerEx2(){
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
		Container c = getContentPane();
		
		JLabel jl = new JLabel("Hello, Press Buttons");
		jl.setLocation(600,200);
		c.add(jl);
		
		for(int i = 1; i < 10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setLocation(i*15,i*5);
			jb.setSize(200,200);
			c.add(jb);
		}
	}
	
	
	public static void main(String[] args) {
		new NullContainerEx2();
	}

}
