

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx(){
		
		setTitle("NullContainerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);		
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		for(int i = 1; i<10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setLocation(i*50, i*50);
			jb.setSize(50,20);
			c.add(jb);
		}

	}
	
	
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
