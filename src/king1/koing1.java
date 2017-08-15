package king1;

import java.awt.*;
import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public void cre(String tit) {
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("king");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(600, 550);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1().cre("king");
	}
}