package king1;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1() {
		setTitle("king");
		Container container = getContentPane();
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) {
			container.add(new JButton("king" + i));
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
