package king1;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;
	String[] borde = new String[] { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST,
			BorderLayout.EAST };
	String[] bn = new String[] { "center", "north", "south", "weat", "east" };

	public koing1() {
		setTitle("king");
		Container container = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < borde.length; i++) {
			container.add(borde[i], new JButton(bn[i]));
		}
		setSize(350, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
