package jframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex6 extends JFrame {
	
	public Ex6() {
		setTitle("���α׷��� �� - ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		
		JButton btn = new JButton("��ư");
		btn.addActionListener(e -> {
			
			Thread thread = new Thread(() -> {
				
				// synchronized ����� �ѹ��� �� �����常 ���డ��.
				// �Ӱ迵��(Critical Area) �����ϴ� ���.
				synchronized (progressBar) {
					for (int i=0; i<=100; i++) {
						try {
							Thread.sleep(50);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						progressBar.setValue(i);
					} // for
				}
			});
			thread.start();
		});
		
		JPanel contentPane = (JPanel) getContentPane();
		contentPane.add(btn, BorderLayout.CENTER);
		contentPane.add(progressBar, BorderLayout.SOUTH);
		
		setLocationByPlatform(true);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex6();
	} // main

}
