package king1;

import java.awt.*;

import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;
	public koing1() {
		JLabel jLabel= new JLabel("king");
		JFrame  jFrame =new JFrame("k");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jFrame.setVisible(true);
		jFrame.setSize(250,240);
		Container container=jFrame.getContentPane();
		container.add(jLabel);
		container.setBackground(Color.white);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new koing1();
	}

}
