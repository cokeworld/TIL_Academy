

import javax.swing.*;

import java.awt.*;

public class FlowLayoutEx extends JFrame{
	
	FlowLayoutEx() {
		setTitle("FlowLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		
		Container con = getContentPane();
		
		con.setLayout(new FlowLayout());
		con.add(new JButton("add"));
		con.add(new JButton("delete"));
		con.add(new JButton("save"));
		con.add(new JButton("exit"));
		con.add(new JButton("help"));
		con.add(new JButton("send a message"));
		con.add(new JButton("donate"));
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
