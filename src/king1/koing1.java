package king1;

import java.awt.*;

import java.net.*;

import javax.swing.*;
import javax.xml.soap.Text;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1() {
		JLabel jLabel = new JLabel("king");
		JFrame jFrame = new JFrame("k");
		JRadioButton jRadioButton = new JRadioButton("koing");
		//ButtonGroup buttonGroup = new ButtonGroup();
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jFrame.setVisible(true);
		jFrame.setSize(250, 240);
		Container container = jFrame.getContentPane();
		container.setBackground(Color.white);
		//buttonGroup.add(jRadioButton);
		container.add(jRadioButton);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
