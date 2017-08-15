package king1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class koing1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public koing1(String tit) {
		JFrame jf = new JFrame(tit);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("king  dfdf");
		container.setLayout(null);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true); 
		jf.setSize(600, 550);
		JButton bl = new JButton("on");
		bl.setBounds(10, 10, 100, 21);
		bl.setVisible(true);
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new myj(koing1.this).setVisible(true);
			}
		});
		container.add(bl);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new koing1("k");
	}
}

class myj extends JDialog {
	private static final long serialVersionUID = 1L;

	public myj(koing1 koing1) {
		super();
		Container container = getContentPane();
		container.add(new JLabel("wang"));
		setBounds(120, 120, 100, 100);
	}
}