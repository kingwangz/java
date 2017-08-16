package king1;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1() {
		setTitle("king");
		JTextArea ta = new JTextArea(20, 50);
		JScrollPane sp = new JScrollPane(ta);
		Container container = getContentPane();
		container.add(sp);
		setSize(350, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
