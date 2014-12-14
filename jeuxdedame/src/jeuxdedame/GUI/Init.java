package jeuxdedame.GUI;

import javax.swing.JFrame;


public class Init {





	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Plateau());
		f.setVisible(true);

	}

}
