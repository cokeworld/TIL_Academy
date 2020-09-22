

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField("홍길동"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("1324123"));
		c.add(new JLabel("학과"));
		c.add(new JTextField("경영학과"));
		c.add(new JLabel("학년"));
		c.add(new JTextField("2"));
		c.add(new JLabel("부전공"));
		c.add(new JTextField("컴퓨터공학과"));
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
