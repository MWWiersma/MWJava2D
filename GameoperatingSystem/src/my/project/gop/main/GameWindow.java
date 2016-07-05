package my.project.gop.main;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	public GameWindow(String title, int width, int height) {
		//contsructor
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
