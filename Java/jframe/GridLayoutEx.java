

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
		c.add(new JLabel("�̸�"));
		c.add(new JTextField("ȫ�浿"));
		c.add(new JLabel("�й�"));
		c.add(new JTextField("1324123"));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("�濵�а�"));
		c.add(new JLabel("�г�"));
		c.add(new JTextField("2"));
		c.add(new JLabel("������"));
		c.add(new JTextField("��ǻ�Ͱ��а�"));
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
