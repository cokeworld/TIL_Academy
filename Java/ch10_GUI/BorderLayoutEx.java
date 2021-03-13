

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx() {
		setTitle("BorderLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("Top"), BorderLayout.NORTH);
		c.add(new JButton("Bottom"), BorderLayout.SOUTH);
		c.add(new JButton("Right"), BorderLayout.EAST);
		c.add(new JButton("Left"), BorderLayout.WEST);
		
		c.setBackground(Color.blue);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
