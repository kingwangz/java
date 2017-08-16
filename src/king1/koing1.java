package king1;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1() {
		setTitle("king");
		setLayout(null);
		setBounds(0, 0, 200, 150);
		Container container = getContentPane();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		b1.setBounds(10, 30, 80, 30);
		b2.setBounds(60, 70, 100, 20);
		container.add(b1);
		container.add(b2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
