package king1;

import java.awt.*;

import javax.swing.*;

public class koing1 extends JFrame implements Icon {
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;

	public int getIconHeight() {
		return this.height;
	}

	public int getIconWidth() {
		return this.width;
	}

	public koing1(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		arg1.fillOval(x, y, width, height);
	}

	public static void main(String[] args) {
		koing1 icon = new koing1(15, 15);
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("king", icon, SwingConstants.CENTER);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(600, 550);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		icon.paintIcon(null, null, 15, 15);
	}

}
