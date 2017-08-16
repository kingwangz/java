package king1;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1() {
		JFrame jf = new JFrame();
		JLabel jl = new JLabel("king");
		Container container = jf.getContentPane();
		URL url = koing1.class.getResource("imagebutton.jpg");
		Icon icon = new ImageIcon(url);	
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);	
		container.add(jl);
		jl.setOpaque(true);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(600, 550);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1();
	}

}
