package king1;

import java.awt.*;

import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;
	public koing1() {
		setTitle("king");
		JLabel jLabel=new JLabel("wang");
		Container container=getContentPane();
		container.add(jLabel);
		setSize(250,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new koing1();
	}

}
